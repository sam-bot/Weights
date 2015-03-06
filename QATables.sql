CREATE TABLE CalRollWeight
( 
     calWeightID   INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateStamp DATETIME, 
     timeStamp VARCHAR(255),
	 shift	   	   INT,
     workOrder     INT, 
     setNumber     INT, 
     rollWeight    DECIMAL(7, 2),
	 lineNumber	   INT
  ); 

CREATE TABLE ArrRollWeight 
  ( 
     arrWeightID   INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateTimeStamp DATETIME, 
     workOrder     INT, 
     setNumber     INT, 
     rollWeight    DECIMAL(7, 2) 
  ); 

CREATE TABLE CalWeightTotal 
  ( 
     calTotalID       INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateStamp    DATETIME, 
	 timeStamp	  VARCHAR(255),
	 shift			  INT,
	 lineNumber		  INT,
     setNumber        INT, 
     workOrder1       INT, 
     rollsPerSet1     INT, 
     targetSet1Weight DECIMAL(7, 2), 
     actualSet1Weight DECIMAL(7, 2), 
     workOrder2       INT, 
     rollsPerSet2     INT, 
     targetSet2Weight DECIMAL(7, 2), 
     actualSet2Weight DECIMAL(7, 2), 
     percentOfTarget  DECIMAL(7, 2), 
     compound         VARCHAR(255), 
     targetPoundsHour INT, 
     actualPoundsHour DECIMAL(7, 2), 
     lineSpeed        INT 
  ); 

CREATE TABLE ArrWeightTotal 
  ( 
     arrTotalID       INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateTimeStamp    DATETIME, 
     setNumber        INT, 
     workOrder        INT, 
     targetSet1Weight DECIMAL(7, 2), 
     actualSet1Weight DECIMAL(7, 2), 
     targetSet2Weight DECIMAL(7, 2), 
     actualSet2Weight DECIMAL(7, 2), 
     rollsPerSet      INT, 
     percentOfTarget  DECIMAL(7, 2), 
     compound         VARCHAR(255), 
     targetPoundsHour INT, 
     actualPoundsHour INT, 
     lineSpeed        INT 
  ); 

CREATE TABLE CalQaAudit 
  ( 
     calQaID              INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateTimeStamp        DATETIME, 
     setNumber            INT, 
     workOrder            INT, 
     width                VARCHAR(255), 
     rollEnds             VARCHAR(255), 
     coreCentering        VARCHAR(255), 
     coreQuality          VARCHAR(255), 
     wrinkles             VARCHAR(255), 
     dieLines             VARCHAR(255), 
     coldFlow             VARCHAR(255), 
     holes                VARCHAR(255), 
     gels                 VARCHAR(255), 
     rollColor            VARCHAR(255), 
     packaging            VARCHAR(255), 
     pallet               VARCHAR(255), 
     collapserTension     VARCHAR(255), 
     centerStandTension   VARCHAR(255), 
     winderTension        VARCHAR(255), 
     collapserTemperature VARCHAR(255), 
     comments             VARCHAR(255) 
  ); 

  CREATE TABLE CalPelAudit 
  ( 
     calQaID              INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateTimeStamp        DATETIME, 
	 compound			  VARCHAR(255), 
     color                VARCHAR(255), 
     shape             	  VARCHAR(255),
	 pelletSize			  VARCHAR(255),
	 silo                 INT, 
	 batchNumber          INT, 
	 burning	          VARCHAR(255),
	 rework				   VARCHAR(255)
  );
  
CREATE TABLE [dbo].[ArrHousekeeping](
	[arrHouseID] [int] IDENTITY(1,1) NOT NULL,
	[workStation] [varchar](255) NULL,
	[shift] [varchar](255) NULL,
	[dateTimeStamp] [datetime] NULL,
	[sweepMixer] [int] NULL,
	[cleanTrough] [int] NULL,
	[scrapCoreInspection] [int] NULL,
	[extruderScreensCleaned] [int] NULL,
	[scrapUsageVerify] [int] NULL,
	[guardHopperLid] [int] NULL,
	[guardExtruderRight] [int] NULL,
	[guardExtruderLeft] [int] NULL,
	[containmentDoors] [int] NULL,
	[grinderChute] [int] NULL,
	[grinderLatch] [int] NULL,
	[grinderDoor] [int] NULL,
	[winderRightFront] [int] NULL,
	[winderRightRear] [int] NULL,
	[winderLeftFront] [int] NULL,
	[winderLeftRear] [int] NULL,
	[operatorSignature] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[arrHouseID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]


CREATE TABLE CalHousekeeping 
  ( 
     calHouseID        INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateTimeStamp     DATETIME,
     lineNumber		   INT, 
     trashCans         INT, 
     exits             INT, 
     razor             INT, 
     winderSwept       INT, 
     debris            INT, 
     collapser         INT, 
     winderClean       INT, 
     tools             INT, 
     workStation       INT, 
     materials         INT, 
     emergencyExit     INT, 
     mandrels          INT, 
     operatingControls INT, 
     limitSwitches     INT, 
     brakeMechanism    INT, 
     hooks             INT, 
     suspensionLug     INT, 
     chain             INT, 
     operatorSignature VARCHAR(255) 
  ); 

CREATE TABLE ArrHousekeeping 
  ( 
     arrHouseID        INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
     dateTimeStamp     DATETIME, 
     trashCans         INT, 
     exits             INT, 
     razor             INT, 
     winderSwept       INT, 
     debris            INT, 
     collapser         INT, 
     winderClean       INT, 
     tools             INT, 
     workStation       INT, 
     materials         INT, 
     emergencyExit     INT, 
     mandrels          INT, 
     operatingControls INT, 
     limitSwitches     INT, 
     brakeMechanism    INT, 
     hooks             INT, 
     suspensionLug     INT, 
     chain             INT, 
     operatorSignature VARCHAR(255) 
  ); 

DROP TABLE ArrProcessConditions;

  CREATE TABLE ArrProcessLine1
  ( 
     arrProcID1                  INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
	 dateTimeStamp     			DATETIME, 
	 shift                      VARCHAR(255), 
     workStation                VARCHAR(255),
	 operator					VARCHAR(255),
     gauge                      DECIMAL(7, 2), 
	 piw                        DECIMAL(7, 2), 
     formula                    INT, 
	 feetPerRoll				DECIMAL(7, 2), 
	 workOrder1					DECIMAL(7, 2), 
	 workOrder2					DECIMAL(7, 2), 
	 workOrder3					DECIMAL(7, 2), 
	 workOrder4					DECIMAL(7, 2), 
	 jNumber					DECIMAL(7, 2), 
	 tableSpeed					DECIMAL(7, 2), 
     screwSpeed                 DECIMAL(7, 2), 
	 dieNumber					DECIMAL(7, 2), 
     rbTemp                     DECIMAL(7, 2), 
     screenPack                 VARCHAR(255),
     extruderAmps               DECIMAL(7, 2), 
     extruderPSI                DECIMAL(7, 2), 
	 stretch					DECIMAL(7, 2), 
     scrap                      DECIMAL(7, 2), 
     airRingSpeed               DECIMAL(7, 2), 
     airRingTemp                DECIMAL(7, 2), 
	 tempo						DECIMAL(7, 2), 
	 threeP						DECIMAL(7, 2), 
	 drumNip					DECIMAL(7, 2), 
	 horizontalApply			DECIMAL(7, 2), 
	 inflateAirShaft			DECIMAL(7, 2), 
     winderNipRoll              DECIMAL(7, 2), 
	 winderNipSpeed				DECIMAL(7, 2),
	 collapsingShieldSpeed		DECIMAL(7, 2),
	 collapsingShieldTemp		DECIMAL(7, 2),
     plenumTemp                 DECIMAL(7, 2), 
     airRingGap                 DECIMAL(7, 4),
     trimPullerSpeed            DECIMAL(7, 2),
     zone0Set					DECIMAL(7, 2),
	 zone0Act					DECIMAL(7, 2),
	 zone1Set                   DECIMAL(7, 2), 
	 zone1Act                   DECIMAL(7, 2), 
	 zone2Set					DECIMAL(7, 2),
	 zone2Act                   DECIMAL(7, 2),
	 zone3Set					DECIMAL(7, 2),	 
	 zone3Act                   DECIMAL(7, 2), 
	 zone4Set					DECIMAL(7, 2),
	 zone4Act                   DECIMAL(7, 2), 
	 zone5Set					DECIMAL(7, 2),
	 zone5Act                   DECIMAL(7, 2), 
	 zone6Set					DECIMAL(7, 2),
	 zone6Act                   DECIMAL(7, 2),
	 zone7Set					DECIMAL(7, 2),	 
	 zone7Act                   DECIMAL(7, 2),
	 zone8Set					DECIMAL(7, 2),	 
	 zone8Act                   DECIMAL(7, 2), 
	 zone9Set					DECIMAL(7, 2),
	 zone9Act                   DECIMAL(7, 2), 
	 zoneB1Set					DECIMAL(7, 2),
	 zoneB1Act                  DECIMAL(7, 2), 
	 zoneB2Set					DECIMAL(7, 2),
	 zoneB2Act                  DECIMAL(7, 2), 
  ); 
  
     CREATE TABLE ArrProcessLine2
  ( 
     arrProcID2                  INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
	 dateTimeStamp     			DATETIME, 
	 shift                      VARCHAR(255), 
     workStation                VARCHAR(255),
	 operator					VARCHAR(255),
     gauge                      DECIMAL(7, 2), 
	 piw                        DECIMAL(7, 2), 
     formula                    INT, 
	 feetPerRoll				DECIMAL(7, 2), 
	 workOrder1					DECIMAL(7, 2), 
	 workOrder2					DECIMAL(7, 2), 
	 workOrder3					DECIMAL(7, 2), 
	 workOrder4					DECIMAL(7, 2), 
	 jNumber					DECIMAL(7, 2), 
	 tableSpeed					DECIMAL(7, 2), 
     screwSpeed                 DECIMAL(7, 2), 
	 dieNumber					DECIMAL(7, 2), 
     rbTemp                     DECIMAL(7, 2), 
     screenPack                 VARCHAR(255),
     extruderAmps               DECIMAL(7, 2), 
     extruderPSI                DECIMAL(7, 2), 
	 stretch					DECIMAL(7, 2), 
     scrap                      DECIMAL(7, 2), 
     airRingSpeed               DECIMAL(7, 2), 
     airRingTemp                DECIMAL(7, 2), 
	 drumNip					DECIMAL(7, 2), 
     winderNipRoll              DECIMAL(7, 2), 
	 winderNipSpeed				DECIMAL(7, 2),
	 collapsingShieldSpeed		DECIMAL(7, 2),
	 collapsingShieldTemp		DECIMAL(7, 2),
     plenumTemp                 DECIMAL(7, 2), 
     airRingGap                 DECIMAL(7, 4),
	 fingerAdjustLeft			DECIMAL(7, 2),
	 fingerAdjustRight			DECIMAL(7, 2),
     trimPullerSpeed            DECIMAL(7, 2),
	 mandrelAirPressure			DECIMAL(7, 2),
	 zone1Set                   DECIMAL(7, 2), 
	 zone1Act                   DECIMAL(7, 2), 
	 zone2Set					DECIMAL(7, 2),
	 zone2Act                   DECIMAL(7, 2),
	 zone3Set					DECIMAL(7, 2),	 
	 zone3Act                   DECIMAL(7, 2), 
	 zone4Set					DECIMAL(7, 2),
	 zone4Act                   DECIMAL(7, 2), 
	 zone5Set					DECIMAL(7, 2),
	 zone5Act                   DECIMAL(7, 2), 
	 zone6Set					DECIMAL(7, 2),
	 zone6Act                   DECIMAL(7, 2),
	 zone7Set					DECIMAL(7, 2),	 
	 zone7Act                   DECIMAL(7, 2),
	 zone8Set					DECIMAL(7, 2),	 
	 zone8Act                   DECIMAL(7, 2), 
	 zone9Set					DECIMAL(7, 2),
	 zone9Act                   DECIMAL(7, 2), 
	 zone10Set					DECIMAL(7, 2),
	 zone10Act                  DECIMAL(7, 2), 
	 zone11Set					DECIMAL(7, 2),
	 zone11Act                  DECIMAL(7, 2), 
	 zone12Set					DECIMAL(7, 2),
	 zone12Act                  DECIMAL(7, 2), 
	 zone13Set					DECIMAL(7, 2),
	 zone13Act                  DECIMAL(7, 2)
  );   
  
  CREATE TABLE ArrProcessLine3
  ( 
     arrProcID3                  INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
	 dateTimeStamp     			DATETIME, 
	 shift                      VARCHAR(255), 
     workStation                VARCHAR(255),
	 operator					VARCHAR(255),
     gauge                      DECIMAL(7, 2), 
	 piw                        DECIMAL(7, 2), 
     formula                    INT, 
	 feetPerRoll				DECIMAL(7, 2), 
	 workOrder1					DECIMAL(7, 2), 
	 workOrder2					DECIMAL(7, 2), 
	 workOrder3					DECIMAL(7, 2), 
	 workOrder4					DECIMAL(7, 2), 
	 jNumber					DECIMAL(7, 2), 
	 tableSpeed					DECIMAL(7, 2), 
     screwSpeed                 DECIMAL(7, 2), 
	 dieNumber					DECIMAL(7, 2), 
     rbTemp                     DECIMAL(7, 2), 
     screenPack                 VARCHAR(255),
     extruderAmps               DECIMAL(7, 2), 
	 stretch					DECIMAL(7, 2), 
     scrap                      DECIMAL(7, 2), 
	 drumTemp					DECIMAL(7, 2), 
	 pinchRollTemp				DECIMAL(7, 2), 
     airRingSpeed               DECIMAL(7, 2), 
     airRingTemp                DECIMAL(7, 2), 
	 trimLeftMeasure			DECIMAL(7, 2),
	 trimRightMeasure			DECIMAL(7, 2),
     airRingGap                 DECIMAL(7, 4),
     trimPullerSpeed            DECIMAL(7, 2),
     feedValves                 VARCHAR(255), 
     doors                      VARCHAR(255), 
	 zone1Set                   DECIMAL(7, 2), 
	 zone1Act                   DECIMAL(7, 2), 
	 zone2Set					DECIMAL(7, 2),
	 zone2Act                   DECIMAL(7, 2),
	 zone3Set					DECIMAL(7, 2),	 
	 zone3Act                   DECIMAL(7, 2), 
	 zone4Set					DECIMAL(7, 2),
	 zone4Act                   DECIMAL(7, 2), 
	 zone5Set					DECIMAL(7, 2),
	 zone5Act                   DECIMAL(7, 2), 
	 zone6Set					DECIMAL(7, 2),
	 zone6Act                   DECIMAL(7, 2),
	 zone8Set					DECIMAL(7, 2),	 
	 zone8Act                   DECIMAL(7, 2), 
	 zone9Set					DECIMAL(7, 2),
	 zone9Act                   DECIMAL(7, 2), 
	 zone10Set					DECIMAL(7, 2),
	 zone10Act                  DECIMAL(7, 2)
  );   
  
  
    CREATE TABLE ArrProcessLine4
  ( 
     arrProcID4                  INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
	 dateTimeStamp     			DATETIME, 
	 shift                      VARCHAR(255), 
     workStation                VARCHAR(255),
	 operator					VARCHAR(255),
     gauge                      DECIMAL(7, 2), 
	 piw                        DECIMAL(7, 2), 
     formula                    INT, 
	 feetPerRoll				DECIMAL(7, 2), 
	 workOrder1					DECIMAL(7, 2), 
	 workOrder2					DECIMAL(7, 2), 
	 workOrder3					DECIMAL(7, 2), 
	 workOrder4					DECIMAL(7, 2), 
	 jNumber					DECIMAL(7, 2), 
	 tableSpeed					DECIMAL(7, 2), 
     screwSpeed                 DECIMAL(7, 2), 
	 dieNumber					DECIMAL(7, 2), 
     rbTemp                     DECIMAL(7, 2), 
     screenPack                 VARCHAR(255),
     extruderAmps               DECIMAL(7, 2), 
	 stretch					DECIMAL(7, 2), 
     scrap                      DECIMAL(7, 2), 
	 drumTemp					DECIMAL(7, 2), 
	 pinchRollTemp				DECIMAL(7, 2), 
     airRingSpeed               DECIMAL(7, 2), 
     airRingTemp                DECIMAL(7, 2), 
	 trimLeftMeasure			DECIMAL(7, 2),
	 trimRightMeasure			DECIMAL(7, 2),
     airRingGap                 DECIMAL(7, 4),
     trimPullerSpeed            DECIMAL(7, 2),
     feedValves                 VARCHAR(255), 
     doors                      VARCHAR(255), 
	 zone1Set                   DECIMAL(7, 2), 
	 zone1Act                   DECIMAL(7, 2), 
	 zone2Set					DECIMAL(7, 2),
	 zone2Act                   DECIMAL(7, 2),
	 zone3Set					DECIMAL(7, 2),	 
	 zone3Act                   DECIMAL(7, 2), 
	 zone4Set					DECIMAL(7, 2),
	 zone4Act                   DECIMAL(7, 2), 
	 zone5Set					DECIMAL(7, 2),
	 zone5Act                   DECIMAL(7, 2), 
	 zone6Set					DECIMAL(7, 2),
	 zone6Act                   DECIMAL(7, 2),
	 zone8Set					DECIMAL(7, 2),	 
	 zone8Act                   DECIMAL(7, 2), 
	 zone9Set					DECIMAL(7, 2),
	 zone9Act                   DECIMAL(7, 2), 
	 zone10Set					DECIMAL(7, 2),
	 zone10Act                  DECIMAL(7, 2)
  ); 

  USE [CAL_QA]
GO

/****** Object:  Table [dbo].[ArrProcessLine6]    Script Date: 01/14/2015 13:18:05 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[ArrProcessLine6]') AND type in (N'U'))
DROP TABLE [dbo].[ArrProcessLine6]
GO

USE [CAL_QA]
GO

/****** Object:  Table [dbo].[ArrProcessLine6]    Script Date: 01/14/2015 13:18:06 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[ArrProcessLine6](
	[arrProcID6] [int] IDENTITY(1,1) NOT NULL,
	[dateTimeStamp] [datetime] NULL,
	[shift] [varchar](255) NULL,
	[workStation] [varchar](255) NULL,
	[operator] [varchar](255) NULL,
	[gauge] [decimal](7, 2) NULL,
	[piw] [decimal](7, 2) NULL,
	[formula] [int] NULL,
	[feetPerRoll] [decimal](7, 2) NULL,
	[workOrder1] [decimal](7, 2) NULL,
	[workOrder2] [decimal](7, 2) NULL,
	[workOrder3] [decimal](7, 2) NULL,
	[workOrder4] [decimal](7, 2) NULL,
	[jNumber] [decimal](7, 2) NULL,
	[primeNipSpeed] [decimal](7, 2) NULL,
	[secondNipSpeed] [decimal](7, 2) NULL,
	[primeWinderSpeed] [decimal](7, 2) NULL,
	[secondWinderSpeed] [decimal](7, 2) NULL,
	[screwSpeed] [decimal](7, 2) NULL,
	[rbTemp] [decimal](7, 2) NULL,
	[screenPack] [varchar](255) NULL,
	[extruderAmps] [decimal](7, 2) NULL,
	[extruderPSI] [decimal](7, 2) NULL,
	[scrap] [decimal](7, 2) NULL,
	[airRingSpeed] [decimal](7, 2) NULL,
	[airRingTemp] [decimal](7, 2) NULL,
	[winderNipRoll] [decimal](7, 2) NULL,
	[mixDropTemp] [decimal](7, 2) NULL,
	[plenumTemp] [decimal](7, 2) NULL,
	[plenumSpeed] [decimal](7, 2) NULL,
	[airRingGap] [decimal](7, 4) NULL,
	[trimPullerSpeed] [decimal](7, 2) NULL,
	[feedValves] [varchar](255) NULL,
	[doors] [varchar](255) NULL,
	[feedValvesOpenPercent] [decimal](7, 2) NULL,
	[zone1Set] [decimal](7, 2) NULL,
	[zone1Act] [decimal](7, 2) NULL,
	[zone2Set] [decimal](7, 2) NULL,
	[zone2Act] [decimal](7, 2) NULL,
	[zone3Set] [decimal](7, 2) NULL,
	[zone3Act] [decimal](7, 2) NULL,
	[zone4Set] [decimal](7, 2) NULL,
	[zone4Act] [decimal](7, 2) NULL,
	[zone5Set] [decimal](7, 2) NULL,
	[zone5Act] [decimal](7, 2) NULL,
	[zone6Set] [decimal](7, 2) NULL,
	[zone6Act] [decimal](7, 2) NULL,
	[zone7aSet] [decimal](7, 2) NULL,
	[zone7aAct] [decimal](7, 2) NULL,
	[zone7bSet] [decimal](7, 2) NULL,
	[zone7bAct] [decimal](7, 2) NULL,
	[zone7cSet] [decimal](7, 2) NULL,
	[zone7cAct] [decimal](7, 2) NULL,
	[zone8Set] [decimal](7, 2) NULL,
	[zone8Act] [decimal](7, 2) NULL,
	[zone9Set] [decimal](7, 2) NULL,
	[zone9Act] [decimal](7, 2) NULL,
	[zone10Set] [decimal](7, 2) NULL,
	[zone10Act] [decimal](7, 2) NULL,
	[coreOutDiameterPrimary] [decimal](7, 2) NULL,
	[rollLengthPrimary] [decimal](7, 2) NULL,
	[endRollWarningPrimary] [decimal](7, 2) NULL,
	[endRollTransferPrimary] [decimal](7, 2) NULL,
	[forceSetPointPrimary] [decimal](7, 2) NULL,
	[drumToNipTrimPrimary] [decimal](7, 2) NULL,
	[coreOutDiameterSecondary] [decimal](7, 2) NULL,
	[rollLengthSecondary] [decimal](7, 2) NULL,
	[endRollWarningSecondary] [decimal](7, 2) NULL,
	[endRollTransferSecondary] [decimal](7, 2) NULL,
	[forceSetPointSecondary] [decimal](7, 2) NULL,
	[drumToNipTrimSecondary] [decimal](7, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[arrProcID6] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO



  
  CREATE TABLE ArrProcessLine7
  ( 
     arrProcID7                  INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
	 dateTimeStamp     			DATETIME, 
	 shift                      VARCHAR(255), 
     workStation                VARCHAR(255),
	 operator					VARCHAR(255),
     gauge                      DECIMAL(7, 2), 
	 piw                        DECIMAL(7, 2), 
     formula                    INT, 
	 feetPerRoll				DECIMAL(7, 2), 
	 workOrder1					DECIMAL(7, 2), 
	 workOrder2					DECIMAL(7, 2), 
	 workOrder3					DECIMAL(7, 2), 
	 workOrder4					DECIMAL(7, 2), 
	 jNumber					DECIMAL(7, 2), 
	 tableSpeed					DECIMAL(7, 2), 
     screwSpeed                 DECIMAL(7, 2), 
	 dieNumber					DECIMAL(7, 2), 
     rbTemp                     DECIMAL(7, 2), 
     screenPack                 VARCHAR(255),
     extruderAmps               DECIMAL(7, 2), 
	 stretch					DECIMAL(7, 2), 
     scrap                      DECIMAL(7, 2), 
	 drumTemp					DECIMAL(7, 2), 
	 pinchRollTemp				DECIMAL(7, 2), 
     airRingSpeed               DECIMAL(7, 2), 
	 trimLeftMeasure			DECIMAL(7, 2),
	 trimRightMeasure			DECIMAL(7, 2),
     airRingGap                 DECIMAL(7, 4),
	 curtainLinks				DECIMAL(7, 2),
     trimPullerSpeed            DECIMAL(7, 2),
     feedValves                 VARCHAR(255), 
	 zone1Set                   DECIMAL(7, 2), 
	 zone1Act                   DECIMAL(7, 2), 
	 zone2Set					DECIMAL(7, 2),
	 zone2Act                   DECIMAL(7, 2),
	 zone3Set					DECIMAL(7, 2),	 
	 zone3Act                   DECIMAL(7, 2), 
	 zone4Set					DECIMAL(7, 2),
	 zone4Act                   DECIMAL(7, 2), 
	 zone5Set					DECIMAL(7, 2),
	 zone5Act                   DECIMAL(7, 2), 
	 zone6Set					DECIMAL(7, 2),
	 zone6Act                   DECIMAL(7, 2),
	 zone7Set					DECIMAL(7, 2),	 
	 zone7Act                   DECIMAL(7, 2),
	 zone8Set					DECIMAL(7, 2),	 
	 zone8Act                   DECIMAL(7, 2), 
	 zone9Set					DECIMAL(7, 2),
	 zone9Act                   DECIMAL(7, 2), 
	 zone10Set					DECIMAL(7, 2),
	 zone10Act                  DECIMAL(7, 2), 
	 zone11Set					DECIMAL(7, 2),
	 zone11Act                  DECIMAL(7, 2), 
	 hotRoll1Set                DECIMAL(7, 2), 
	 hotRoll1Act                DECIMAL(7, 2), 
	 hotRoll2Set                DECIMAL(7, 2), 
	 hotRoll2Act                DECIMAL(7, 2), 
	 chillRollSet               DECIMAL(7, 2), 
	 chillRollAct               DECIMAL(7, 2)
	 );  

  CREATE TABLE ArrProcessLine8
  ( 
     arrProcID8                  INT NOT NULL PRIMARY KEY IDENTITY(1, 1), 
	 dateTimeStamp     			DATETIME, 
	 shift                      VARCHAR(255), 
     workStation                VARCHAR(255),
	 operator					VARCHAR(255),
     gauge                      DECIMAL(7, 2), 
	 piw                        DECIMAL(7, 2), 
     formula                    INT, 
	 feetPerRoll				DECIMAL(7, 2), 
	 workOrder1					DECIMAL(7, 2), 
	 workOrder2					DECIMAL(7, 2), 
	 workOrder3					DECIMAL(7, 2), 
	 workOrder4					DECIMAL(7, 2), 
	 jNumber					DECIMAL(7, 2), 
	 tableSpeed					DECIMAL(7, 2), 
     screwSpeed                 DECIMAL(7, 2), 
	 dieNumber					DECIMAL(7, 2), 
     rbTemp                     DECIMAL(7, 2), 
     screenPack                 VARCHAR(255),
     extruderAmps               DECIMAL(7, 2), 
	 stretch					DECIMAL(7, 2), 
     scrap                      DECIMAL(7, 2), 
	 drumTemp					DECIMAL(7, 2), 
	 pinchRollTemp				DECIMAL(7, 2), 
     airRingSpeed               DECIMAL(7, 2), 
	 trimLeftMeasure			DECIMAL(7, 2),
	 trimRightMeasure			DECIMAL(7, 2),
     airRingGap                 DECIMAL(7, 4),
	 curtainLinks				DECIMAL(7, 2),
     feedValves                 VARCHAR(255), 
	 zone1Set                   DECIMAL(7, 2), 
	 zone1Act                   DECIMAL(7, 2), 
	 zone2Set					DECIMAL(7, 2),
	 zone2Act                   DECIMAL(7, 2),
	 zone3Set					DECIMAL(7, 2),	 
	 zone3Act                   DECIMAL(7, 2), 
	 zone4Set					DECIMAL(7, 2),
	 zone4Act                   DECIMAL(7, 2), 
	 zone5Set					DECIMAL(7, 2),
	 zone5Act                   DECIMAL(7, 2), 
	 zone6Set					DECIMAL(7, 2),
	 zone6Act                   DECIMAL(7, 2),
	 zone7Set					DECIMAL(7, 2),	 
	 zone7Act                   DECIMAL(7, 2),
	 zone8Set					DECIMAL(7, 2),	 
	 zone8Act                   DECIMAL(7, 2), 
	 zone9Set					DECIMAL(7, 2),
	 zone9Act                   DECIMAL(7, 2), 
	 zone10Set					DECIMAL(7, 2),
	 zone10Act                  DECIMAL(7, 2), 
	 zone11Set					DECIMAL(7, 2),
	 zone11Act                  DECIMAL(7, 2), 
	 hotRoll1Set                DECIMAL(7, 2), 
	 hotRoll1Act                DECIMAL(7, 2), 
	 hotRoll2Set                DECIMAL(7, 2), 
	 hotRoll2Act                DECIMAL(7, 2), 
	 chillRollSet               DECIMAL(7, 2), 
	 chillRollAct               DECIMAL(7, 2)
	 ); 
  
  
  -- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 05/29/2014
-- Description:	Insert into Weight Total
-- =============================================
CREATE PROCEDURE CalWeightTotalInsert 
	-- Add the parameters for the stored procedure here
	@dateStamp DATE = NULL, 
	@timeStamp varchar(50) = NULL,
	@shift INT = 0,
	@lineNumber INT= 0,
    @setNumber INT= 0, 
     @workOrder1 INT= 0, 
     @rollsPerSet1 INT= 0, 
     @targetSet1Weight DECIMAL(7, 2)= 0, 
     @actualSet1Weight DECIMAL(7, 2)= 0, 
     @workOrder2       INT= 0, 
     @rollsPerSet2     INT= 0, 
     @targetSet2Weight DECIMAL(7, 2)= 0, 
     @actualSet2Weight DECIMAL(7, 2)= 0, 
     @percentOfTarget  DECIMAL(7, 2)= 0, 
     @compound         VARCHAR(255) = NULL, 
     @targetPoundsHour DECIMAL(7, 2) = 0, 
     @actualPoundsHour DECIMAL(7, 2) = 0, 
     @lineSpeed        INT = 0 
	
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO CalWeightTotal
	(
	 dateStamp , 
	 timeStamp,
	 shift,
	 lineNumber,
     setNumber, 
     workOrder1, 
     rollsPerSet1, 
     targetSet1Weight, 
     actualSet1Weight, 
     workOrder2, 
     rollsPerSet2, 
     targetSet2Weight, 
     actualSet2Weight, 
     percentOfTarget, 
     compound, 
     targetPoundsHour, 
     actualPoundsHour, 
     lineSpeed
	)
	VALUES
	(
	 @dateStamp , 
	 @timeStamp,
	 @shift,
	 @lineNumber,
     @setNumber, 
     @workOrder1, 
     @rollsPerSet1, 
     @targetSet1Weight, 
     @actualSet1Weight, 
     @workOrder2, 
     @rollsPerSet2, 
     @targetSet2Weight, 
     @actualSet2Weight, 
     @percentOfTarget, 
     @compound, 
     @targetPoundsHour, 
     @actualPoundsHour, 
     @lineSpeed
	)
END
GO

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 05/29/2014
-- Description:	Select Previous Sets
-- =============================================
CREATE PROCEDURE SelectCalWeightTotal 
	-- Add the parameters for the stored procedure here
	@dateStamp DATE = NULL, 
	@setNumber int = 0,
	@shift int =0,
	@lineNumber int = 0
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT percentOfTarget, targetPoundsHour, actualPoundsHour, lineSpeed
	FROM CalWeightTotal 
	WHERE dateStamp = @dateStamp
	AND setNumber = @setNumber
	AND shift = @shift
	AND lineNumber = @lineNumber
END
GO

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 05/29/2014
-- Description:	Select Previous Roll Weights
-- =============================================
CREATE PROCEDURE SelectCalRollWeight 
	-- Add the parameters for the stored procedure here
	@dateStamp varchar(50) = NULL, 
	@setNumber int = 0,
	@shift int =0,
	@lineNumber int=0
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT dateStamp, timeStamp, shift, workorder, setNumber, rollWeight
	FROM CalRollWeight 
	WHERE dateStamp = @dateStamp
	AND setNumber = @setNumber
	AND shift = @shift
	AND lineNumber = @lineNumber
END
GO

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 05/29/2014
-- Description:	Insert values into QA Audit table
-- =============================================
CREATE PROCEDURE InsertCalQaAudit 
	-- Add the parameters for the stored procedure here
	@dateTimeStamp DATE = NULL, 
	@setNumber int = 0,
	@workOrder            INT = 0, 
    @width                VARCHAR(255) = NULL, 
    @rollEnds             VARCHAR(255) = NULL, 
    @coreCentering        VARCHAR(255) = NULL, 
    @coreQuality          VARCHAR(255)= NULL, 
    @wrinkles             VARCHAR(255)= NULL, 
    @dieLines             VARCHAR(255)= NULL, 
    @coldFlow             VARCHAR(255)= NULL, 
    @holes                VARCHAR(255)= NULL, 
    @gels                 VARCHAR(255)= NULL, 
    @rollColor            VARCHAR(255)= NULL, 
    @packaging            VARCHAR(255)= NULL, 
    @pallet               VARCHAR(255)= NULL, 
    @collapserTension     VARCHAR(255)= NULL, 
    @centerStandTension   VARCHAR(255)= NULL, 
    @winderTension        VARCHAR(255)= NULL, 
    @collapserTemperature VARCHAR(255)= NULL, 
    @comments             VARCHAR(255)= NULL 
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO CalQaAudit 
	(
     dateTimeStamp, 
     setNumber, 
     workOrder, 
     width, 
     rollEnds, 
     coreCentering, 
     coreQuality, 
     wrinkles, 
     dieLines, 
     coldFlow, 
     holes, 
     gels, 
     rollColor, 
     packaging, 
     pallet, 
     collapserTension, 
     centerStandTension, 
     winderTension, 
     collapserTemperature, 
     comments 
	)
	VALUES
	(
	 @dateTimeStamp, 
     @setNumber, 
     @workOrder, 
     @width, 
     @rollEnds, 
     @coreCentering, 
     @coreQuality, 
     @wrinkles, 
     @dieLines, 
     @coldFlow, 
     @holes, 
     @gels, 
     @rollColor, 
     @packaging, 
     @pallet, 
     @collapserTension, 
     @centerStandTension, 
     @winderTension, 
     @collapserTemperature, 
     @comments 
	)
END
GO

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 05/29/2014
-- Description:	Insert Housekeeping Checklist
-- =============================================
CREATE PROCEDURE InsertCalHousekeeping 
	-- Add the parameters for the stored procedure here
	@dateTimeStamp DATE = NULL, 
	@trashCans INT = 0,
	@exits             INT= 0, 
     @razor             INT= 0, 
     @winderSwept       INT= 0, 
     @debris            INT= 0, 
     @collapser         INT= 0, 
     @winderClean       INT= 0, 
     @tools             INT= 0, 
     @workStation       INT= 0, 
     @materials         INT= 0, 
     @emergencyExit     INT= 0, 
     @mandrels          INT= 0, 
     @operatingControls INT= 0, 
     @limitSwitches     INT= 0, 
     @brakeMechanism    INT= 0, 
     @hooks             INT= 0, 
     @suspensionLug     INT= 0, 
     @chain             INT= 0, 
     @operatorSignature VARCHAR(255) = NULL
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO CalHousekeeping 
	(
	dateTimeStamp, 
     trashCans, 
     exits, 
     razor, 
     winderSwept, 
     debris, 
     collapser, 
     winderClean, 
     tools, 
     workStation, 
     materials, 
     emergencyExit, 
     mandrels, 
     operatingControls, 
     limitSwitches, 
     brakeMechanism, 
     hooks, 
     suspensionLug, 
     chain, 
     operatorSignature
	)
	VALUES
	(
	 @dateTimeStamp, 
     @trashCans, 
     @exits, 
     @razor, 
     @winderSwept, 
     @debris, 
     @collapser, 
     @winderClean, 
     @tools, 
     @workStation, 
     @materials, 
     @emergencyExit, 
     @mandrels, 
     @operatingControls, 
     @limitSwitches, 
     @brakeMechanism, 
     @hooks, 
     @suspensionLug, 
     @chain, 
     @operatorSignature
	)
END
GO


-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 05/29/2014
-- Description:	Select Previous Roll Weights
-- =============================================
CREATE PROCEDURE SelectCalRollWeightNoSet 
	-- Add the parameters for the stored procedure here
	@dateStamp DATE = NULL, 
	@shift int =0,
	@lineNumber int=0
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT dateStamp, timeStamp, shift, workorder, setNumber, rollWeight
	FROM CalRollWeight 
	WHERE dateStamp = @dateStamp
	AND shift = @shift
	AND lineNumber = @lineNumber
END
GO

USE [CAL_QA]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 11/03/2014
-- Description:	Insert values into Pelletizer Audit table
-- =============================================
CREATE PROCEDURE [dbo].[InsertCalPelAudit] 
	-- Add the parameters for the stored procedure here
	@dateTimeStamp dateTime = NULL, 
	@compound      VARCHAR(255) = NULL, 
	@color		   VARCHAR(255) = NULL,    
	@shape         VARCHAR(255) = NULL, 
	@pelletSize    VARCHAR(255) = NULL, 
	@silo          INT  = 0,
	@batchNumber   INT  = 0,
	@burning       VARCHAR(255) = NULL, 
	@rework        VARCHAR(255) = NULL 

 
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO CalPelAudit 
	(
     dateTimeStamp, 
     compound,
     color,
     shape,
     pelletSize,
     silo,
     batchNumber,
     burning,
     rework
	)
	VALUES
	(
	 @dateTimeStamp, 
     @compound,
     @color,
     @shape,
     @pelletSize,
     @silo,
     @batchNumber,
     @burning,
     @rework
	)
END

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 01-05-15
-- Description:	Insert intoArrProcessLine1
-- =============================================
CREATE PROCEDURE InsertArrProcessLine1 
	-- Add the parameters for the stored procedure here
	@dateTimeStamp DATETIME = NULL, 
	@shift VARCHAR(255) = NULL,
	@workStation VARCHAR(255) = NULL,
	@operator VARCHAR(255) = NULL,
	@gauge DECIMAL(7, 2)= 0, 
	@piw DECIMAL(7, 2)= 0, 
	@formula DECIMAL(7, 2)= 0, 
	@feetPerRoll DECIMAL(7, 2)= 0, 
	@workOrder1 DECIMAL(7, 2)= 0, 
	@workOrder2 DECIMAL(7, 2)= 0, 
	@workOrder3 DECIMAL(7, 2)= 0, 
	@workOrder4 DECIMAL(7, 2)= 0, 
	@jNumber DECIMAL(7, 2)= 0, 
	@tableSpeed DECIMAL(7, 2)= 0, 
	@screwSpeed DECIMAL(7, 2)= 0, 
	@dieNumber DECIMAL(7, 2)= 0, 
	@rbTemp DECIMAL(7, 2)= 0, 
	@screenPack DECIMAL(7, 2)= 0, 
	@extruderAmps DECIMAL(7, 2)= 0, 
	@extruderPSI DECIMAL(7, 2)= 0, 
	@stretch DECIMAL(7, 2)= 0, 
	@scrap DECIMAL(7, 2)= 0, 
	@airRingSpeed DECIMAL(7, 2)= 0, 
	@airRingTemp DECIMAL(7, 2)= 0, 
	@tempo DECIMAL(7, 2)= 0, 
	@threeP DECIMAL(7, 2)= 0, 
	@drumNip DECIMAL(7, 2)= 0, 
	@horizontalApply DECIMAL(7, 2)= 0, 
	@inflateAirShaft DECIMAL(7, 2)= 0, 
	@winderNipRoll DECIMAL(7, 2)= 0, 
	@winderNipSpeed DECIMAL(7, 2)= 0, 
	@collapsingShieldSpeed DECIMAL(7, 2)= 0, 
	@collapsingShieldTemp DECIMAL(7, 2)= 0, 
	@plenumTemp DECIMAL(7, 2)= 0, 
	@airRingGap DECIMAL(7, 2)= 0, 
	@trimPullerSpeed DECIMAL(7, 2)= 0, 
	@zone0Set DECIMAL(7, 2)= 0, 
	@zone0Act DECIMAL(7, 2)= 0, 
	@zone1Set DECIMAL(7, 2)= 0, 
	@zone1Act DECIMAL(7, 2)= 0, 
	@zone2Set DECIMAL(7, 2)= 0, 
	@zone2Act DECIMAL(7, 2)= 0, 
	@zone3Set DECIMAL(7, 2)= 0, 
	@zone3Act DECIMAL(7, 2)= 0, 
	@zone4Set DECIMAL(7, 2)= 0, 
	@zone4Act DECIMAL(7, 2)= 0, 
	@zone5Set DECIMAL(7, 2)= 0, 
	@zone5Act DECIMAL(7, 2)= 0, 
	@zone6Set DECIMAL(7, 2)= 0, 
	@zone6Act DECIMAL(7, 2)= 0, 
	@zone7Set DECIMAL(7, 2)= 0, 
	@zone7Act DECIMAL(7, 2)= 0, 
	@zone8Set DECIMAL(7, 2)= 0, 
	@zone8Act DECIMAL(7, 2)= 0, 
	@zone9Set DECIMAL(7, 2)= 0, 
	@zone9Act DECIMAL(7, 2)= 0, 
	@zoneB1Set DECIMAL(7, 2)= 0, 
	@zoneB1Act DECIMAL(7, 2)= 0, 
	@zoneB2Set DECIMAL(7, 2)= 0, 
	@zoneB2Act DECIMAL(7, 2)= 0 
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO  ArrProcessLine1
	(
	 dateTimeStamp, 
	 shift,
     workStation,
	 operator,
     gauge,
	 piw,
     formula,
	 feetPerRoll,
	 workOrder1,
	 workOrder2, 
	 workOrder3,
	 workOrder4, 
	 jNumber,
	 tableSpeed,
     screwSpeed,
	 dieNumber,
     rbTemp,
     screenPack,
     extruderAmps,
     extruderPSI,
	 stretch,
     scrap,
     airRingSpeed, 
     airRingTemp,
	 tempo,
	 threeP,
	 drumNip,
	 horizontalApply,
	 inflateAirShaft,
     winderNipRoll, 
	 winderNipSpeed,
	 collapsingShieldSpeed,
	 collapsingShieldTemp,
     plenumTemp,
     airRingGap,
     trimPullerSpeed,
     zone0Set,
	 zone0Act,
	 zone1Set,
	 zone1Act,
	 zone2Set,
	 zone2Act,
	 zone3Set,	 
	 zone3Act, 
	 zone4Set,
	 zone4Act,
	 zone5Set,
	 zone5Act,
	 zone6Set,
	 zone6Act,
	 zone7Set,
	 zone7Act,
	 zone8Set,
	 zone8Act,
	 zone9Set,
	 zone9Act,
	 zoneB1Set,
	 zoneB1Act,
	 zoneB2Set,
	 zoneB2Act
	)
	VALUES
	(
	@dateTimeStamp,
	@shift,
	@workStation,
	@operator,
	@gauge,
	@piw,
	@formula,
	@feetPerRoll,
	@workOrder1, 
	@workOrder2,
	@workOrder3,
	@workOrder4,
	@jNumber,
	@tableSpeed,
	@screwSpeed,
	@dieNumber,
	@rbTemp,
	@screenPack,
	@extruderAmps,
	@extruderPSI,
	@stretch,
	@scrap,
	@airRingSpeed,
	@airRingTemp,
	@tempo,
	@threeP,
	@drumNip,
	@horizontalApply,
	@inflateAirShaft,
	@winderNipRoll,
	@winderNipSpeed,
	@collapsingShieldSpeed,
	@collapsingShieldTemp,
	@plenumTemp,
	@airRingGap,
	@trimPullerSpeed,
	@zone0Set,
	@zone0Act, 
	@zone1Set,
	@zone1Act,
	@zone2Set,
	@zone2Act,
	@zone3Set,
	@zone3Act,
	@zone4Set,
	@zone4Act,
	@zone5Set,
	@zone5Act,
	@zone6Set,
	@zone6Act,
	@zone7Set,
	@zone7Act,
	@zone8Set,
	@zone8Act,
	@zone9Set,
	@zone9Act,
	@zoneB1Set,
	@zoneB1Act,
	@zoneB2Set,
	@zoneB2Act
	)
END
GO

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- ============================================= 
-- Author:  Sam Renick 
-- Create date: 01-05-15 
-- Description: Insert intoArrProcessLine2 
-- ============================================= 
-- Add the parameters for the stored procedure here
CREATE PROCEDURE InsertArrProcessLine2 
	-- Add the parameters for the stored procedure here
@dateTimeStamp DATETIME = NULL,
@shift VARCHAR(255) = NULL,
@workStation VARCHAR(255) = NULL,
@operator VARCHAR(255) = NULL,
@gauge DECIMAL(7, 2)= 0,
@piw DECIMAL(7, 2)= 0,
@formula DECIMAL(7, 2)= 0,
@feetPerRoll DECIMAL(7, 2)= 0,
@workOrder1 DECIMAL(7, 2)= 0,
@workOrder2 DECIMAL(7, 2)= 0,
@workOrder3 DECIMAL(7, 2)= 0,
@workOrder4 DECIMAL(7, 2)= 0,
@jNumber DECIMAL(7, 2)= 0,
@tableSpeed DECIMAL(7, 2)= 0,
@screwSpeed DECIMAL(7, 2)= 0,
@dieNumber DECIMAL(7, 2)= 0,
@rbTemp DECIMAL(7, 2)= 0,
@screenPack DECIMAL(7, 2)= 0,
@extruderAmps DECIMAL(7, 2)= 0,
@extruderPSI DECIMAL(7, 2)= 0,
@stretch DECIMAL(7, 2)= 0,
@scrap DECIMAL(7, 2)= 0,
@airRingSpeed DECIMAL(7, 2)= 0,
@airRingTemp DECIMAL(7, 2)= 0,
@drumNip DECIMAL(7, 2)= 0,
@winderNipRoll DECIMAL(7, 2)= 0,
@winderNipSpeed DECIMAL(7, 2)= 0,
@collapsingShieldSpeed DECIMAL(7, 2)= 0,
@collapsingShieldTemp DECIMAL(7, 2)= 0,
@plenumTemp DECIMAL(7, 2)= 0,
@airRingGap DECIMAL(7, 2)= 0,
@fingerAdjustLeft DECIMAL(7, 2)= 0,
@fingerAdjustRight DECIMAL(7, 2)= 0,
@trimPullerSpeed decimal(7, 2)= 0,
@mandrelAirPressure decimal(7, 2)= 0,
@zone1Set decimal(7, 2)= 0,
@zone1Act decimal(7, 2)= 0,
@zone2Set decimal(7, 2)= 0,
@zone2Act decimal(7, 2)= 0,
@zone3Set decimal(7, 2)= 0,
@zone3Act decimal(7, 2)= 0,
@zone4Set decimal(7, 2)= 0,
@zone4Act decimal(7, 2)= 0,
@zone5Set decimal(7, 2)= 0,
@zone5Act decimal(7, 2)= 0,
@zone6Set decimal(7, 2)= 0,
@zone6Act decimal(7, 2)= 0,
@zone7Set decimal(7, 2)= 0,
@zone7Act decimal(7, 2)= 0,
@zone8Set decimal(7, 2)= 0,
@zone8Act decimal(7, 2)= 0,
@zone9Set decimal(7, 2)= 0,
@zone9Act decimal(7, 2)= 0,
@zone10Set decimal(7, 2)= 0,
@zone10Act decimal(7, 2)= 0,
@zone11Set decimal(7, 2)= 0,
@zone11Act decimal(7, 2)= 0,
@zone12Set decimal(7, 2)= 0,
@zone12Act decimal(7, 2)= 0,
@zone13Set decimal(7, 2)= 0,
@zone13Act decimal(7, 2)= 0
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	insert INTO arrprocessline2
(
dateTimeStamp,
shift,
workstation,
operator,
gauge,
piw,
formula,
feetperroll,
workorder1,
workorder2,
workorder3,
workorder4,
jnumber,
tablespeed,
screwspeed,
dienumber,
rbtemp,
screenpack,
extruderamps,
extruderpsi,
stretch,
scrap,
airringspeed,
airringtemp,
drumnip,
winderniproll,
windernipspeed,
collapsingshieldspeed,
collapsingshieldtemp,
plenumtemp,
airringgap,
fingeradjustleft,
fingeradjustright,
trimpullerspeed,
mandrelairpressure,
zone1set,
zone1act,
zone2set,
zone2act,
zone3set,
zone3act,
zone4set,
zone4act,
zone5set,
zone5act,
zone6set,
zone6act,
zone7set,
zone7act,
zone8set,
zone8act,
zone9set,
zone9act,
zone10set,
zone10act,
zone11set,
zone11act,
zone12set,
zone12act,
zone13set,
zone13act
)
VALUES
(
@dateTimeStamp,
@shift,
@workStation,
@operator,
@gauge,
@piw,
@formula,
@feetPerRoll,
@workOrder1,
@workOrder2,
@workOrder3,
@workOrder4,
@jNumber,
@tableSpeed,
@screwSpeed,
@dieNumber,
@rbTemp,
@screenPack,
@extruderAmps,
@extruderPSI,
@stretch,
@scrap,
@airRingSpeed,
@airRingTemp,
@drumNip,
@winderNipRoll,
@winderNipSpeed,
@collapsingShieldSpeed,
@collapsingShieldTemp,
@plenumTemp,
@airRingGap,
@fingerAdjustLeft,
@fingerAdjustRight,
@trimPullerSpeed,
@mandrelAirPressure,
@zone1Set,
@zone1Act,
@zone2Set,
@zone2Act,
@zone3Set,
@zone3Act,
@zone4Set,
@zone4Act,
@zone5Set,
@zone5Act,
@zone6Set,
@zone6Act,
@zone7Set,
@zone7Act,
@zone8Set,
@zone8Act,
@zone9Set,
@zone9Act,
@zone10Set,
@zone10Act,
@zone11Set,
@zone11Act,
@zone12Set,
@zone12Act,
@zone13Set,
@zone13Act
)
END
GO

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters
-- command (Ctrl-Shift-M) to fill in the parameter
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author: Sam Renick
-- Create date: 01-14-15
-- Description: Insert intoArrProcessLine3
-- =============================================
CREATE PROCEDURE InsertArrProcessLine3
-- Add the parameters for the stored procedure here
@dateTimeStamp DATETIME = NULL,
@shift VARCHAR(255) = NULL,
@workStation VARCHAR(255) = NULL,
@operator VARCHAR(255) = NULL,
@gauge DECIMAL(7, 2)= 0,
@piw DECIMAL(7, 2)= 0,
@formula DECIMAL(7, 2)= 0,
@feetPerRoll DECIMAL(7, 2)= 0,
@workOrder1 DECIMAL(7, 2)= 0,
@workOrder2 DECIMAL(7, 2)= 0,
@workOrder3 DECIMAL(7, 2)= 0,
@workOrder4 DECIMAL(7, 2)= 0,
@jNumber DECIMAL(7, 2)= 0,
@tableSpeed DECIMAL(7, 2)= 0,
@screwSpeed DECIMAL(7, 2)= 0,
@dieNumber DECIMAL(7, 2)= 0,
@rbTemp DECIMAL(7, 2)= 0,
@screenPack DECIMAL(7, 2)= 0,
@extruderAmps DECIMAL(7, 2)= 0,
@stretch DECIMAL(7, 2)= 0,
@scrap DECIMAL(7, 2)= 0,
@drumTemp DECIMAL(7, 2)= 0,
@pinchRollTemp DECIMAL(7, 2)= 0,
@airRingSpeed DECIMAL(7, 2)= 0,
@airRingTemp DECIMAL(7, 2)= 0,
@trimLeftMeasure DECIMAL(7, 2)= 0,
@trimRightMeasure DECIMAL(7, 2)= 0,
@airRingGap DECIMAL(7, 2)= 0,
@trimPullerSpeed decimal(7, 2)= 0,
@feedValves VARCHAR(255) = NULL,
@doors VARCHAR(255) = NULL,
@zone1Set decimal(7, 2)= 0,
@zone1Act decimal(7, 2)= 0,
@zone2Set decimal(7, 2)= 0,
@zone2Act decimal(7, 2)= 0,
@zone3Set decimal(7, 2)= 0,
@zone3Act decimal(7, 2)= 0,
@zone4Set decimal(7, 2)= 0,
@zone4Act decimal(7, 2)= 0,
@zone5Set decimal(7, 2)= 0,
@zone5Act decimal(7, 2)= 0,
@zone6Set decimal(7, 2)= 0,
@zone6Act decimal(7, 2)= 0,
@zone8Set decimal(7, 2)= 0,
@zone8Act decimal(7, 2)= 0,
@zone9Set decimal(7, 2)= 0,
@zone9Act decimal(7, 2)= 0,
@zone10Set decimal(7, 2)= 0,
@zone10Act decimal(7, 2)= 0
AS
BEGIN
-- SET NOCOUNT ON added to prevent extra result sets from
-- interfering with SELECT statements.
SET NOCOUNT ON;

-- Insert statements for procedure here
INSERT INTO arrprocessline3
(
dateTimeStamp,
shift,
workstation,
operator,
gauge,
piw,
formula,
feetperroll,
workorder1,
workorder2,
workorder3,
workorder4,
jnumber,
tablespeed,
screwspeed,
dienumber,
rbtemp,
screenpack,
extruderamps,
stretch,
scrap,
drumTemp,
pinchRollTemp,
airringspeed,
airringtemp,
trimLeftMeasure,
trimRightMeasure,
airringgap,
trimpullerspeed,
feedValves,
doors,
zone1set,
zone1act,
zone2set,
zone2act,
zone3set,
zone3act,
zone4set,
zone4act,
zone5set,
zone5act,
zone6set,
zone6act,
zone8set,
zone8act,
zone9set,
zone9act,
zone10set,
zone10act
)
VALUES
(
@dateTimeStamp,
@shift,
@workStation,
@operator,
@gauge,
@piw,
@formula,
@feetPerRoll,
@workOrder1,
@workOrder2,
@workOrder3,
@workOrder4,
@jNumber,
@tableSpeed,
@screwSpeed,
@dieNumber,
@rbTemp,
@screenPack,
@extruderAmps,
@stretch,
@scrap,
@drumTemp,
@pinchRollTemp,
@airRingSpeed,
@airRingTemp,
@trimLeftMeasure,
@trimRightMeasure,
@airRingGap,
@trimPullerSpeed,
@feedValves,
@doors,
@zone1Set,
@zone1Act,
@zone2Set,
@zone2Act,
@zone3Set,
@zone3Act,
@zone4Set,
@zone4Act,
@zone5Set,
@zone5Act,
@zone6Set,
@zone6Act,
@zone8Set,
@zone8Act,
@zone9Set,
@zone9Act,
@zone10Set,
@zone10Act
)
END
GO

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters
-- command (Ctrl-Shift-M) to fill in the parameter
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
USE [CAL_QA]
GO
/****** Object:  StoredProcedure [dbo].[InsertArrProcessLine6]    Script Date: 01/16/2015 14:34:24 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author: Sam Renick
-- Create date: 01-14-15
-- Description: Insert intoArrProcessLine3
-- =============================================
ALTER PROCEDURE [dbo].[InsertArrProcessLine6]
-- Add the parameters for the stored procedure here
@dateTimeStamp DATETIME = NULL,
@shift VARCHAR(255) = NULL,
@workStation VARCHAR(255) = NULL,
@operator VARCHAR(255) = NULL,
@gauge DECIMAL(7, 2)= 0,
@piw DECIMAL(7, 2)= 0,
@formula DECIMAL(7, 2)= 0,
@feetPerRoll DECIMAL(7, 2)= 0,
@workOrder1 DECIMAL(7, 2)= 0,
@workOrder2 DECIMAL(7, 2)= 0,
@workOrder3 DECIMAL(7, 2)= 0,
@workOrder4 DECIMAL(7, 2)= 0,
@jNumber DECIMAL(7, 2)= 0,
@primeNipSpeed DECIMAL(7, 2)= 0,
@secondNipSpeed DECIMAL(7,2)=0,
@primeWinderSpeed DECIMAL(7,2)=0,
@secondWinderSpeed DECIMAL(7,2)=0,
@screwSpeed DECIMAL(7, 2)= 0,
@rbTemp DECIMAL(7, 2)= 0,
@screenPack DECIMAL(7, 2)= 0,
@extruderAmps DECIMAL(7, 2)= 0,
@extruderPSI DECIMAL(7, 2)= 0,
@scrap DECIMAL(7, 2)= 0,
@airRingSpeed DECIMAL(7, 2)= 0,
@airRingTemp DECIMAL(7, 2)= 0,
@winderNipRoll DECIMAL(7, 2)= 0,
@mixDropTemp DECIMAL(7, 2)= 0,
@plenumTemp DECIMAL(7, 2)= 0,
@plenumSpeed DECIMAL(7, 2)= 0,
@airRingGap DECIMAL(7, 2)= 0,
@trimPullerSpeed decimal(7, 2)= 0,
@feedValves VARCHAR(255) = NULL,
@doors VARCHAR(255) = NULL,
@feedValvesOpenPercent DECIMAL(7, 2)= 0,
@zone1Set decimal(7, 2)= 0,
@zone1Act decimal(7, 2)= 0,
@zone2Set decimal(7, 2)= 0,
@zone2Act decimal(7, 2)= 0,
@zone3Set decimal(7, 2)= 0,
@zone3Act decimal(7, 2)= 0,
@zone4Set decimal(7, 2)= 0,
@zone4Act decimal(7, 2)= 0,
@zone5Set decimal(7, 2)= 0,
@zone5Act decimal(7, 2)= 0,
@zone6Set decimal(7, 2)= 0,
@zone6Act decimal(7, 2)= 0,
@zone7ASet decimal(7, 2)= 0,
@zone7AAct decimal(7, 2)= 0,
@zone7BSet decimal(7, 2)= 0,
@zone7BAct decimal(7, 2)= 0,
@zone7CSet decimal(7, 2)= 0,
@zone7CAct decimal(7, 2)= 0,
@zone8Set decimal(7, 2)= 0,
@zone8Act decimal(7, 2)= 0,
@zone9Set decimal(7, 2)= 0,
@zone9Act decimal(7, 2)= 0,
@zone10Set decimal(7, 2)= 0,
@zone10Act decimal(7, 2)= 0,
@coreOutDiameterPrimary  decimal(7, 2)= 0,
@rollLengthPrimary decimal(7, 2)= 0,
@endRollWarningPrimary decimal(7, 2)= 0,
@endRollTransferPrimary decimal(7, 2)= 0,
@forceSetPointPrimary decimal(7, 2)= 0,
@drumToNipTrimPrimary decimal(7, 2)= 0,
@coreOutDiameterSecondary decimal(7, 2)= 0,
@rollLengthSecondary decimal(7, 2)= 0,
@endRollWarningSecondary decimal(7, 2)= 0,
@endRollTransferSecondary decimal(7, 2)= 0,
@forceSetPointSecondary decimal(7, 2)= 0,
@drumToNipTrimSecondary decimal(7, 2)= 0
AS
BEGIN
-- SET NOCOUNT ON added to prevent extra result sets from
-- interfering with SELECT statements.
SET NOCOUNT ON;

-- Insert statements for procedure here
INSERT INTO arrprocessline6
(
dateTimeStamp,
shift,
workstation,
operator,
gauge,
piw,
formula,
feetperroll,
workorder1,
workorder2,
workorder3,
workorder4,
jnumber,
primeNipSpeed,
secondNipSpeed,
primeWinderSpeed,
secondWinderSpeed,
screwspeed,
rbtemp,
screenpack,
extruderamps,
extruderPSI,
scrap,
airringspeed,
airringtemp,
winderNipRoll,
mixDropTemp,
plenumTemp,
plenumSpeed,
airringgap,
trimpullerspeed,
feedValves,
doors,
feedValvesOpenPercent,
zone1set,
zone1act,
zone2set,
zone2act,
zone3set,
zone3act,
zone4set,
zone4act,
zone5set,
zone5act,
zone6set,
zone6act,
zone7ASet,
zone7AAct,
zone7BSet,
zone7BAct,
zone7CSet,
zone7CAct,
zone8set,
zone8act,
zone9set,
zone9act,
zone10set,
zone10act,
coreOutDiameterPrimary,
rollLengthPrimary,
endRollWarningPrimary,
endRollTransferPrimary,
forceSetPointPrimary,
drumToNipTrimPrimary,
coreOutDiameterSecondary,
rollLengthSecondary,
endRollWarningSecondary,
endRollTransferSecondary,
forceSetPointSecondary,
drumToNipTrimSecondary
)
VALUES
(
@dateTimeStamp,
@shift,
@workStation,
@operator,
@gauge,
@piw,
@formula,
@feetPerRoll,
@workOrder1,
@workOrder2,
@workOrder3,
@workOrder4,
@jNumber,
@primeNipSpeed,
@secondNipSpeed,
@primeWinderSpeed,
@secondWinderSpeed,
@screwSpeed,
@rbTemp,
@screenPack,
@extruderAmps,
@extruderPSI,
@scrap,
@airRingSpeed,
@airRingTemp,
@winderNipRoll,
@mixDropTemp,
@plenumTemp,
@plenumSpeed,
@airRingGap,
@trimPullerSpeed,
@feedValves,
@doors,
@feedValvesOpenPercent,
@zone1Set,
@zone1Act,
@zone2Set,
@zone2Act,
@zone3Set,
@zone3Act,
@zone4Set,
@zone4Act,
@zone5Set,
@zone5Act,
@zone6Set,
@zone6Act,
@zone7ASet,
@zone7AAct,
@zone7BSet,
@zone7BAct,
@zone7CSet,
@zone7CAct,
@zone8Set,
@zone8Act,
@zone9Set,
@zone9Act,
@zone10Set,
@zone10Act,
@coreOutDiameterPrimary,
@rollLengthPrimary,
@endRollWarningPrimary,
@endRollTransferPrimary,
@forceSetPointPrimary,
@drumToNipTrimPrimary,
@coreOutDiameterSecondary,
@rollLengthSecondary,
@endRollWarningSecondary,
@endRollTransferSecondary,
@forceSetPointSecondary,
@drumToNipTrimSecondary
)
END


-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters
-- command (Ctrl-Shift-M) to fill in the parameter
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author: Sam Renick
-- Create date: 01-14-15
-- Description: Insert intoArrProcessLine3
-- =============================================
CREATE PROCEDURE InsertArrProcessLine8
-- Add the parameters for the stored procedure here
@dateTimeStamp DATETIME = NULL,
@shift VARCHAR(255) = NULL,
@workStation VARCHAR(255) = NULL,
@operator VARCHAR(255) = NULL,
@gauge DECIMAL(7, 2)= 0,
@piw DECIMAL(7, 2)= 0,
@formula DECIMAL(7, 2)= 0,
@feetPerRoll DECIMAL(7, 2)= 0,
@workOrder1 DECIMAL(7, 2)= 0,
@workOrder2 DECIMAL(7, 2)= 0,
@workOrder3 DECIMAL(7, 2)= 0,
@workOrder4 DECIMAL(7, 2)= 0,
@jNumber DECIMAL(7, 2)= 0,
@tableSpeed DECIMAL(7, 2)= 0,
@screwSpeed DECIMAL(7, 2)= 0,
@dieNumber DECIMAL(7, 2)= 0,
@rbTemp DECIMAL(7, 2)= 0,
@screenPack DECIMAL(7, 2)= 0,
@extruderAmps DECIMAL(7, 2)= 0,
@stretch DECIMAL(7, 2)= 0,
@scrap DECIMAL(7, 2)= 0,
@drumTemp DECIMAL(7, 2)= 0,
@pinchRollTemp DECIMAL(7, 2)= 0,
@airRingSpeed DECIMAL(7, 2)= 0,
@trimLeftMeasure DECIMAL(7, 2)= 0,
@trimRightMeasure DECIMAL(7, 2)= 0,
@airRingGap DECIMAL(7, 2)= 0,
@feedValves VARCHAR(255) = NULL,
@zone1Set decimal(7, 2)= 0,
@zone1Act decimal(7, 2)= 0,
@zone2Set decimal(7, 2)= 0,
@zone2Act decimal(7, 2)= 0,
@zone3Set decimal(7, 2)= 0,
@zone3Act decimal(7, 2)= 0,
@zone4Set decimal(7, 2)= 0,
@zone4Act decimal(7, 2)= 0,
@zone5Set decimal(7, 2)= 0,
@zone5Act decimal(7, 2)= 0,
@zone6Set decimal(7, 2)= 0,
@zone6Act decimal(7, 2)= 0,
@zone7Set decimal(7, 2)= 0,
@zone7Act decimal(7, 2)= 0,
@zone8Set decimal(7, 2)= 0,
@zone8Act decimal(7, 2)= 0,
@zone9Set decimal(7, 2)= 0,
@zone9Act decimal(7, 2)= 0,
@zone10Set decimal(7, 2)= 0,
@zone10Act decimal(7, 2)= 0,
@zone11Set decimal(7, 2)= 0,
@zone11Act decimal(7, 2)= 0,
@hotRoll1Set decimal(7, 2)= 0,
@hotRoll1Act decimal(7, 2)= 0,
@hotRoll2Set decimal(7, 2)= 0,
@hotRoll2Act decimal(7, 2)= 0,
@chillRollSet decimal(7, 2)= 0,
@chillRollAct decimal(7, 2)= 0
AS
BEGIN
-- SET NOCOUNT ON added to prevent extra result sets from
-- interfering with SELECT statements.
SET NOCOUNT ON;

-- Insert statements for procedure here
INSERT INTO arrprocessline8
(
dateTimeStamp,
shift,
workstation,
operator,
gauge,
piw,
formula,
feetperroll,
workorder1,
workorder2,
workorder3,
workorder4,
jnumber,
tableSpeed,
screwspeed,
dieNumber,
rbtemp,
screenpack,
extruderamps,
stretch,
scrap,
drumTemp,
pinchRollTemp,
airringspeed,
trimleftmeasure,
trimrightmeasure,
airringgap,
feedValves,
zone1set,
zone1act,
zone2set,
zone2act,
zone3set,
zone3act,
zone4set,
zone4act,
zone5set,
zone5act,
zone6set,
zone6act,
zone7Set,
zone7Act,
zone8set,
zone8act,
zone9set,
zone9act,
zone10set,
zone10act,
zone11set,
zone11act,
hotroll1Set,
hotRoll1Act,
hotroll2Set,
hotRoll2Act,
chillrollSet,
chillRollAct
)
VALUES
(
@dateTimeStamp,
@shift,
@workStation,
@operator,
@gauge,
@piw,
@formula,
@feetPerRoll,
@workOrder1,
@workOrder2,
@workOrder3,
@workOrder4,
@jNumber,
@tableSpeed,
@screwSpeed,
@dieNumber,
@rbTemp,
@screenPack,
@extruderAmps,
@stretch,
@scrap,
@drumTemp,
@pinchRollTemp,
@airRingSpeed,
@trimleftmeasure,
@trimrightmeasure,
@airRingGap,
@feedValves,
@zone1Set,
@zone1Act,
@zone2Set,
@zone2Act,
@zone3Set,
@zone3Act,
@zone4Set,
@zone4Act,
@zone5Set,
@zone5Act,
@zone6Set,
@zone6Act,
@zone7Set,
@zone7Act,
@zone8Set,
@zone8Act,
@zone9Set,
@zone9Act,
@zone10Set,
@zone10Act,
@zone11Set,
@zone11Act,
@hotRoll1Set,
@hotRoll1Act,
@hotRoll2Set,
@hotRoll2Act,
@chillRollSet,
@chillRollAct
)
END
GO

USE [CAL_QA]
GO
/****** Object:  StoredProcedure [dbo].[InsertArrProcessLine4]    Script Date: 01/16/2015 14:08:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author: Sam Renick
-- Create date: 01-14-15
-- Description: Insert intoArrProcessLine3
-- =============================================
ALTER PROCEDURE [dbo].[InsertArrProcessLine4]
-- Add the parameters for the stored procedure here
@dateTimeStamp DATETIME = NULL,
@shift VARCHAR(255) = NULL,
@workStation VARCHAR(255) = NULL,
@operator VARCHAR(255) = NULL,
@gauge DECIMAL(7, 2)= 0,
@piw DECIMAL(7, 2)= 0,
@formula DECIMAL(7, 2)= 0,
@feetPerRoll DECIMAL(7, 2)= 0,
@workOrder1 DECIMAL(7, 2)= 0,
@workOrder2 DECIMAL(7, 2)= 0,
@workOrder3 DECIMAL(7, 2)= 0,
@workOrder4 DECIMAL(7, 2)= 0,
@jNumber DECIMAL(7, 2)= 0,
@tableSpeed DECIMAL(7, 2)= 0,
@screwSpeed DECIMAL(7, 2)= 0,
@dieNumber DECIMAL(7, 2)= 0,
@rbTemp DECIMAL(7, 2)= 0,
@screenPack DECIMAL(7, 2)= 0,
@extruderAmps DECIMAL(7, 2)= 0,
@stretch DECIMAL(7, 2)= 0,
@scrap DECIMAL(7, 2)= 0,
@drumTemp DECIMAL(7, 2)= 0,
@pinchRollTemp DECIMAL(7, 2)= 0,
@airRingSpeed DECIMAL(7, 2)= 0,
@airRingTemp DECIMAL(7, 2)= 0,
@trimLeftMeasure DECIMAL(7, 2)= 0,
@trimRightMeasure DECIMAL(7, 2)= 0,
@airRingGap DECIMAL(7, 2)= 0,
@trimPullerSpeed decimal(7, 2)= 0,
@feedValves VARCHAR(255) = NULL,
@doors VARCHAR(255) = NULL,
@zone1Set decimal(7, 2)= 0,
@zone1Act decimal(7, 2)= 0,
@zone2Set decimal(7, 2)= 0,
@zone2Act decimal(7, 2)= 0,
@zone3Set decimal(7, 2)= 0,
@zone3Act decimal(7, 2)= 0,
@zone4Set decimal(7, 2)= 0,
@zone4Act decimal(7, 2)= 0,
@zone5Set decimal(7, 2)= 0,
@zone5Act decimal(7, 2)= 0,
@zone6Set decimal(7, 2)= 0,
@zone6Act decimal(7, 2)= 0,
@zone8Set decimal(7, 2)= 0,
@zone8Act decimal(7, 2)= 0,
@zone9Set decimal(7, 2)= 0,
@zone9Act decimal(7, 2)= 0,
@zone10Set decimal(7, 2)= 0,
@zone10Act decimal(7, 2)= 0
AS
BEGIN
-- SET NOCOUNT ON added to prevent extra result sets from
-- interfering with SELECT statements.
SET NOCOUNT ON;

-- Insert statements for procedure here
INSERT INTO arrprocessline4
(
dateTimeStamp,
shift,
workstation,
operator,
gauge,
piw,
formula,
feetperroll,
workorder1,
workorder2,
workorder3,
workorder4,
jnumber,
tablespeed,
screwspeed,
dienumber,
rbtemp,
screenpack,
extruderamps,
stretch,
scrap,
drumTemp,
pinchRollTemp,
airringspeed,
airringtemp,
trimLeftMeasure,
trimRightMeasure,
airringgap,
trimpullerspeed,
feedValves,
doors,
zone1set,
zone1act,
zone2set,
zone2act,
zone3set,
zone3act,
zone4set,
zone4act,
zone5set,
zone5act,
zone6set,
zone6act,
zone8set,
zone8act,
zone9set,
zone9act,
zone10set,
zone10act
)
VALUES
(
@dateTimeStamp,
@shift,
@workStation,
@operator,
@gauge,
@piw,
@formula,
@feetPerRoll,
@workOrder1,
@workOrder2,
@workOrder3,
@workOrder4,
@jNumber,
@tableSpeed,
@screwSpeed,
@dieNumber,
@rbTemp,
@screenPack,
@extruderAmps,
@stretch,
@scrap,
@drumTemp,
@pinchRollTemp,
@airRingSpeed,
@airRingTemp,
@trimLeftMeasure,
@trimRightMeasure,
@airRingGap,
@trimPullerSpeed,
@feedValves,
@doors,
@zone1Set,
@zone1Act,
@zone2Set,
@zone2Act,
@zone3Set,
@zone3Act,
@zone4Set,
@zone4Act,
@zone5Set,
@zone5Act,
@zone6Set,
@zone6Act,
@zone8Set,
@zone8Act,
@zone9Set,
@zone9Act,
@zone10Set,
@zone10Act
)
END

-- ================================================
-- Template generated from Template Explorer using:
-- Create Procedure (New Menu).SQL
--
-- Use the Specify Values for Template Parameters 
-- command (Ctrl-Shift-M) to fill in the parameter 
-- values below.
--
-- This block of comments will not be included in
-- the definition of the procedure.
-- ================================================
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 1-26-15
-- Description:	Insert Checklist Values into ArrHousekeeping
-- =============================================
CREATE PROCEDURE InsertArrHousekeeping
	-- Add the parameters for the stored procedure here
	@workStation VARCHAR(255) = NULL,
	@shift VARCHAR(255) = NULL,
	@dateTimeStamp dateTime = NULL, 
	@sweepMixer INT = 0,
	@cleanTrough  INT = 0,
	@scrapCoreInspection  INT =0,
	@extruderScreensCleaned INT = 0,
	@scrapusageVerify  INT = 0,
	@guardHopperLid  INT = 0,
	@guardExtruderRight  INT = 0,
	@guardExtruderLeft  INT = 0,
	@containmentDoors  INT = 0,
	@grinderChute  INT = 0,
	@grinderLatch  INT = 0,
	@grinderDoor  INT = 0,
	@winderRightFront  INT = 0,
	@winderRightRear  INT = 0,
	@winderLeftFront  INT = 0,
	@winderLeftRear  INT = 0,
	@operatorSignature VARCHAR(255) = NULL

AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	INSERT INTO ArrHousekeeping
	(
	workstation,
	shift,
	dateTimeStamp,
	sweepMixer,
	cleanTrough,
	scrapCoreInspection,
	extruderScreensCleaned,
	scrapusageVerify,
	guardHopperLid,
	guardExtruderRight,
	guardExtruderLeft,
	containmentDoors,
	grinderChute,
	grinderLatch,
	grinderDoor,
	winderRightFront,
	winderRightRear,
	winderLeftFront,
	winderLeftRear,
	operatorSignature
	)
	VALUES
	(
	@workstation,
	@shift,
	@dateTimeStamp,
	@sweepMixer,
	@cleanTrough,
	@scrapCoreInspection,
	@extruderScreensCleaned,
	@scrapusageVerify,
	@guardHopperLid,
	@guardExtruderRight,
	@guardExtruderLeft,
	@containmentDoors,
	@grinderChute,
	@grinderLatch,
	@grinderDoor,
	@winderRightFront,
	@winderRightRear,
	@winderLeftFront,
	@winderLeftRear,
	@operatorSignature
	)
END
GO

USE [CAL_QA]
GO

/****** Object:  Table [dbo].[arrTrimmer]    Script Date: 01/28/2015 10:08:21 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[arrTrimmer](
	trimmerID [int] IDENTITY(1,1) NOT NULL,
	[workStation] [varchar](255) NULL,
	[shift] [varchar](255) NULL,
	[operator] [varchar](255) NULL,
	[dateTimeStamp] [datetime] NULL,
	[workOrder] [decimal](7, 2) NULL,
	wipItemNumber int,
	coreTagNumber [decimal](7, 2) NULL,
	minimumWeight  [decimal](7, 2) NULL,
	nominalWeight [decimal](7, 2) NULL,
	maximumWeight [decimal](7, 2) NULL,
	piw  [decimal](7, 2) NULL,
	formula  [decimal](7, 2) NULL,
	gauge  [decimal](7, 2) NULL,
	length  [decimal](7, 2) NULL,
	coreWeight  [decimal](7, 2) NULL,
	finishedWidth  [decimal](7, 2) NULL,
	extrudedItemNumber int NULL
	
PRIMARY KEY CLUSTERED 
(
	trimmerID ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


USE [CAL_QA]
GO

/****** Object:  Table [dbo].[ArrDriller]    Script Date: 02/02/2015 12:04:58 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[ArrDriller](
	[drillerID] [int] IDENTITY(1,1) NOT NULL,
	[workStation] [varchar](255) NULL,
	[shift] [varchar](255) NULL,
	[operator] [varchar](255) NULL,
	[dateTimeStamp] [datetime] NULL,
	[workOrder] [decimal](10, 2) NULL,
	[wipItemNumber] [decimal](10, 2) NULL,
	[wipCoreTagNumber] [varchar](255) NULL,
	[fgCoreTagNumber] [varchar](255) NULL,
	[rollWeight] [decimal](7, 2) NULL,
	[piw] [decimal](7, 2) NULL,
	[formula] [decimal](7, 2) NULL,
	[gauge] [decimal](7, 2) NULL,
	[length] [decimal](7, 2) NULL,
	[finishedWidth] [decimal](7, 2) NULL,
	[extrudedItemNumber] [decimal](10, 2) NULL,
	[trimmedItemNumber] [decimal](10, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[drillerID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


USE [CAL_QA]
GO
/****** Object:  StoredProcedure [dbo].[SelectCalWeightTotal]    Script Date: 02/27/2015 13:31:22 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Sam Renick
-- Create date: 05/29/2014
-- Description:	Select Previous Sets
-- =============================================
ALTER PROCEDURE [dbo].[SelectCalWeightTotal] 
	-- Add the parameters for the stored procedure here
	@dateStamp dateTime = NULL, 
	@setNumber int = 0,
	@shift int =0,
	@lineNumber int = 0
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT percentOfTarget, targetPoundsHour, actualPoundsHour, lineSpeed
	FROM CalWeightTotal 
	WHERE dateStamp = @dateStamp
	AND setNumber = @setNumber
	AND shift = @shift
	AND lineNumber = @lineNumber
END
