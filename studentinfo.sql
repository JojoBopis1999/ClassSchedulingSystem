-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2023 at 05:09 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentinfo`
--

-- --------------------------------------------------------

--
-- Table structure for table `addnewstrand`
--

CREATE TABLE `addnewstrand` (
  `STRAND` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `addnewsubject`
--

CREATE TABLE `addnewsubject` (
  `SUBJECTCODE` varchar(20) NOT NULL,
  `SUBJECT` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `availabletime`
--

CREATE TABLE `availabletime` (
  `time` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `availabletime`
--

INSERT INTO `availabletime` (`time`) VALUES
('7:00-8:00 AM'),
('8:00-9:00 AM'),
('9:00-10:00 AM'),
('10:30-11:30 AM'),
('11:30-12:30 PM'),
('1:00-2:00 PM'),
('2:00-3:00 PM'),
('3:00-4:00 PM');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Position` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Name`, `Username`, `Password`, `Position`) VALUES
(2, 'Jojo Bopis', 'admin', 'aaa', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE `schedule` (
  `ID` int(50) NOT NULL,
  `STRAND` varchar(20) NOT NULL,
  `TEACHER_ID` varchar(20) NOT NULL,
  `DAY` varchar(20) NOT NULL,
  `TIME` varchar(20) NOT NULL,
  `SUBJECT` varchar(20) NOT NULL,
  `TEACHER` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `lrn` int(50) NOT NULL,
  `last` varchar(50) NOT NULL,
  `first` varchar(50) NOT NULL,
  `middle` varchar(50) NOT NULL,
  `age` varchar(10) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `birth` varchar(15) NOT NULL,
  `ip` varchar(10) NOT NULL,
  `street` varchar(50) NOT NULL,
  `brgy` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `province` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  `mother` varchar(50) NOT NULL,
  `father` varchar(50) NOT NULL,
  `guardian` varchar(50) NOT NULL,
  `cell` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `jhs` varchar(50) NOT NULL,
  `completion` varchar(50) NOT NULL,
  `jhsaddress` varchar(50) NOT NULL,
  `strand` varchar(50) NOT NULL,
  `sem` varchar(50) NOT NULL,
  `year1` varchar(50) NOT NULL,
  `year2` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `ID` int(15) NOT NULL,
  `FIRSTNAME` varchar(20) NOT NULL,
  `LASTNAME` varchar(20) NOT NULL,
  `MIDDLEINITIAL` varchar(5) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `CONTACTNUMBER` varchar(15) NOT NULL,
  `SEX` varchar(6) NOT NULL,
  `BIRTHDAY` varchar(10) NOT NULL,
  `RANKING` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `yearandsemester`
--

CREATE TABLE `yearandsemester` (
  `ID` int(10) NOT NULL,
  `SCHOOLYEAR` varchar(15) NOT NULL,
  `SEMESTER` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `yearandsemester`
--

INSERT INTO `yearandsemester` (`ID`, `SCHOOLYEAR`, `SEMESTER`) VALUES
(1, '2019-2020', '1st Semester');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `yearandsemester`
--
ALTER TABLE `yearandsemester`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `ID` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `yearandsemester`
--
ALTER TABLE `yearandsemester`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
