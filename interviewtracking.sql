-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2016 at 12:23 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `interviewtracking`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidate`
--

CREATE TABLE `candidate` (
  `candidateID` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `skill` varchar(100) NOT NULL,
  `uniName` varchar(100) NOT NULL,
  `gpa` float NOT NULL,
  `graduateYear` varchar(4) NOT NULL,
  `dayOfBirth` date NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` int(20) NOT NULL,
  `address` varchar(250) NOT NULL,
  `degree` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `candidate`
--

INSERT INTO `candidate` (`candidateID`, `name`, `skill`, `uniName`, `gpa`, `graduateYear`, `dayOfBirth`, `email`, `phone`, `address`, `degree`) VALUES
(3, 'Dell Vostro', 'Java', 'Columbia', 8.5, '2016', '1975-02-02', 'Clinton@usa.com', 975858888, 'WhiteHouse', 'Big Boss'),
(4, 'Donal Trump', '.Net', 'Columbia Uni', 7.5, '2000', '1950-02-02', 'chipheo.3991@asd.vn', 975858888, 'Boston City', 'Master'),
(5, 'Donal Trump', '.Net', 'Harvard', 0, '2000', '1950-02-02', 'Clinton@usa.com', 975858888, 'New York', 'Master'),
(6, 'JayJay Okocha', 'Freestyle', 'Nigieria', 7.5, '2000', '1975-02-02', 'chipheo.3991@asd.ni', 98561321, 'BlackHouse', 'Bachelor'),
(19, 'asd', 'Troll', 'Number One', 6.69, '2014', '1990-02-26', 'asd@asd.com', 68749841, 'Cambodia', 'Doctor'),
(22, 'Nistelrooy', 'Shoot', 'Amstedam', 9, '2008', '1990-02-26', 'asd@asd.com', 879879, 'Holandddd', 'Footballer'),
(23, 'Solskjaer', 'Position, React', 'Nauy', 8.8, '2009', '1973-02-26', 'ole@mu.vn', 5646789, 'ManchesterU', 'Legend'),
(24, 'Solskjaer', 'Position, React', 'Nauy', 8.8, '2009', '1973-02-26', 'ole@mu.vn', 5646789, 'ManchesterU', 'Legend');

-- --------------------------------------------------------

--
-- Table structure for table `interview`
--

CREATE TABLE `interview` (
  `interviewID` int(11) NOT NULL,
  `date` date NOT NULL,
  `candidateID` int(11) DEFAULT NULL,
  `interviewerID` int(11) NOT NULL,
  `position` varchar(30) NOT NULL,
  `iqTest` int(3) NOT NULL,
  `techTest` int(3) NOT NULL,
  `toeic` int(3) NOT NULL,
  `result` tinyint(1) NOT NULL,
  `source` varchar(100) NOT NULL,
  `notes` varchar(100) NOT NULL,
  `comment` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `interview`
--

INSERT INTO `interview` (`interviewID`, `date`, `candidateID`, `interviewerID`, `position`, `iqTest`, `techTest`, `toeic`, `result`, `source`, `notes`, `comment`) VALUES
(5, '2016-10-10', 22, 3, 'Stricker', 90, 90, 850, 1, 'TechOne', '8 weeks TFT', 'improve tech skills'),
(6, '2015-12-12', 24, 3, 'Sub', 90, 90, 990, 1, 'ManUtd', 'goodluck', 'Congrat');

-- --------------------------------------------------------

--
-- Table structure for table `interviewer`
--

CREATE TABLE `interviewer` (
  `interviewerID` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `username` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `position` varchar(40) NOT NULL,
  `rolename` varchar(30) NOT NULL,
  `enable` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `interviewer`
--

INSERT INTO `interviewer` (`interviewerID`, `name`, `username`, `password`, `position`, `rolename`, `enable`) VALUES
(1, 'Administrator', 'admin', '1234', 'ITS PM', 'ROLE_ADMIN', 1),
(2, 'Interviewer No.01', 'inter01', '1234', 'Senior Consultant', 'ROLE_INTERVIEWER', 1),
(3, 'ProjectManager', 'pm01', '1234', 'ProjectManager', 'ROLE_PM', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidate`
--
ALTER TABLE `candidate`
  ADD PRIMARY KEY (`candidateID`);

--
-- Indexes for table `interview`
--
ALTER TABLE `interview`
  ADD PRIMARY KEY (`interviewID`),
  ADD KEY `interviewerID` (`interviewerID`),
  ADD KEY `candidateID` (`candidateID`);

--
-- Indexes for table `interviewer`
--
ALTER TABLE `interviewer`
  ADD PRIMARY KEY (`interviewerID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `candidate`
--
ALTER TABLE `candidate`
  MODIFY `candidateID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `interview`
--
ALTER TABLE `interview`
  MODIFY `interviewID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `interviewer`
--
ALTER TABLE `interviewer`
  MODIFY `interviewerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `interview`
--
ALTER TABLE `interview`
  ADD CONSTRAINT `interview_ibfk_1` FOREIGN KEY (`candidateID`) REFERENCES `candidate` (`candidateID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `interview_ibfk_2` FOREIGN KEY (`interviewerID`) REFERENCES `interviewer` (`interviewerID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
