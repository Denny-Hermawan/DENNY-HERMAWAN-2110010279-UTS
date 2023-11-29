-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Nov 2023 pada 19.03
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbresepmasakan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `breakfast`
--

CREATE TABLE `breakfast` (
  `kodemasakan` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `bahan` varchar(100) NOT NULL,
  `approve` varchar(20) NOT NULL,
  `caramasak` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `breakfast`
--

INSERT INTO `breakfast` (`kodemasakan`, `nama`, `bahan`, `approve`, `caramasak`) VALUES
('B001', 'AMERICAN FULL BREAKFAST', '- Telur\n- Sosis\n- Jamur\n- Kentang\n- Mentega', 'Cheft Udin', 'Digoreng Aja Semuanya ');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dessert`
--

CREATE TABLE `dessert` (
  `kodemasakan` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `bahan` varchar(100) NOT NULL,
  `approve` varchar(20) NOT NULL,
  `caramasak` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dessert`
--

INSERT INTO `dessert` (`kodemasakan`, `nama`, `bahan`, `approve`, `caramasak`) VALUES
('D001', 'Pudding Caramel', '- Gula\n- Telur\n- Susu\n- Gelatine', 'Chef Denny', 'Dicampur jadi satu'),
('D002', 'Pudding Vla By Denny', '- Pudding Bubuk\n- Vla Bubuk\n- Gula\n- Air', 'Chef Denny', 'Campur jadi satu semua');

-- --------------------------------------------------------

--
-- Struktur dari tabel `maincourse`
--

CREATE TABLE `maincourse` (
  `kodemasakan` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `bahan` varchar(100) NOT NULL,
  `approve` varchar(20) NOT NULL,
  `caramasak` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `maincourse`
--

INSERT INTO `maincourse` (`kodemasakan`, `nama`, `bahan`, `approve`, `caramasak`) VALUES
('MC001', 'Nasi Goreng', 'Bawang Putih, Ayam Dadu, Sambal Nagor, Telur dan Kecap', 'Chef Denny', 'Dicampur Jadi Satu Aja'),
('MC002', 'Mie Goreng', 'Mie, Bawah Putih, Saos Mie, Telur, Ayam dadu dan Sayur Kangkung', 'Chef Denny', 'Dicampur jadi satu aja');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `breakfast`
--
ALTER TABLE `breakfast`
  ADD PRIMARY KEY (`kodemasakan`);

--
-- Indeks untuk tabel `dessert`
--
ALTER TABLE `dessert`
  ADD PRIMARY KEY (`kodemasakan`);

--
-- Indeks untuk tabel `maincourse`
--
ALTER TABLE `maincourse`
  ADD PRIMARY KEY (`kodemasakan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
