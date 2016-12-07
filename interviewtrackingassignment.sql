-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2016 at 11:48 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `interviewtrackingassignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidate`
--

CREATE TABLE `candidate` (
  `id` int(11) NOT NULL,
  `WeekNo` int(11) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `UniName` varchar(50) NOT NULL,
  `Gpa` double NOT NULL,
  `Faculty` varchar(50) NOT NULL,
  `GraduationYear` int(11) NOT NULL,
  `Position` varchar(50) NOT NULL,
  `InterviewDate` date NOT NULL,
  `IQTest` int(11) NOT NULL,
  `TechnicalTest` int(11) NOT NULL,
  `Toeic` int(11) NOT NULL,
  `InterviewResult` tinyint(1) NOT NULL,
  `InterviewComments` varchar(50) NOT NULL,
  `DayOfBirth` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Phone` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Degree` varchar(50) NOT NULL,
  `Sources` varchar(50) NOT NULL,
  `Notes` varchar(50) NOT NULL,
  `InterviewID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `candidate`
--

INSERT INTO `candidate` (`id`, `WeekNo`, `FullName`, `UniName`, `Gpa`, `Faculty`, `GraduationYear`, `Position`, `InterviewDate`, `IQTest`, `TechnicalTest`, `Toeic`, `InterviewResult`, `InterviewComments`, `DayOfBirth`, `Email`, `Phone`, `Address`, `Degree`, `Sources`, `Notes`, `InterviewID`) VALUES
(1, 5, 'Cao Minh Tri', 'inhacromit', 5.5, 'IT', 2016, 'Dev', '2016-12-01', 5, 5, 500, 1, 'bad', '1992-05-26', 'cmt@mail.com', '0123456789', 'HCM', 'Bachelor', 'SS', 'SS', 1),
(2, 0, 'adasd', 'asdas', 0, 'asd', 0, 'asd', '2016-12-06', 0, 0, 0, 0, 'asd', '1990-02-26', 'asdasd', 'asd', 'asd', 'asad', 'asd', 'asd', 1),
(3, 0, 'adasd', 'asdas', 0, 'asd', 0, 'Accountant', '2016-12-06', 0, 0, 0, 0, 'asd', '1990-02-26', 'asdasd', 'asd', 'asd', 'asad', 'asd', 'asd', 1),
(5, 6, 'Hien Than Quang', 'Hoa Sen', 7, 'Java', 2016, 'Engineer', '2016-12-06', 70, 60, 670, 0, 'Poor him', '1990-02-26', 'hien.thanquang@gmail.com', '0975850880', '207 Cong Hoa str, wards 13, Tan Binh dics, HCMC', 'Bechalor', 'from hell', 'a', 1),
(6, 0, 'nonamenot', 'asd', 231, 'asd', 0, 'Cleaner', '2016-12-06', 0, 0, 0, 0, 'error1', '1990-02-26', 'asd@asd.com', 'asd', 'asd', 'asd', 'asd', 'asd', 1),
(7, 0, 'asd', 'asd', 0, 'asd', 0, 'asd', '2016-12-07', 0, 0, 0, 0, 'asd', '1990-01-01', 'abc@xyz.com', 'asd', 'asd', 'asd', 'asd', 'contexr', 22);

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enable` tinyint(1) NOT NULL,
  `roleID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`id`, `name`, `username`, `password`, `enable`, `roleID`) VALUES
(1, 'Nazi', 'nazi', '1234', 1, 1),
(19, 'PM01', 'pm01', '1234', 1, 34),
(21, 'a', 'inter01', '1234', 1, 51),
(22, 'aaaaaaasdasdasd', 'a', 'a', 1, 53);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `roleName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `roleName`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_PM'),
(3, 'ROLE_INTERVIEWER'),
(34, 'ROLE_PM'),
(38, 'ROLE_INTERVIEWER'),
(39, 'ROLE_ADMIN'),
(40, 'ROLE_ADMIN'),
(41, 'ROLE_ADMIN'),
(42, 'ROLE_INTERVIEWER'),
(43, 'ROLE_ADMIN'),
(44, 'ROLE_ADMIN'),
(45, 'ROLE_ADMIN'),
(46, 'ROLE_ADMIN'),
(47, 'ROLE_ADMIN'),
(49, 'ROLE_ADMIN'),
(50, 'ROLE_ADMIN'),
(51, 'ROLE_ADMIN'),
(52, 'ROLE_PM'),
(53, 'ROLE_ADMIN');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidate`
--
ALTER TABLE `candidate`
  ADD PRIMARY KEY (`id`),
  ADD KEY `InterviewID` (`InterviewID`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id`),
  ADD KEY `roleID` (`roleID`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `candidate`
--
ALTER TABLE `candidate`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `candidate`
--
ALTER TABLE `candidate`
  ADD CONSTRAINT `candidate_ibfk_1` FOREIGN KEY (`InterviewID`) REFERENCES `manager` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`roleID`) REFERENCES `role` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
