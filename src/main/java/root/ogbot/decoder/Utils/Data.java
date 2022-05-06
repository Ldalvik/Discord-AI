package root.ogbot.decoder.Utils;

public class Data {

    public static String VERSION = "0.0.2";

    public static String[] RIM_NAMES = {
               "STOCK (STOCK RIMS)",
               "AME_TorqThrust (Torq-Thrust M)",
               "BBS_RE (RE)",
               "BBS_RK (RK)",
               "BRA_MonoblockIV (Monoblock IV)",
               "BRA_MonoblockVIMulti (Monoblock VI)",
               "ENK_RPF1 (RPF1)",
               "FIK_FM10 (FM/10)",
               "FIK_Profil5 (Profil 5)",
               "FIK_Profil5S (Profil 5S)",
               "GRA_57C (57C)",
               "HRE_445R (445R)",
               "HRE_546R (546R)",
               "MOT_TrakLite2 (TRAKLITE 2.0)",
               "OET_TypeRE (Type RE)",
               "OZ_SuperleggeraIII (Superleggera III Forged)",
               "OZ_SuperturismoGT (Superturismo GT)",
               "RAC_RGS (RGS)",
               "RAC_RS2 (RS 2 Modular)",
               "RO_R27 (R2-7)",
               "RO_R25 (R2-5)",
               "TSW_Catalunya (Catalunya)",
               "VOL_TE37 (TE37)",
               "5ZI_FNO1RC (FN01R-C)",
               "5ZI_GN (GN+)",
               "5ZI_ZR_520 (ZR+520)",
               "ADV_RGII (RGII)",
               "ADV_SuperAdvanRV2 (Super Advan Racing Version 2)",
               "AME_Outlaw_II (Outlaw II)",
               "ASA_AF118 (AF 118)",
               "ASA_AF134 (AF 134)",
               "ASA_AF140 (AF 140)",
               "BBS_RS_GT (RS-GT)",
               "BOR_A (A)",
               "BOR_CB (CB)",
               "BOY_Slayer (Slayer)",
               "BRA_Monoblock_S (Monoblock S)",
               "BUD_P1_Racing_QF (P1 Racing QF)",
               "COM_CXR (CXR)",
               "COM_ML (ML)",
               "COM_M05 (M05)",
               "COM_TH2 (TH2)",
               "CRA_Series313 (Smoothie)",
               "CRA_Series351 (Street Lock D Window)",
               "CRA_Series61 (S/S Super Sport)",
               "DUB_BigChips (Big Chips)",
               "DUB_Presidential (Presidential)",
               "DYM_9Spoke (9 Spoke)",
               "ENK_NT03 (NT03+M)",
               "ENK_RS6 (RS6)",
               "ENK_TarmacEvo (Tarmac Evo)",
               "GRA_57_Optimise (57 OPTIMISE)",
               "GRA_T57_RC (T57-RC)",
               "HAL_SprintII (Sprint II)",
               "HOL_Hole_Star (Holestar)",
               "HOL_Solid (Solid)",
               "IFO_Astra (Astra)",
               "IFO_Fabulous (Fabulous)",
               "KON_After_Burner (After Burner)",
               "KON_Britelite (Britelite)",
               "KON_Daylite (Daylite)",
               "KOS_K1_TS (K1-Racing TS-Version)",
               "KOS_RT_Sport (RT SPORT)",
               "LEX_LTC_701 (LTC-701)",
               "LEX_LTC_704 (LTC-704)",
               "LEX_MistikSpikes (Mistik Spikes)",
               "MIC_Classic_Look (Classic Lock)",
               "MIC_ET_Drag (ET Drag)",
               "MOD_M3 (M3)",
               "MOD_M7 (M7)",
               "MOM_GTR (GTR)",
               "MOM_Ten_S (TEN-S)",
               "MOT_SP10 (SP10)",
               "MOT_TrackLite_1 (TRAKLITE 1.0)",
               "OET_Type_RXX (Type RXX)",
               "ROT_J_SPL (J.SPL)",
               "ROT_P45R (P45R)",
               "ROT_Tarmac_3 (Tarmac 3)",
               "SPE_2014 (2014)",
               "TEA_Pro_Race_1 (Pro Race 1)",
               "TEA_Pro_Race_2 (Pro Race 2)",
               "TEN_DC6_V1 (DC-6 V1)",
               "TEN_RS_5 (RS-5)",
               "TSW_Hockenheim_R (Hockenheim R)",
               "TSW_Trackstar_4 (Trackstar 4)",
               "VOL_RE30 (RE30)",
               "WED_SA70 (SA-70)",
               "WED_SA_97_F (SA-97 F)",
               "WED_TC_105N (TC 105 N)",
               "WEL_Alumastar_20_Drag (AlumaStar 2.0 Drag Race)",
               "WOR_CRKai (CRkai)",
               "WOR_Design_DH (Design DH)",
               "WOR_Equip_01 (Equip 01)",
               "WOR_XD9 (XD9)",
               "CRA_Series391 (Bonneville Series 391)",
               "HOL_SunStar (Sunstar)",
               "WEL_MagnumIII (Magnum III)",
               "HRE_P101 (P101)",
               "HRE_FF01 (Flow FF01)",
               "HRE_C103 (C103)",
               "HRE_943RL (943RL)",
               "HRE_945RL (945RL)",
               "HRE_454 (Vintage 454)",
               "HRE_501 (Vintage 501)",
               "HRE_505 (Vintage 505)",
               "HRE_935 (Vintage 935)",
               "HRE_S101 (S101)",
               "HRE_RX43 (RX43)",
               "HRE_P43SC (P43sc)",
               "HRE_P45SC (P45sc)",
               "HRE_P47SC (P47sc)",
               "MOM_Quantum (Quantum)",
               "MOM_Raptor (Raptor)",
               "MOM_Revenge (Revenge)",
               "MOM_Rush (Rush)",
               "MOM_Sting (Sting)",
               "HRE_P104 (P104)",
               "HRE_P107 (P107)",
               "HRE_C100 (C100)",
               "HRE_C106 (C106)",
               "HRE_C109 (C109)",
               "HRE_940RL (940RL)",
               "HRE_948RL (948RL)",
               "HRE_S104 (S104)",
               "HRE_S107 (S107)",
               "HRE_P40sc (P40sc)",
               "HRE_P44sc (P44sc)",
               "ADV_10MV1CS (ADV10.0 M.V1 CS)",
               "ADV_005MV2CS (ADV005 M.V2 CS)",
               "ADV_08MV2CS (ADV08 M.V2 CS)",
               "ADV_10MV2CS (ADV10 M.V2 CS)",
               "ADV_15TSpecCS (ADV15 Track Spec CS)",
               "ADV_05TSpecCS (ADV05 Track Spec CS)",
               "ADV_06TSpecCS (ADV06 Track Spec CS)",
               "ADV_5TrackFunction (ADV5 Track Function)",
               "ADV_5TrackSpecCS (ADV5.0 Track Spec CS)",
               "ADV_05CMV2CS (ADV05C M.V2 CS)",
               "F52_MonoblockPenta (Forged Monoblock Penta)",
               "F52_MonoblockTurbomac (Cast Monoblock Turbomac)",
               "F52_Outlaw001 (Forged 2pc Outlaw 001)",
               "F52_Tarmac348 (Forged 3pc Tarmac 348)",
               "F52_EvoSC (Forged 3pc Evo SC)",
               "F52_FormulaTR (Forged 3pc Formula TR)",
               "F52_Forza (Forza Edition)",
               "F52_MonoblockTurbomac2 (Cast Monoblock Turbomac (w/o fan))",
               "ROT_BLQ (BLQ)",
               "ROT_BMI (BMI)",
               "ROT_CBU (CBU)",
               "ROT_FUC (FUC)",
               "ROT_IDK (IDK)",
               "ROT_NUE (NUE)",
               "ROT_VCET (VCE-T)",
               "ROT_MLW (MLW)",
               "ROT_SCR (SCR)",
               "ROT_USF (USF)",
               "ADV_Forza (ADV Forza)",
               "SPE_859 (859)",
               "SPE_F1 (F1)",
               "BBS_RSTurbofan (RS Turbofan)",
               "BBS_E55 (E55)",
               "HAL_Indy (Indy)",
               "MOT_MR619 (MR619)",
               "OZ_F1 (F1)",
               "OZ_F1Deep (F1 Deep)",
               "VOL_TurboFan (Turbofan)",
               "TEA_COTF (COTF)",
               "KMC_XD228 (XD228 Machete Desert)",
               "WEL_AlumastarBL (Alumastar Beadlock)",
               "5ZI_BeckettsMK5 (Becketts MK5)",
               "5ZI_InperioSportsRS1 (Inperio Sports RS-1)",
               "ADV_52MV1SL (ADV5.2 M.V1 SL)",
               "ADV_GT (GT)",
               "ADV_SuperAdvanSA3 (Super Advan SA3)",
               "AME_AR61 (AR61 OUTLAW I)",
               "AME_AR904 (AR904)",
               "AME_AR907 (AR907)",
               "AME_AR920 (AR920 BLOCKHEAD)",
               "AME_AR924 (AR924 CROSSFIRE)",
               "AME_AR927 (AR927 BARRAGE)",
               "AME_VF101 (VF101)",
               "AME_VF104 (VF104)",
               "AME_VF300 (VF300)",
               "AME_VF301 (VF301)",
               "AME_VF302 (VF302)",
               "AME_VF309 (VF309)",
               "AME_VF310 (VF310)",
               "AME_VF482 (VF482)",
               "AME_VF501 (VF501)",
               "AME_VF503 (VF503)",
               "AME_VF526 (VF526)",
               "AME_VF533 (VF533)",
               "AME_VN205 (VN205 CLASSIC TORQ THRUST II)",
               "AME_VN327 (VN327 RALLY)",
               "AME_VN510 (VN510 DRAFT)",
               "AME_VN511 (VN511 SALT FLAT)",
               "ASA_ABL05 (ABL-05 Altair)",
               "ASA_AF116 (AF116)",
               "ASA_CX840 (CX840)",
               "ASA_CX856 (CX856)",
               "ASA_Monoblock101 (Monoblock 101)",
               "ASA_Monoblock504 (Monoblock 504)",
               "ASA_MonoblockSlate (Monoblock Slate)",
               "ASA_TL100 (TL100)",
               "ASA_TL101 (TL101)",
               "ASA_TL102 (TL102)",
               "BBS_CHR (CH-R)",
               "ENK_TS5 (TS5)",
               "GRA_57Transcend (57Transcend)",
               "HOL_HolestarSS (Holestar Signature Series)",
               "HOL_Modstar (Modstar)",
               "HOL_Pentastar (Pentastar)",
               "HOL_Sunflare (Sunflare)",
               "HRE_rb1 (RB1)",
               "HRE_rs204m (RS204M)",
               "HRE_rs309 (RS309)",
               "HRE_s201h (S201H)",
               "HRE_s204 (S204)",
               "HRE_s207 (S207)",
               "KMC_KM693 (KM693 Maze)",
               "KMC_KM694 (KM694 Wishbone)",
               "KMC_KM696 (KM696 Pivot)",
               "KMC_KM703 (KM703 Monophonic)",
               "LEX_M002 (M-002)",
               "LEX_M108 (M-108)",
               "MOD_B14 (B14)",
               "MOD_H2 (H2)",
               "MOD_H4 (H4)",
               "MOD_M14 (M14)",
               "MOD_M15 (M15)",
               "MOD_M23 (M23)",
               "MOD_S18 (S18 Evo)",
               "MOM_Heritage6 (Heritage 6)",
               "MOM_RF10S (RF-10S)",
               "MOT_FF5 (FF5)",
               "MOT_MR121 (MR121)",
               "MOT_MR124 (MR124)",
               "MOT_MR139 (MR139)",
               "MOT_MR221 (MR221 Traklite 1.0 2-piece)",
               "OET_E (Type E)",
               "OZ_Alpina (Alpina)",
               "OZ_Ares (Ares)",
               "OZ_AspenHLT (Aspen HLT)",
               "OZ_FormulaHLT4H (Formula HLT 4H)",
               "OZ_HyperGTHLT (Hyper GT HLT)",
               "OZ_RallyRacing (Rally Racing)",
               "OZ_SuperturismoEvoluzione (Superturismo Evoluzione)",
               "OZ_UltraleggeraHLTCL (Ultraleggera HLT CL)",
               "OZ_Zeus (Zeus)",
               "RAC_S4 (S4)",
               "RO_Formula5 (Formula 5)",
               "ROT_SDR (SDR)",
               "ROT_356 (356)",
               "ROT_AeroDisc (AeroDisc)",
               "ROT_BKK (BKK)",
               "ROT_BUC (BUC)",
               "ROT_CCV (CCV)",
               "ROT_CUF (CUF)",
               "ROT_DABM (DAB-M)",
               "ROT_DIA (DIA)",
               "ROT_EMA (EMA)",
               "ROT_FLG (FLG)",
               "ROT_HURT (HUR-T)",
               "ROT_IGS (IGS)",
               "ROT_INDT (IND-T)",
               "ROT_JDR (JDR)",
               "ROT_LASR (LAS-R)",
               "ROT_LGB (LGB)",
               "ROT_OXR (OXR)",
               "ROT_OZR (OZR)",
               "ROT_ROCOR (ROC-OR)",
               "ROT_RSE (RSE)",
               "ROT_SACM (SAC-M)",
               "ROT_SCNOR (SCN-OR)",
               "ROT_SFOT (SFO-T)",
               "ROT_SJC (SJC)",
               "ROT_SNA (SNA)",
               "ROT_SNAT (SNA-T)",
               "ROT_SPF (SPF)",
               "ROT_VDA (VDA)",
               "ROT_WGR (WGR)",
               "ROT_WGRM (WGR-M)",
               "ROT_WLD (WLD)",
               "ROT_WRO (WRO)",
               "ROT_ZRHT (ZRH-T)",
               "TIT_TR10 (T-R10)",
               "TIT_TS5 (T-S5)",
               "TIT_TS7 (T-S7)",
               "WEL_Alpha1 (Alpha-1)",
               "WEL_Cheyenne6 (Cheyenne 6)",
               "WEL_Vektor (Vektor)",
               "WOR_BackLabelZeastBST1 (Back Label Zeast BST1)",
               "WOR_BackLabelZeastBST2 (Back Label Zeast BST2)",
               "WOR_Brombacher (Brombacher)",
               "WOR_Equip03 (Equip 03)",
               "WOR_Equip40 (Equip 40)",
               "WOR_EquipRSZNegative (Ewing RSZ-Negative)",
               "WOR_GnosisCV201 (Gnosis CV201)",
               "WOR_GnosisCV202 (Gnosis CV202)",
               "WOR_GnosisCV203 (Gnosis CV203)",
               "WOR_GnosisCVX (Gnosis CVX)",
               "WOR_GnosisFCV01 (Gnosis FCV01)",
               "WOR_GnosisFCV03 (Gnosis FCV03)",
               "WOR_GnosisFMB03 (Gnosis FMB03)",
               "WOR_GnosisGR201 (Gnosis GR201)",
               "WOR_GnosisGR202 (Gnosis GR202)",
               "WOR_GnosisGR203 (Gnosis GR203)",
               "WOR_GnosisGS5 (Gnosis GS5)",
               "WOR_GnosisHS201 (Gnosis HS201)",
               "WOR_GnosisHS202 (Gnosis HS202)",
               "WOR_GnosisHS203 (Gnosis HS203)",
               "WOR_GranSeekerCCX (Gran Seeker CCX)",
               "WOR_LanvecLS1 (Lanvec LS1)",
               "WOR_MCORacingCS (M.C.O Racing Type-CS)",
               "WOR_MeisterCR01 (Meister CR01)",
               "WOR_MeisterL13P (Meister L1 3-Piece)",
               "WOR_MeisterM1R (Meister M1 R)",
               "WOR_MeisterS13P (Meister S1 3-piece)",
               "WOR_RSZR (RSZ-R)",
               "WOR_RyverS005 (Ryver S005)",
               "WOR_SeekerFX (Seeker FX)",
               "WOR_VSSS (VS SS)",
               "WOR_VSTX (VS TX)",
               "WOR_VSXX (VS XX)",
               "WOR_Emotion11R (WORK Emotion 11R)",
               "WOR_EmotionD9R (WORK Emotion D9R)",
               "WOR_EmotionM8R (WORK Emotion M8R)",
               "WOR_EmotionRSa (WORK Emotion RS-a)",
               "WOR_EmotionT5R (WORK Emotion T5R)",
               "WOR_EmotionT5R2P (WORK Emotion T5R 2-piece)",
               "WOR_EmotionT7R2P (WORK Emotion T7R 2-piece)",
               "WOR_XJDMConceptGT5 (X JDM Concept GT5)",
               "WOR_XTRAP03HC (XTRAP 03 HC)",
               "F52_MonoblockTarmac (Cast Monoblock Tarmac)"
            };

    public static String[] RIMS_ID = {
            "-1,STOCK,STOCK RIMS",
            "314,AME_TorqThrust,Torq-Thrust M",
            "316,BBS_RE,RE",
            "317,BBS_RK,RK",
            "325,BRA_MonoblockIV,Monoblock IV",
            "326,BRA_MonoblockVIMulti,Monoblock VI",
            "333,ENK_RPF1,RPF1",
            "337,FIK_FM10,FM/10",
            "338,FIK_Profil5,Profil 5",
            "339,FIK_Profil5S,Profil 5S",
            "342,GRA_57C,57C",
            "345,HRE_445R,445R",
            "349,HRE_546R,546R",
            "362,MOT_TrakLite2,TRAKLITE 2.0",
            "363,OET_TypeRE,Type RE",
            "370,OZ_SuperleggeraIII,Superleggera III Forged",
            "371,OZ_SuperturismoGT,Superturismo GT",
            "373,RAC_RGS,RGS",
            "374,RAC_RS2,RS 2 Modular",
            "379,RO_R27,R2-7",
            "380,RO_R25,R2-5",
            "387,TSW_Catalunya,Catalunya",
            "395,VOL_TE37,TE37",
            "631,5ZI_FNO1RC,FN01R-C",
            "632,5ZI_GN,GN+",
            "633,5ZI_ZR_520,ZR+520",
            "634,ADV_RGII,RGII",
            "635,ADV_SuperAdvanRV2,Super Advan Racing Version 2",
            "636,AME_Outlaw_II,Outlaw II",
            "637,ASA_AF118,AF 118",
            "638,ASA_AF134,AF 134",
            "639,ASA_AF140,AF 140",
            "641,BBS_RS_GT,RS-GT",
            "642,BOR_A,A",
            "643,BOR_CB,CB",
            "644,BOY_Slayer,Slayer",
            "645,BRA_Monoblock_S,Monoblock S",
            "646,BUD_P1_Racing_QF,P1 Racing QF",
            "647,COM_CXR,CXR",
            "648,COM_ML,ML",
            "649,COM_M05,M05",
            "650,COM_TH2,TH2",
            "651,CRA_Series313,Smoothie",
            "652,CRA_Series351,Street Lock D Window",
            "653,CRA_Series61,S/S Super Sport",
            "655,DUB_BigChips,Big Chips",
            "656,DUB_Presidential,Presidential",
            "657,DYM_9Spoke,9 Spoke",
            "658,ENK_NT03,NT03+M",
            "659,ENK_RS6,RS6",
            "660,ENK_TarmacEvo,Tarmac Evo",
            "661,GRA_57_Optimise,57 OPTIMISE",
            "662,GRA_T57_RC,T57-RC",
            "663,HAL_SprintII,Sprint II",
            "665,HOL_Hole_Star,Holestar",
            "666,HOL_Solid,Solid",
            "667,IFO_Astra,Astra",
            "668,IFO_Fabulous,Fabulous",
            "669,KON_After_Burner,After Burner",
            "670,KON_Britelite,Britelite",
            "671,KON_Daylite,Daylite",
            "672,KOS_K1_TS,K1-Racing TS-Version",
            "673,KOS_RT_Sport,RT SPORT",
            "674,LEX_LTC_701,LTC-701",
            "675,LEX_LTC_704,LTC-704",
            "676,LEX_MistikSpikes,Mistik Spikes",
            "680,MIC_Classic_Look,Classic Lock",
            "681,MIC_ET_Drag,ET Drag",
            "682,MOD_M3,M3",
            "683,MOD_M7,M7",
            "684,MOM_GTR,GTR",
            "685,MOM_Ten_S,TEN-S",
            "686,MOT_SP10,SP10",
            "687,MOT_TrackLite_1,TRAKLITE 1.0",
            "688,OET_Type_RXX,Type RXX",
            "691,ROT_J_SPL,J.SPL",
            "692,ROT_P45R,P45R",
            "693,ROT_Tarmac_3,Tarmac 3",
            "695,SPE_2014,2014",
            "696,TEA_Pro_Race_1,Pro Race 1",
            "697,TEA_Pro_Race_2,Pro Race 2",
            "698,TEN_DC6_V1,DC-6 V1",
            "699,TEN_RS_5,RS-5",
            "701,TSW_Hockenheim_R,Hockenheim R",
            "702,TSW_Trackstar_4,Trackstar 4",
            "703,VOL_RE30,RE30",
            "704,WED_SA70,SA-70",
            "705,WED_SA_97_F,SA-97 F",
            "706,WED_TC_105N,TC 105 N",
            "707,WEL_Alumastar_20_Drag,AlumaStar 2.0 Drag Race",
            "708,WOR_CRKai,CRkai",
            "709,WOR_Design_DH,Design DH",
            "710,WOR_Equip_01,Equip 01",
            "711,WOR_XD9,XD9",
            "10917,CRA_Series391,Bonneville Series 391",
            "10929,HOL_SunStar,Sunstar",
            "10959,WEL_MagnumIII,Magnum III",
            "12425,HRE_P101,P101",
            "12426,HRE_FF01,Flow FF01",
            "12427,HRE_C103,C103",
            "12428,HRE_943RL,943RL",
            "12429,HRE_945RL,945RL",
            "12430,HRE_454,Vintage 454",
            "12431,HRE_501,Vintage 501",
            "12432,HRE_505,Vintage 505",
            "12433,HRE_935,Vintage 935",
            "12434,HRE_S101,S101",
            "12435,HRE_RX43,RX43",
            "12436,HRE_P43SC,P43sc",
            "12437,HRE_P45SC,P45sc",
            "12438,HRE_P47SC,P47sc",
            "12441,MOM_Quantum,Quantum",
            "12442,MOM_Raptor,Raptor",
            "12443,MOM_Revenge,Revenge",
            "12444,MOM_Rush,Rush",
            "12445,MOM_Sting,Sting",
            "12446,HRE_P104,P104",
            "12447,HRE_P107,P107",
            "12448,HRE_C100,C100",
            "12449,HRE_C106,C106",
            "12450,HRE_C109,C109",
            "12451,HRE_940RL,940RL",
            "12452,HRE_948RL,948RL",
            "12453,HRE_S104,S104",
            "12454,HRE_S107,S107",
            "12455,HRE_P40sc,P40sc",
            "12456,HRE_P44sc,P44sc",
            "12900,ADV_10MV1CS,ADV10.0 M.V1 CS",
            "12901,ADV_005MV2CS,ADV005 M.V2 CS",
            "12902,ADV_08MV2CS,ADV08 M.V2 CS",
            "12903,ADV_10MV2CS,ADV10 M.V2 CS",
            "12904,ADV_15TSpecCS,ADV15 Track Spec CS",
            "12905,ADV_05TSpecCS,ADV05 Track Spec CS",
            "12906,ADV_06TSpecCS,ADV06 Track Spec CS",
            "12907,ADV_5TrackFunction,ADV5 Track Function",
            "12908,ADV_5TrackSpecCS,ADV5.0 Track Spec CS",
            "12909,ADV_05CMV2CS,ADV05C M.V2 CS",
            "12910,F52_MonoblockPenta,Forged Monoblock Penta",
            "12911,F52_MonoblockTurbomac,Cast Monoblock Turbomac",
            "12912,F52_Outlaw001,Forged 2pc Outlaw 001",
            "12913,F52_Tarmac348,Forged 3pc Tarmac 348",
            "12914,F52_EvoSC,Forged 3pc Evo SC",
            "12915,F52_FormulaTR,Forged 3pc Formula TR",
            "12916,F52_Forza,Forza Edition",
            "12917,F52_MonoblockTurbomac2,Cast Monoblock Turbomac (w/o fan)",
            "12918,ROT_BLQ,BLQ",
            "12919,ROT_BMI,BMI",
            "12920,ROT_CBU,CBU",
            "12921,ROT_FUC,FUC",
            "12922,ROT_IDK,IDK",
            "12923,ROT_NUE,NUE",
            "12924,ROT_VCET,VCE-T",
            "12925,ROT_MLW,MLW",
            "12926,ROT_SCR,SCR",
            "12927,ROT_USF,USF",
            "12928,ADV_Forza,ADV Forza",
            "13146,SPE_859,859",
            "13147,SPE_F1,F1",
            "13148,BBS_RSTurbofan,RS Turbofan",
            "13149,BBS_E55,E55",
            "13150,HAL_Indy,Indy",
            "13151,MOT_MR619,MR619",
            "13152,OZ_F1,F1",
            "13153,OZ_F1Deep,F1 Deep",
            "13154,VOL_TurboFan,Turbofan",
            "13156,TEA_COTF,COTF",
            "13157,KMC_XD228,XD228 Machete Desert",
            "13158,WEL_AlumastarBL,Alumastar Beadlock",
            "13617,5ZI_BeckettsMK5,Becketts MK5",
            "13624,5ZI_InperioSportsRS1,Inperio Sports RS-1",
            "13638,ADV_52MV1SL,ADV5.2 M.V1 SL",
            "13652,ADV_GT,GT",
            "13658,ADV_SuperAdvanSA3,Super Advan SA3",
            "13661,AME_AR61,AR61 OUTLAW I",
            "13662,AME_AR904,AR904",
            "13663,AME_AR907,AR907",
            "13664,AME_AR920,AR920 BLOCKHEAD",
            "13665,AME_AR924,AR924 CROSSFIRE",
            "13666,AME_AR927,AR927 BARRAGE",
            "13667,AME_VF101,VF101",
            "13670,AME_VF104,VF104",
            "13671,AME_VF300,VF300",
            "13672,AME_VF301,VF301",
            "13673,AME_VF302,VF302",
            "13675,AME_VF309,VF309",
            "13676,AME_VF310,VF310",
            "13677,AME_VF482,VF482",
            "13678,AME_VF501,VF501",
            "13679,AME_VF503,VF503",
            "13680,AME_VF526,VF526",
            "13681,AME_VF533,VF533",
            "13682,AME_VN205,VN205 CLASSIC TORQ THRUST II",
            "13683,AME_VN327,VN327 RALLY",
            "13684,AME_VN510,VN510 DRAFT",
            "13685,AME_VN511,VN511 SALT FLAT",
            "13686,ASA_ABL05,ABL-05 Altair",
            "13698,ASA_AF116,AF116",
            "13705,ASA_CX840,CX840",
            "13706,ASA_CX856,CX856",
            "13708,ASA_Monoblock101,Monoblock 101",
            "13709,ASA_Monoblock504,Monoblock 504",
            "13710,ASA_MonoblockSlate,Monoblock Slate",
            "13711,ASA_TL100,TL100",
            "13712,ASA_TL101,TL101",
            "13713,ASA_TL102,TL102",
            "13731,BBS_CHR,CH-R",
            "13737,ENK_TS5,TS5",
            "13745,GRA_57Transcend,57Transcend",
            "13752,HOL_HolestarSS,Holestar Signature Series",
            "13753,HOL_Modstar,Modstar",
            "13754,HOL_Pentastar,Pentastar",
            "13755,HOL_Sunflare,Sunflare",
            "13774,HRE_rb1,RB1",
            "13779,HRE_rs204m,RS204M",
            "13784,HRE_rs309,RS309",
            "13786,HRE_s201h,S201H",
            "13787,HRE_s204,S204",
            "13788,HRE_s207,S207",
            "13792,KMC_KM693,KM693 Maze",
            "13793,KMC_KM694,KM694 Wishbone",
            "13794,KMC_KM696,KM696 Pivot",
            "13795,KMC_KM703,KM703 Monophonic",
            "13815,LEX_M002,M-002",
            "13817,LEX_M108,M-108",
            "13819,MOD_B14,B14",
            "13833,MOD_H2,H2",
            "13834,MOD_H4,H4",
            "13835,MOD_M14,M14",
            "13836,MOD_M15,M15",
            "13838,MOD_M23,M23",
            "13839,MOD_S18,S18 Evo",
            "13841,MOM_Heritage6,Heritage 6",
            "13842,MOM_RF10S,RF-10S",
            "13846,MOT_FF5,FF5",
            "13850,MOT_MR121,MR121",
            "13851,MOT_MR124,MR124",
            "13854,MOT_MR139,MR139",
            "13857,MOT_MR221,MR221 Traklite 1.0 2-piece",
            "13860,OET_E,Type E",
            "13863,OZ_Alpina,Alpina",
            "13864,OZ_Ares,Ares",
            "13865,OZ_AspenHLT,Aspen HLT",
            "13866,OZ_FormulaHLT4H,Formula HLT 4H",
            "13867,OZ_HyperGTHLT,Hyper GT HLT",
            "13868,OZ_RallyRacing,Rally Racing",
            "13869,OZ_SuperturismoEvoluzione,Superturismo Evoluzione",
            "13870,OZ_UltraleggeraHLTCL,Ultraleggera HLT CL",
            "13871,OZ_Zeus,Zeus",
            "13872,RAC_S4,S4",
            "13873,RO_Formula5,Formula 5",
            "13879,ROT_SDR,SDR",
            "13881,ROT_356,356",
            "13882,ROT_AeroDisc,AeroDisc",
            "13883,ROT_BKK,BKK",
            "13884,ROT_BUC,BUC",
            "13885,ROT_CCV,CCV",
            "13886,ROT_CUF,CUF",
            "13887,ROT_DABM,DAB-M",
            "13888,ROT_DIA,DIA",
            "13889,ROT_EMA,EMA",
            "13890,ROT_FLG,FLG",
            "13891,ROT_HURT,HUR-T",
            "13892,ROT_IGS,IGS",
            "13893,ROT_INDT,IND-T",
            "13894,ROT_JDR,JDR",
            "13895,ROT_LASR,LAS-R",
            "13896,ROT_LGB,LGB",
            "13897,ROT_OXR,OXR",
            "13898,ROT_OZR,OZR",
            "13899,ROT_ROCOR,ROC-OR",
            "13900,ROT_RSE,RSE",
            "13901,ROT_SACM,SAC-M",
            "13902,ROT_SCNOR,SCN-OR",
            "13903,ROT_SFOT,SFO-T",
            "13904,ROT_SJC,SJC",
            "13905,ROT_SNA,SNA",
            "13906,ROT_SNAT,SNA-T",
            "13907,ROT_SPF,SPF",
            "13908,ROT_VDA,VDA",
            "13909,ROT_WGR,WGR",
            "13910,ROT_WGRM,WGR-M",
            "13911,ROT_WLD,WLD",
            "13912,ROT_WRO,WRO",
            "13913,ROT_ZRHT,ZRH-T",
            "13931,TIT_TR10,T-R10",
            "13932,TIT_TS5,T-S5",
            "13933,TIT_TS7,T-S7",
            "13986,WEL_Alpha1,Alpha-1",
            "13987,WEL_Cheyenne6,Cheyenne 6",
            "13991,WEL_Vektor,Vektor",
            "13992,WOR_BackLabelZeastBST1,Back Label Zeast BST1",
            "13993,WOR_BackLabelZeastBST2,Back Label Zeast BST2",
            "13994,WOR_Brombacher,Brombacher",
            "13995,WOR_Equip03,Equip 03",
            "13996,WOR_Equip40,Equip 40",
            "13997,WOR_EquipRSZNegative,Ewing RSZ-Negative",
            "13998,WOR_GnosisCV201,Gnosis CV201",
            "13999,WOR_GnosisCV202,Gnosis CV202",
            "14000,WOR_GnosisCV203,Gnosis CV203",
            "14001,WOR_GnosisCVX,Gnosis CVX",
            "14002,WOR_GnosisFCV01,Gnosis FCV01",
            "14003,WOR_GnosisFCV03,Gnosis FCV03",
            "14004,WOR_GnosisFMB03,Gnosis FMB03",
            "14005,WOR_GnosisGR201,Gnosis GR201",
            "14006,WOR_GnosisGR202,Gnosis GR202",
            "14007,WOR_GnosisGR203,Gnosis GR203",
            "14008,WOR_GnosisGS5,Gnosis GS5",
            "14009,WOR_GnosisHS201,Gnosis HS201",
            "14010,WOR_GnosisHS202,Gnosis HS202",
            "14011,WOR_GnosisHS203,Gnosis HS203",
            "14012,WOR_GranSeekerCCX,Gran Seeker CCX",
            "14013,WOR_LanvecLS1,Lanvec LS1",
            "14014,WOR_MCORacingCS,M.C.O Racing Type-CS",
            "14015,WOR_MeisterCR01,Meister CR01",
            "14016,WOR_MeisterL13P,Meister L1 3-Piece",
            "14017,WOR_MeisterM1R,Meister M1 R",
            "14018,WOR_MeisterS13P,Meister S1 3-piece",
            "14019,WOR_RSZR,RSZ-R",
            "14020,WOR_RyverS005,Ryver S005",
            "14021,WOR_SeekerFX,Seeker FX",
            "14022,WOR_VSSS,VS SS",
            "14023,WOR_VSTX,VS TX",
            "14024,WOR_VSXX,VS XX",
            "14025,WOR_Emotion11R,WORK Emotion 11R",
            "14026,WOR_EmotionD9R,WORK Emotion D9R",
            "14027,WOR_EmotionM8R,WORK Emotion M8R",
            "14028,WOR_EmotionRSa,WORK Emotion RS-a",
            "14029,WOR_EmotionT5R,WORK Emotion T5R",
            "14030,WOR_EmotionT5R2P,WORK Emotion T5R 2-piece",
            "14031,WOR_EmotionT7R2P,WORK Emotion T7R 2-piece",
            "14032,WOR_XJDMConceptGT5,X JDM Concept GT5",
            "14033,WOR_XTRAP03HC,XTRAP 03 HC",
            "50000,F52_MonoblockTarmac,Cast Monoblock Tarmac"
    };


    public static String ORDINALS =
                    "FXX,1006" +
                    "CCGT,1007" +
                    "Lancer Evolution X GSR,1009" +
                    "M3,1011" +
                    "F50 GT,1020" +
                    "430 Scuderia,1022" +
                    "F40 Competizione,1023" +
                    "Celica GT-Four ST205,1034" +
                    "M1,1040" +
                    "SVT Cobra R,1041" +
                    "Skyline 2000GT-R,1042" +
                    "Skyline GT-R V-Spec,1043" +
                    "Firebird Trans Am GTA,1045" +
                    "Viper SRT10 ACR,1046" +
                    "Z4 M Coupe,1059" +
                    "IMPREZA WRX STI,1060" +
                    "Charger Daytona HEMI,1063" +
                    "Camaro Z28,1064" +
                    "Corvette ZR1,1069" +
                    "Focus RS,1086" +
                    "Corvette,1093" +
                    "John Cooper Works,1098" +
                    "370Z,1103" +
                    "510,1104" +
                    "DB5,1105" +
                    "RS200 Evolution,1108" +
                    "MX-5 Miata,1110" +
                    "Reventón,1125" +
                    "M5,1126" +
                    "458 Italia,1131" +
                    "250 Testa Rossa,1154" +
                    "Cobra Daytona Coupe,1155" +
                    "Murciélago LP 670-4 SV,1173" +
                    "Zonda R,1175" +
                    "RS 6,1184" +
                    "SLS AMG,1202" +
                    "NULL CAR,1215" +
                    "RS 3 Sportback,1216" +
                    "EB110 Super Sport,1219" +
                    "TT RS Coupé,1220" +
                    "Golf R,1231" +
                    "911 Sport Classic,1234" +
                    "MT900S,1246" +
                    "LFA,1260" +
                    "Z3 M Coupe,1268" +
                    "2002 Turbo,1269" +
                    "DMC-12,1270" +
                    "250 California,1271" +
                    "Escort RS Cosworth,1272" +
                    "Civic Type R,1273" +
                    "Firebird Trans Am,1276" +
                    "Cuda 426 HEMI,1277" +
                    "240SX SE,1282" +
                    "GTO,1285" +
                    "El Camino Super Sport 454,1291" +
                    "Sierra Cosworth RS500,1293" +
                    "190E 2.5-16 Evolution II,1296" +
                    "Starion ESI-R,1297" +
                    "242 Turbo Evolution,1299" +
                    "Impala Super Sport 409,1300" +
                    "D-Type,1301" +
                    "Escort RS1800,1302" +
                    "Gran Turismo S,1304" +
                    "F1,1314" +
                    "365 GTB/4,1318" +
                    "599 GTO,1319" +
                    "Mustang Mach 1,1320" +
                    "Gallardo LP 570-4 Superleggera,1322" +
                    "WRX STI,1323" +
                    "Veyron Super Sport,1328" +
                    "GSX,1329" +
                    "Camaro Z28,1330" +
                    "Dart HEMI Super Stock,1332" +
                    "H1 Alpha,1345" +
                    "X5 M,1350" +
                    "SC300,1351" +
                    "Mustang GT Coupe,1355" +
                    "M5,1367" +
                    "M5,1368" +
                    "Zonda Cinque Roadster,1369" +
                    "Avant RS2,1370" +
                    "8 Litre,1372" +
                    "Elise Series 1 Sport 190,1376" +
                    "Impala Super Sport,1379" +
                    "Scirocco S,1380" +
                    "GTI VR6 Mk3,1383" +
                    "1 Series M Coupe,1385" +
                    "850 R,1387" +
                    "M5,1388" +
                    "Sesto Elemento,1392" +
                    "MR2 SC,1395" +
                    "Aventador LP700-4,1398" +
                    "RS 5 Coupé,1417" +
                    "M5,1418" +
                    "RX-8 R3,1426" +
                    "Scirocco R,1428" +
                    "Nova Super Sport 396,1429" +
                    "Beetle,1435" +
                    "Bel Air,1459" +
                    "F-150 SVT Raptor,1460" +
                    "Transit SuperSportVan,1477" +
                    "Gremlin X,1482" +
                    "Lotus Cortina,1486" +
                    "XKR-S,1496" +
                    "C 63 AMG Coupé Black Series,1500" +
                    "Celica GT-Four RC ST185,1517" +
                    "Wrangler Rubicon,1522" +
                    "Exige S,1523" +
                    "SLK 55 AMG,1525" +
                    "Capri RS3100,1529" +
                    "De Luxe Coupe,1530" +
                    "Vandura G-1500,1531" +
                    "Venom GT,1532" +
                    "Torana A9X,1533" +
                    "A110 1600s,1536" +
                    "911 GT2 RS,1539" +
                    "SRT Viper GTS,1562" +
                    "Corvette,1564" +
                    "Civic RS,1568" +
                    "Sprite MkI,1574" +
                    "Monte Carlo Super Sport,1575" +
                    "Escort RS1600,1580" +
                    "F-100,1581" +
                    "Aventador J,1583" +
                    "205 Turbo 16,1591" +
                    "Celica GT,1592" +
                    "599XX Evolution,1599" +
                    "Gallardo LP570-4 Spyder Performante,1601" +
                    "RS 4 Avant,1607" +
                    "G 65 AMG,1627" +
                    "Atom 500 V8,1651" +
                    "Superlight R500,1652" +
                    "X-Bow R,1653" +
                    "Shelby GT500,1654" +
                    "BRZ,1655" +
                    "A 45 AMG,1658" +
                    "Cooper S,1662" +
                    "P1,1667" +
                    "Mustang Boss 302,1668" +
                    "GT-R Black Edition (R35),2002" +
                    "John Cooper Works GP,2003" +
                    "MX-5,2004" +
                    "S2000 CR,2005" +
                    "Corvette ZR-1,2006" +
                    "86,2007" +
                    "RS 7 Sportback,2009" +
                    "R8 Coupé V10 plus 5.2 FSI quattro,2010" +
                    "Fiesta ST,2011" +
                    "M6 Coupe,2018" +
                    "Focus RS,2019" +
                    "E 63 AMG,2021" +
                    "Clio R.S. 200 EDC,2022" +
                    "LaFerrari,2034" +
                    "Mono,2040" +
                    "Veneno,2042" +
                    "MB Jeep,2049" +
                    "Type 35 C,2066" +
                    "8CTF,2068" +
                    "W154,2069" +
                    "Type D,2096" +
                    "D8 GTO,2105" +
                    "Grand Cherokee SRT,2108" +
                    "Civic CRX Mugen,2119" +
                    "Prelude Si,2121" +
                    "GEN-F GTS,2131" +
                    "i8,2133" +
                    "Defender 90,2135" +
                    "Golf R,2142" +
                    "Ranger T6 Rally Raid,2145" +
                    "Rally Fighter,2146" +
                    "Metro 6R4,2147" +
                    "X-Raid All4 Racing Countryman,2148" +
                    "Clio Williams,2149" +
                    "Type 2 De Luxe,2151" +
                    "M4 Coupe,2154" +
                    "Fiesta XR2,2158" +
                    "F-Type R Coupé,2162" +
                    "Civic Type R,2163" +
                    "Huracán LP 610-4,2164" +
                    "WRX STI,2168" +
                    "Mazdaspeed MX-5,2171" +
                    "MG3,2173" +
                    "RC F,2175" +
                    "LM 002,2176" +
                    "Corvette Z06,2177" +
                    "RS 4 Avant,2178" +
                    "S1,2179" +
                    "RS 6 Avant,2180" +
                    "V12 Vantage S,2181" +
                    "TTS Coupé,2182" +
                    "Camaro Z/28,2183" +
                    "458 Speciale,2184" +
                    "XFR-S,2185" +
                    "Bronco,2187" +
                    "One:1,2188" +
                    "650S Coupé,2189" +
                    "323 GT-R,2209" +
                    "XKR-S GT,2235" +
                    "#1107 Desert Dingo Racing Stock Bug,9999" +
                    "ATS-V,2262" +
                    "Challenger SRT Hellcat,2263" +
                    "MX-5,2267" +
                    "Skyline H/T 2000GT-R,2270" +
                    "911 Turbo S,2289" +
                    "918 Spyder,2290" +
                    "Cayman GTS,2293" +
                    "911 GT3 RS 4.0,2297" +
                    "NSX,2352" +
                    "Focus RS,2357" +
                    "GT,2363" +
                    "FXX K,2371" +
                    "De Luxe Five-Window Coupe,2372" +
                    "F-150 Raptor,2397" +
                    "Shelby GT350R,2400" +
                    "Isetta 300 Export,2412" +
                    "Manx,2416" +
                    "HQ Monaro GTS 350,2417" +
                    "Manta 400,2420" +
                    "CTS-V Sedan,2421" +
                    "Limited Edition Gen-F GTS Maloo,2422" +
                    "#6 Penske Sunoco T70 MkIIIB,9999" +
                    "#24 Tankpool24 Racing Truck,9999" +
                    "Corsa VXR,2427" +
                    "Nomad,2430" +
                    "X6 M,2431" +
                    "Q60 Concept,2437" +
                    "488 GTB,2467" +
                    "Charger SRT Hellcat,2468" +
                    "2000GT,247" +
                    "C 63 S Coupé,2471" +
                    "570S Coupé,2472" +
                    "R8 V10 plus,2473" +
                    "TS1,2474" +
                    "M2 Coupé,2477" +
                    "Aventador Superveloce,2479" +
                    "RXC Turbo,2486" +
                    "250 GTO,249" +
                    "F-TYPE Project 7,2492" +
                    "Vantage GT12,2493" +
                    "Range Rover Sport SVR,2494" +
                    "150 Utility Sedan,2507" +
                    "300 SL Coupé,251" +
                    "Sandman HQ panel van,2510" +
                    "CJ5 Renegade,2511" +
                    "Skyline GTS-R (HR31),2512" +
                    "The Cholla,2515" +
                    "#11 Rockstar F-150 Trophy Truck,9999" +
                    "RZR XP 1000 EPS,2521" +
                    "Regera,2526" +
                    "DB11,2527" +
                    "911 GT3 RS,2528" +
                    "Cayman GT4,2529" +
                    "F355 Berlinetta,253" +
                    "968 Turbo S,2534" +
                    "3-Eleven,2541" +
                    "Viper ACR,2544" +
                    "#3 917 LH,9999" +
                    "FPV Limited Edition Pursuit Ute,2551" +
                    "Class 10 Race Car,2552" +
                    "Scout 800A,2558" +
                    "Mk II 3.8,2559" +
                    "Series III,2560" +
                    "3 Wheeler,2562" +
                    "Supervan III,2563" +
                    "FJ40,2566" +
                    "Class 5/1600 Baja Bug,2568" +
                    "Evolution Coupe 1020,2569" +
                    "575M Maranello,257" +
                    "XE-S,2570" +
                    "F-PACE S,2571" +
                    "M12S Warthog CST,2574" +
                    "Bone Shaker,2575" +
                    "F12tdf,2577" +
                    "Falcon GT F 351,2580" +
                    "Falcon XA GT-HO,2585" +
                    "V60 Polestar,2586" +
                    "911 Carrera RS,260" +
                    "911 GT2,261" +
                    "Jimmy,2613" +
                    "Mustang GT 2+2 Fastback,2614" +
                    "Centenario LP 770-4,2616" +
                    "GT-R (R35),2618" +
                    "911 GT3,262" +
                    "Chiron,2624" +
                    "Bentayga,2625" +
                    "M4 GTS,2628" +
                    "#1 T100 Baja Truck,9999" +
                    "Huayra BC,2647" +
                    "Crown Victoria Police Interceptor,2649" +
                    "911 Turbo 3.3,265" +
                    "GT R,2654" +
                    "Hilux Arctic Trucks AT38,2656" +
                    "Silvia K's Aero,2659" +
                    "914/6,266" +
                    "TITAN Warrior Concept,2662" +
                    "#37 Polaris RZR-Rockstar Energy Pro 2 Truck,9999" +
                    "Continental Supersports,2665" +
                    "944 Turbo,268" +
                    "959,269" +
                    "X5 Traffic,2708" +
                    "Transit SuperSportVan Traffic,2710" +
                    "3 Traffic,2711" +
                    "Galant Traffic,2712" +
                    "Box Truck,2713" +
                    "Bus,2714" +
                    "Chevrolet Bel Air,2728" +
                    "Chevrolet Napalm Nova,2729" +
                    "Ford Escort RS1800,2730" +
                    "Mazda RX-7 Twerkstallion,2732" +
                    "Ford \"Hoonicorn\" Mustang,2734" +
                    "Rauh-Welt Begriff Porsche 911 Turbo,2736" +
                    "NISMO GT-R LM,2738" +
                    "Camaro ZL1,2739" +
                    "Panamera Turbo,2741" +
                    "Trailcat,2742" +
                    "Land Cruiser Arctic Trucks AT37,2743" +
                    "Pickup #23 Rally Raid,2744" +
                    "Twin Mill,2750" +
                    "911 GT2 RS,2755" +
                    "Cayenne Turbo,2773" +
                    "#2 GT40 Mk II,9999" +
                    "#24 Ferrari Spa 330 P4,9999" +
                    "Elise GT1,2825" +
                    "2500 Power Wagon,2838" +
                    "Durango SRT,2839" +
                    "Grand Cherokee Trackhawk,2841" +
                    "05RR,2844" +
                    "720S Coupé,2846" +
                    "Colorado ZR2,2847" +
                    "Levante S,2865" +
                    "Civic Type R,2870" +
                    "Maverick X RS Turbo R,2871" +
                    "Veloster N,2872" +
                    "Camaro Super Sport Coupe,289" +
                    "Fiesta Traffic,2894" +
                    "Flatbed,2902" +
                    "Legacy Traffic,2903" +
                    "Bora Traffic,2905" +
                    "GTI Traffic,2906" +
                    "Challenger SRT Demon,2909" +
                    "Lotus Carlton,291" +
                    "Agera RS,2910" +
                    "Minor 1000,2911" +
                    "Carrera GT,292" +
                    "De Luxe Five-Window Coupe Forza Edition,2930" +
                    "F9,2935" +
                    "#14 Rahal Letterman Lanigan Racing Fiesta,9999" +
                    "CC8S,294" +
                    "Sesto Elemento Forza Edition,2941" +
                    "#24 Tankpool24 Racing Truck Forza Edition,9999" +
                    "AMG CLK GTR Forza Edition,2948" +
                    "Celica SS-I,295" +
                    "Fairlady Z Forza Edition,2951" +
                    "Cerbera Speed 12,296" +
                    "Minor 1000 Forza Edition,2964" +
                    "360 Challenge Stradale,297" +
                    "A110,2973" +
                    "812 Superfast,2974" +
                    "Blower 4-1/2 Litre Supercharged,2976" +
                    "Anglia 105E,2979" +
                    "GT40 MKI,2980" +
                    "Escort RS Turbo,2981" +
                    "GYMKHANA 10 Ford F-150 'Hoonitruck',2982" +
                    "GYMKHANA 10 Ford Escort Cosworth Group A,2984" +
                    "Range Rover,2985" +
                    "Unimog U5023,2986" +
                    "P50,2987" +
                    "Senna,2988" +
                    "Napier-Railton,2989" +
                    "Chevelle Super Sport 454,299" +
                    "Lightweight E-Type,2992" +
                    "Griffith,2993" +
                    "Golf GTI,2995" +
                    "#13 Ford Mustang,9999" +
                    "#530 HSV Maloo GEN-F,9999" +
                    "#777 Nissan 240SX,9999" +
                    "#43 Dodge Viper SRT10,9999" +
                    "Trident,3005" +
                    "GYMKHANA 10 Ford Hoonicorn Mustang,3006" +
                    "#34 Andretti Beetle,9999" +
                    "Civic Type R,302" +
                    "SSK,3026" +
                    "#185 959 Prodrive Rally Raid,9999" +
                    "356 A 1600 Super,3036" +
                    "#98 BMW 325i,9999" +
                    "Mustang GT,3046" +
                    "M-Sport Fiesta RS,3051" +
                    "C-X75,3055" +
                    "Cobra 427 S/C,306" +
                    "X-Class,3063" +
                    "GT 4-Door Coupé,3064" +
                    "Civic Coupe,3069" +
                    "M5,3071" +
                    "911 GT3 RS,3072" +
                    "Macan Turbo,3074" +
                    "MC12 Versione Corsa,3082" +
                    "Chevrolet Silverado 1500 Drift Truck,3088" +
                    "Exocet Off-Road,3089" +
                    "Corrado VR6,309" +
                    "Vantage,3091" +
                    "#25 Mustang RTR,9999" +
                    "G 63 AMG 6x6,3107" +
                    "Mustang RTR Spec 5,3108" +
                    "F-150 Prerunner,3109" +
                    "Wrangler Unlimited,3110" +
                    "GYMKHANA 10 Ford Focus RS RX,3115" +
                    "718 Cayman GTS,3117" +
                    "Corvette ZR1,3118" +
                    "Ford RS200 Evolution,3119" +
                    "Corvette Stingray 427,312" +
                    "Urus,3120" +
                    "GTC4Lusso,3122" +
                    "911 Carrera S,3123" +
                    "Transit,3126" +
                    "#25 Brocky Ultra4 Bronco RTR,9999" +
                    "Mégane R26.R,3129" +
                    "John Cooper Works Countryman ALL4,3131" +
                    "X-raid John Cooper Works Buggy,3132" +
                    "MEGANE R.S.,3134" +
                    "Range Rover Velar First Edition,3136" +
                    "Corvette Z06,314" +
                    "Concept Two,3140" +
                    "Intensa Emozione,3141" +
                    "Camaro ZL1 1LE,3149" +
                    "Corvette ZR-1,315" +
                    "#88 Mustang RTR,9999" +
                    "600LT Coupé,3153" +
                    "720S Spider,3154" +
                    "Speedtail,3156" +
                    "Countach LP5000 QV,316" +
                    "I-PACE,3164" +
                    "GT70,3167" +
                    "Divo,3168" +
                    "Supervan 3,3170" +
                    "Z4 Roadster,3173" +
                    "Ranger Raptor,3174" +
                    "AMG Hammer Coupe,3176" +
                    "205 Rallye,3180" +
                    "Racing Escort MK1,3183" +
                    "#5 Escort RS1800 MkII,9999" +
                    "DBS Superleggera,3185" +
                    "Macan LPR Rally Raid,3187" +
                    "#65 Rothsport Racing 911 Desert Flyer,9999" +
                    "VelociRaptor 6X6,3189" +
                    "Espada 400 GT,3191" +
                    "Zerouno,3194" +
                    "Tachyon Speed,3196" +
                    "CR-X SiR,320" +
                    "Cyclone Spoiler,3206" +
                    "Vulcan AMR Pro,3211" +
                    "TSR-S,3212" +
                    "Huracán Performante,3217" +
                    "Portofino,3225" +
                    "J50,3226" +
                    "488 Pista,3227" +
                    "Racing Puma,3228" +
                    "#777 Chevrolet Corvette,9999" +
                    "Diablo GTR,324" +
                    "#64 Nissan 370Z,9999" +
                    "#117 599 GTB Fiorano,9999" +
                    "Diablo SV,325" +
                    "E 63 S,3250" +
                    "Gladiator Rubicon,3255" +
                    "Pulsar GTI-R,3257" +
                    "Dino 246 GT,326" +
                    "4L Export,3261" +
                    "Eclipse GSX,327" +
                    "XPower SV-R,3271" +
                    "S1,3276" +
                    "Mustang Shelby GT500,3277" +
                    "Flatbed Truck,3279" +
                    "TT RS,3286" +
                    "Sport XJR-15,3287" +
                    "Aventador SVJ,3289" +
                    "XJ220S TWR,3293" +
                    "Elan Sprint,330" +
                    "FXX-K Evo,3311" +
                    "Monza SP2,3312" +
                    "Jesko,3315" +
                    "Enzo Ferrari,333" +
                    "E-type,336" +
                    "Valhalla Concept Car,3364" +
                    "EP9,3366" +
                    "Corvette Stingray Coupé,3369" +
                    "Ford Escort RS Cosworth WRC Cossie V2,3370" +
                    "Huracán EVO,3371" +
                    "F1 GT,338" +
                    "8 Gordini,3395" +
                    "F40,340" +
                    "#99 Mazda RX-8,9999" +
                    "GR Supra,3402" +
                    "#2069 Ford Performance Bronco R,9999" +
                    "#34 Toyota Supra MkIV,9999" +
                    "STI S209,3412" +
                    "Golf R,3413" +
                    "Defender 110 X,3414" +
                    "XJ13,3415" +
                    "F50,342" +
                    "Fairlady Z 432,343" +
                    "GT,3437" +
                    "Fairlady Z,344" +
                    "Toyota Tacoma TRD The Performance Truck,3441" +
                    "Taycan Turbo S,3445" +
                    "#357 Chevrolet Corvette Z06,9999" +
                    "Evija,3449" +
                    "Fairlady Z Version S Twin Turbo,345" +
                    "Super Duty F-450 DRW PLATINUM,3476" +
                    "GT,348" +
                    "Colorado ZR2,3483" +
                    "Bronco,3484" +
                    "F-150 Raptor,3485" +
                    "Wrangler Rubicon,3486" +
                    "X-Class,3487" +
                    "Beetle,3488" +
                    "Bronco,3489" +
                    "Monster Trucks Bone Shaker,3514" +
                    "#151 Toyota GR Supra,9999" +
                    "#411 Toyota Corolla Hatchback,9999" +
                    "Toyota Gumout 2JZ Camry Stock Car,3528" +
                    "Nissan Gold Leader Datsun 280Z,3529" +
                    "Golf Gti 16v Mk2,353" +
                    "Golf R32,354" +
                    "RX3,3540" +
                    "Sunshine S,3548" +
                    "#91 BMW M2,9999" +
                    "X5 M Forza Edition,3556" +
                    "Corvette Forza Edition,3559" +
                    "Charger R/T Forza Edition,3561" +
                    "Exocet Off-Road Forza Edition,3562" +
                    "Racing Puma Forza Edition,3564" +
                    "Gran Turismo S Forza Edition,3568" +
                    "GTO,357" +
                    "Manx Forza Edition,3570" +
                    "Huayra BC Forza Edition,3572" +
                    "Firebird Trans Am GTA Forza Edition,3573" +
                    "911 GT3 RS Forza Edition,3574" +
                    "Beetle Forza Edition,3577" +
                    "288 GTO,358" +
                    "Impreza 22B-STi Version,363" +
                    "Carnival Float,3634" +
                    "Beetle,3636" +
                    "Metro 6R4,3639" +
                    "IMPREZA WRX STi,364" +
                    "Focus RS,3640" +
                    "IMPREZA WRX STI,365" +
                    "Mercedes-AMG ONE,3650" +
                    "Beetle Traffic Taxi,3664" +
                    "Integra Type R,368" +
                    "Supra RZ,3681" +
                    "Welcome Pack Intensa Emozione,3682" +
                    "Welcome Pack Lancer Evolution X GSR,3683" +
                    "Welcome Pack #2069 Ford Bronco R,3684" +
                    "Welcome Pack Taycan Turbo S,3685" +
                    "Welcome Pack GT 'OPI Edition',3699" +
                    "Lancer Evolution IX MR,374" +
                    "Lancer Evolution VI GSR,375" +
                    "Lancer Evolution VIII MR,378" +
                    "M3,382" +
                    "M3,383" +
                    "Monaro VXR,397" +
                    "SVT Cobra R,405" +
                    "NSX-R,411" +
                    "NSX-R,412" +
                    "Regal GNX,417" +
                    "RS 4,419" +
                    "RS 6,420" +
                    "RSX Type S,422" +
                    "Savanna RX-7,423" +
                    "RX-7,424" +
                    "RX-7 Spirit R Type-A,425" +
                    "S2000,427" +
                    "S7,432" +
                    "Sagaris,433" +
                    "Silvia CLUB K's,439" +
                    "Silvia K's,440" +
                    "Silvia Spec-R,441" +
                    "Skyline GT-R V-Spec,444" +
                    "Skyline GT-R V-Spec II,445" +
                    "Sprinter Trueno GT Apex,455" +
                    "Supra 2.0 GT,460" +
                    "Supra RZ,461" +
                    "Viper GTS ACR,483" +
                    "XJ220,489" +
                    "Charger R/T,513" +
                    "M3-GTR,565" +
                    "R390 (GT1),567" +
                    "AMG CLK GTR,568" +
                    "NSX-R GT,569" +
                    "207 Super 2000,615" +
                    "Civic Type R,625" +
                    "Sport quattro,633" +
                    "5 Turbo,634" +
                    "Miura P400,637" +
                    "Challenger R/T,639" +
                    "911 GT1 Strassenversion,641" +
                    "M3,642" +
                    "205 T16,9000" +
                    "Mercedes-AMG ONE,9003" +
                    "Ferrari FXX,1006" +
                    "Koenigsegg CCGT,1007" +
                    "Lancer GSR '08,1009" +
                    "BMW M3 '08,1011" +
                    "Ferrari F50 GT,1020" +
                    "Ferrari 430 S,1022" +
                    "Ferrari F40 C,1023" +
                    "Toyota Celica'94,1034" +
                    "BMW M1,1040" +
                    "Ford Mustang '93,1041" +
                    "Nissan GT-R '71,1042" +
                    "Nissan GT-R '97,1043" +
                    "Pontiac T/A '87,1045" +
                    "Dodge Viper '08,1046" +
                    "BMW Z4 '08,1059" +
                    "SUBARU WRX '08,1060" +
                    "Charger Daytona,1063" +
                    "Chevy Camaro '79,1064" +
                    "Corvette '09,1069" +
                    "Ford Focus '09,1086" +
                    "Corvette '60,1093" +
                    "MINI JCW '09,1098" +
                    "Nissan 370Z,1103" +
                    "Datsun 510,1104" +
                    "AM DB5,1105" +
                    "Ford RS200,1108" +
                    "Mazda MX-5 '94,1110" +
                    "Lambo Reventón,1125" +
                    "BMW M5 '09,1126" +
                    "Ferrari 458,1131" +
                    "Ferrari 250 TR,1154" +
                    "Shelby Daytona,1155" +
                    "Lambo Murciélago,1173" +
                    "Pagani Zonda R,1175" +
                    "Audi RS 6 '09,1184" +
                    "M-B SLS AMG,1202" +
                    "NULL CAR,1215" +
                    "Audi RS 3,1216" +
                    "Bugatti EB110,1219" +
                    "Audi TT RS,1220" +
                    "VW Golf R '10,1231" +
                    "Porsche 911 SC,1234" +
                    "Mosler MT900S,1246" +
                    "Lexus LFA,1260" +
                    "BMW Z3,1268" +
                    "BMW 2002 Turbo,1269" +
                    "DeLorean DMC-12,1270" +
                    "Ferrari 250 Cali,1271" +
                    "Ford Escort '92,1272" +
                    "Honda Civic '97,1273" +
                    "Pontiac T/A '77,1276" +
                    "Plymouth Cuda,1277" +
                    "Nissan 240SX,1282" +
                    "Pontiac GTO '65,1285" +
                    "Chevy El Camino,1291" +
                    "Ford RS500,1293" +
                    "M-B 190E,1296" +
                    "Starion ESI-R,1297" +
                    "Volvo 242 Turbo,1299" +
                    "Chevy Impala,1300" +
                    "Jaguar D-Type,1301" +
                    "Ford Escort '77,1302" +
                    "Maserati GT-S,1304" +
                    "McLaren F1,1314" +
                    "Ferrari 365 GTB4,1318" +
                    "Ferrari 599 GTO,1319" +
                    "Ford Mustang '71,1320" +
                    "Lambo Gallardo,1322" +
                    "SUBARU WRX '11,1323" +
                    "Bugatti Veyron,1328" +
                    "Buick GSX,1329" +
                    "Chevy Camaro '70,1330" +
                    "Dodge Dart '68,1332" +
                    "HUMMER H1,1345" +
                    "BMW X5 M,1350" +
                    "Lexus SC300,1351" +
                    "Ford Mustang '65,1355" +
                    "BMW M5 '03,1367" +
                    "BMW M5 '88,1368" +
                    "Pagani Zonda C,1369" +
                    "Audi RS2 '95,1370" +
                    "Bentley 8 Litre,1372" +
                    "Lotus Elise '99,1376" +
                    "Chevy Impala '96,1379" +
                    "VW Scirocco '81,1380" +
                    "VW Golf '98,1383" +
                    "BMW 1M,1385" +
                    "Volvo 850,1387" +
                    "BMW M5 '12,1388" +
                    "Lambo Sesto,1392" +
                    "Toyota MR2 '89,1395" +
                    "Aventador '12,1398" +
                    "Audi RS 5,1417" +
                    "BMW M5 '95,1418" +
                    "Mazda RX-8,1426" +
                    "VW Scirocco '11,1428" +
                    "Chevy Nova '69,1429" +
                    "VW Beetle,1435" +
                    "Chevy Bel Air,1459" +
                    "Ford Raptor '11,1460" +
                    "Ford Transit SSV,1477" +
                    "AMC Gremlin,1482" +
                    "Ford Cortina,1486" +
                    "Jaguar XKR-S '12,1496" +
                    "M-B C63,1500" +
                    "Toyota Celica'92,1517" +
                    "Jeep Wrangler,1522" +
                    "Lotus Exige S,1523" +
                    "M-B SLK,1525" +
                    "Ford Capri MkI,1529" +
                    "Ford Coupe '40,1530" +
                    "GMC Vandura,1531" +
                    "Hennessey Venom,1532" +
                    "Holden Torana,1533" +
                    "Alpine A110 '73,1536" +
                    "911 GT2 RS '12,1539" +
                    "Dodge Viper '13,1562" +
                    "Corvette '53,1564" +
                    "Honda Civic '74,1568" +
                    "Sprite MkI,1574" +
                    "Chevy MonteCarlo,1575" +
                    "Ford Escort '73,1580" +
                    "Ford F-100,1581" +
                    "Aventador J,1583" +
                    "Peugeot 205 T16,1591" +
                    "Toyota Celica'74,1592" +
                    "Ferrari 599XX E,1599" +
                    "Gallardo Spyder,1601" +
                    "Audi RS 4 '13,1607" +
                    "M-B G 65,1627" +
                    "Ariel Atom,1651" +
                    "Caterham R500,1652" +
                    "KTM X-Bow,1653" +
                    "Ford Mustang '13,1654" +
                    "SUBARU BRZ,1655" +
                    "M-B A45,1658" +
                    "MINI '65,1662" +
                    "McLaren P1,1667" +
                    "Ford Mustang '69,1668" +
                    "Nissan GT-R '12,2002" +
                    "MINI JCW '12,2003" +
                    "Mazda MX-5 '13,2004" +
                    "Honda S2000,2005" +
                    "Corvette '95,2006" +
                    "Toyota 86,2007" +
                    "Audi RS 7,2009" +
                    "Audi R8 '13,2010" +
                    "Ford Fiesta '14,2011" +
                    "BMW M6 '13,2018" +
                    "Ford Focus '03,2019" +
                    "M-B E63,2021" +
                    "Renault Clio '13,2022" +
                    "LaFerrari,2034" +
                    "BAC Mono,2040" +
                    "Lambo Veneno,2042" +
                    "Willys Jeep,2049" +
                    "Bugatti T35 C,2066" +
                    "Maserati 8CTF,2068" +
                    "M-B W154,2069" +
                    "AutoUnion Type D,2096" +
                    "Donkervoort GTO,2105" +
                    "Cherokee '14,2108" +
                    "Honda Civic '84,2119" +
                    "Honda Prelude 94,2121" +
                    "HSV GEN-F GTS,2131" +
                    "BMW i8,2133" +
                    "LR Defender,2135" +
                    "VW Golf R '14,2142" +
                    "Ford Ranger T6,2145" +
                    "Rally Fighter,2146" +
                    "MG Metro 6R4,2147" +
                    "MINI X-Raid,2148" +
                    "Renault Clio '93,2149" +
                    "VW Type 2,2151" +
                    "BMW M4 '14,2154" +
                    "Ford Fiesta '81,2158" +
                    "Jaguar F-TYPE,2162" +
                    "Honda Civic '16,2163" +
                    "Lambo Huracán,2164" +
                    "SUBARU WRX '15,2168" +
                    "Mazda MX-5 '05,2171" +
                    "MG MG3,2173" +
                    "Lexus RC F,2175" +
                    "Lambo LM 002,2176" +
                    "Corvette '15,2177" +
                    "Audi RS 4 '01,2178" +
                    "Audi S1,2179" +
                    "Audi RS 6 '15,2180" +
                    "Vantage S '13,2181" +
                    "Audi TTS,2182" +
                    "Chevy Camaro '15,2183" +
                    "Ferrari 458 S,2184" +
                    "Jaguar XFR-S,2185" +
                    "Ford Bronco,2187" +
                    "Koenigsegg One,2188" +
                    "McLaren 650S,2189" +
                    "Mazda 323 GT-R,2209" +
                    "Jaguar XKR-S '15,2235" +
                    "#1107 VW Bug,9999" +
                    "Caddy ATS-V,2262" +
                    "Challenger '15,2263" +
                    "Mazda MX-5 '16,2267" +
                    "Nissan GT-R '73,2270" +
                    "911 Turbo '14,2289" +
                    "Porsche 918,2290" +
                    "Porsche Cayman,2293" +
                    "911 GT3 RS4 '12,2297" +
                    "Acura NSX '17,2352" +
                    "Ford Focus '17,2357" +
                    "Ford GT '17,2363" +
                    "Ferrari FXX K,2371" +
                    "Ford Coupe '32,2372" +
                    "Ford Raptor '17,2397" +
                    "Ford Mustang '16,2400" +
                    "BMW Isetta,2412" +
                    "Meyers Manx,2416" +
                    "Holden Monaro,2417" +
                    "Opel Manta 400,2420" +
                    "Caddy CTS-V '16,2421" +
                    "HSV Maloo '14,2422" +
                    "#6 Lola T70,9999" +
                    "#24 M-B Truck,9999" +
                    "VauxCorsa '16,2427" +
                    "Ariel Nomad,2430" +
                    "BMW X6 M,2431" +
                    "Infiniti Q60,2437" +
                    "Ferrari 488 GTB,2467" +
                    "Dodge Charger 15,2468" +
                    "Toyota 2000GT,247" +
                    "M-B AMG C 63 '16,2471" +
                    "McLaren 570S,2472" +
                    "Audi R8 V10 plus,2473" +
                    "Zenvo TS1,2474" +
                    "BMW M2,2477" +
                    "Aventador '16,2479" +
                    "Radical RXC,2486" +
                    "Ferrari 250 GTO,249" +
                    "Jaguar Project 7,2492" +
                    "AM Vantage '16,2493" +
                    "Range Rover '15,2494" +
                    "Chevy 150 Sedan,2507" +
                    "M-B 300SL,251" +
                    "Holden Sandman,2510" +
                    "Jeep CJ5,2511" +
                    "Nissan GTS-R '87,2512" +
                    "Penhall Cholla,2515" +
                    "#11 Ford F-150,9999" +
                    "RZR 1000,2521" +
                    "Regera,2526" +
                    "AM DB11,2527" +
                    "911 GT3 RS '16,2528" +
                    "Porsche Cayman,2529" +
                    "Ferrari F355,253" +
                    "Porsche 968,2534" +
                    "Lotus 3-Eleven,2541" +
                    "Dodge Viper '16,2544" +
                    "Porsche 917 LH,2549" +
                    "Ford Ute '14,2551" +
                    "Alumi Craft C.10,2552" +
                    "IH Scout 800A,2558" +
                    "Jaguar Mk II 3.8,2559" +
                    "LR Series III,2560" +
                    "Morgan 3 Wheeler,2562" +
                    "Reliant Supervan,2563" +
                    "Toyota FJ40,2566" +
                    "VW Class 5 Bug,2568" +
                    "Ultima 1020,2569" +
                    "Ferrari 575M,257" +
                    "Jaguar XE-S,2570" +
                    "Jaguar F-PACE S,2571" +
                    "M12S Warthog CST,2574" +
                    "Bone Shaker,2575" +
                    "Ferrari F12tdf,2577" +
                    "Ford Falcon '15,2580" +
                    "Ford Falcon '72,2585" +
                    "Volvo V60,2586" +
                    "911 Carrera '73,260" +
                    "911 GT2 '95,261" +
                    "GMC K5 Jimmy,2613" +
                    "Ford Mustang '68,2614" +
                    "Lambo Centenario,2616" +
                    "Nissan GT-R '17,2618" +
                    "911 GT3 '04,262" +
                    "Bugatti Chiron,2624" +
                    "Bentley Bentayga,2625" +
                    "BMW M4 '16,2628" +
                    "#1 Toyota T100,9999" +
                    "Pagani Huayra BC,2647" +
                    "Crown Victoria,2649" +
                    "911 Turbo '82,265" +
                    "M-B AMG GTR,2654" +
                    "Toyota AT38,2656" +
                    "Silvia '98,2659" +
                    "Porsche 914/6,266" +
                    "Nissan TITAN,2662" +
                    "#37 Pro 2 Truck,9999" +
                    "Bentley Cont '17,2665" +
                    "Porsche 944,268" +
                    "Porsche 959,269" +
                    "BMW Traffic,2708" +
                    "Ford Traffic,2710" +
                    "Mazda Traffic,2711" +
                    "Galant Traffic,2712" +
                    "Box Traffic,2713" +
                    "Bus Traffic,2714" +
                    "Hoonigan Bel Air,2728" +
                    "Hoonigan Nova,2729" +
                    "Hoonigan Escort,2730" +
                    "Twerkstallion,2732" +
                    "Hoonicorn,2734" +
                    "Hoonigan Porsche,2736" +
                    "Nissan GT-R '95,2738" +
                    "Chevy Camaro '17,2739" +
                    "Porsche Panamera,2741" +
                    "Jeep Trailcat,2742" +
                    "Toyota AT37,2743" +
                    "#23 Nissan RR,9999" +
                    "Twin Mill,2750" +
                    "911 GT2 RS '18,2755" +
                    "Porsche Cayenne,2773" +
                    "#2 Ford GT40,9999" +
                    "#24 Ferrari P4,9999" +
                    "Lotus Elise GT1,2825" +
                    "RAM Power Wagon,2838" +
                    "Dodge Durango,2839" +
                    "Jeep Trackhawk,2841" +
                    "VUHL 05RR,2844" +
                    "McLaren 720S,2846" +
                    "Chevrolet ZR2,2847" +
                    "Maserati Levante,2865" +
                    "Honda Civic '18,2870" +
                    "Can-Am Maverick,2871" +
                    "Veloster N,2872" +
                    "Chevy Camaro '69,289" +
                    "Fiesta Traffic,2894" +
                    "Flatbed Traffic,2902" +
                    "Legacy Traffic,2903" +
                    "Bora Traffic,2905" +
                    "GTI Traffic,2906" +
                    "Dodge SRT Demon,2909" +
                    "Vaux Carlton,291" +
                    "Agera RS,2910" +
                    "Morris Minor,2911" +
                    "Porsche Carrera,292" +
                    "Ford Coupe FE,2930" +
                    "Funco F9,2935" +
                    "#14 Ford Fiesta,9999" +
                    "Koenigsegg CC8S,294" +
                    "Lambo Sesto FE,2941" +
                    "#24 M-B Truck FE,9999" +
                    "M-B CLK-GTR FE,2948" +
                    "Toyota Celica'03,295" +
                    "Fairlady Z FE,2951" +
                    "TVR Speed 12,296" +
                    "Morris Minor FE,2964" +
                    "Ferrari 360 CS,297" +
                    "Alpine A110 '17,2973" +
                    "Ferrari 812,2974" +
                    "Bentley Blower,2976" +
                    "Ford Anglia '59,2979" +
                    "Ford GT40 '64,2980" +
                    "Ford Escort RS,2981" +
                    "Hoonigan F-150,2982" +
                    "Hoonigan Group A,2984" +
                    "Range Rover '73,2985" +
                    "M-B Unimog,2986" +
                    "Peel P50,2987" +
                    "McLaren Senna,2988" +
                    "Napier Railton,2989" +
                    "Chevelle '70,299" +
                    "Jaguar LW E-Type,2992" +
                    "TVR Griffith,2993" +
                    "VW Golf GTI '83,2995" +
                    "#13 Ford Mustang,9999" +
                    "#530 HSV Maloo,9999" +
                    "#777 Nissan 240,9999" +
                    "#43 Dodge Viper,9999" +
                    "Peel Trident,3005" +
                    "Hoonicorn v2,3006" +
                    "#34 VW Beetle,9999" +
                    "Honda Civic '04,302" +
                    "M-B SSK,3026" +
                    "#185 Porsche 959,9999" +
                    "Porsche 356 '59,3036" +
                    "#98 BMW 325i,9999" +
                    "Ford Mustang '18,3046" +
                    "Ford Fiesta RS,3051" +
                    "Jaguar C-X75,3055" +
                    "Shelby Cobra 427,306" +
                    "M-B X-Class,3063" +
                    "M-B GT 4 '18,3064" +
                    "Honda Civic,3069" +
                    "BMW M5 '18,3071" +
                    "911 GT3 RS '19,3072" +
                    "Macan Turbo '19,3074" +
                    "MC12 Corsa '08,3082" +
                    "Silverado DD,3088" +
                    "Exocet Off-Road,3089" +
                    "VW Corrado,309" +
                    "AM Vantage '19,3091" +
                    "#25 RTR Mustang,9999" +
                    "M-B G 63 6x6,3107" +
                    "Ford Mustang S5,3108" +
                    "Deberti F-150,3109" +
                    "Deberti Wrangler,3110" +
                    "GYMKHANA10 Focus,3115" +
                    "Porsche 718 GTS,3117" +
                    "Corvette '19,3118" +
                    "Hoonigan RS200,3119" +
                    "Corvette '67,312" +
                    "Urus '19,3120" +
                    "Ferrari GTC4L,3122" +
                    "Porsche 911 '19,3123" +
                    "Ford Transit Mk1,3126" +
                    "#25 Ford Bronco,9999" +
                    "Mégane R26.R,3129" +
                    "MINI Countryman,3131" +
                    "MINI JCW Buggy,3132" +
                    "MEGANE R.S. '18,3134" +
                    "Land Rover Velar,3136" +
                    "Corvette '02,314" +
                    "Rimac Concept 2,3140" +
                    "Apollo IE '18,3141" +
                    "Chevy Camaro '18,3149" +
                    "Corvette '70,315" +
                    "#88 RTR Mustang,9999" +
                    "McLaren 600LT,3153" +
                    "720S Spider,3154" +
                    "Speedtail '19,3156" +
                    "Lambo Countach,316" +
                    "Jaguar I-PACE,3164" +
                    "Ford GT70 '70,3167" +
                    "Bugatti Divo,3168" +
                    "Ford Supervan 3,3170" +
                    "BMW Z4 '19,3173" +
                    "Ranger Raptor,3174" +
                    "AMG Hammer Coupe,3176" +
                    "Peugeot 205 R,3180" +
                    "Ford Escort '67,3183" +
                    "#5 Escort '77,9999" +
                    "AM DBS SL '19,3185" +
                    "Porsche Macan RR,3187" +
                    "#65 911 Desert,9999" +
                    "VelociRaptor '19,3189" +
                    "Espada 400GT '73,3191" +
                    "ID Zerouno '18,3194" +
                    "RAESR TS '19,3196" +
                    "Honda CR-X,320" +
                    "Mercury Cyclone,3206" +
                    "AM Vulcan AMR,3211" +
                    "Zenvo TSR-S,3212" +
                    "Lambo Huracán P,3217" +
                    "Portofino '18,3225" +
                    "Ferrari J50 '17,3226" +
                    "488 Pista '19,3227" +
                    "Ford Racing Puma,3228" +
                    "#777 Corvette,9999" +
                    "Diablo GTR,324" +
                    "#64 Nissan 370Z,9999" +
                    "Formula D 599,3249" +
                    "Lambo Diablo SV,325" +
                    "Mercedes-AMG E63,3250" +
                    "Jeep Gladiator,3255" +
                    "Nissan Pulsar,3257" +
                    "Ferrari Dino,326" +
                    "Renault 4L '68,3261" +
                    "Eclipse GSX,327" +
                    "MG SV-R '05,3271" +
                    "Saleen S1 '18,3276" +
                    "Ford GT500 '20,3277" +
                    "Flatbed Truck,3279" +
                    "Audi TT RS '18,3286" +
                    "Jaguar XJR-15,3287" +
                    "Aventador SVJ,3289" +
                    "Jaguar XJ220S,3293" +
                    "Lotus Elan,330" +
                    "Ferrari FXX-K E,3311" +
                    "Ferrari Monza,3312" +
                    "Koenigsegg Jesko,3315" +
                    "Ferrari Enzo,333" +
                    "Jaguar E-type,336" +
                    "Valhalla Concept,3364" +
                    "NIO EP9,3366" +
                    "Corvette C8 '20,3369" +
                    "Hoonigan Cossie,3370" +
                    "Huracán EVO,3371" +
                    "McLaren F1 GT,338" +
                    "Renault 8,3395" +
                    "Ferrari F40,340" +
                    "#99 Mazda RX-8,9999" +
                    "Toyota Supra '20,3402" +
                    "#2069 Bronco R,9999" +
                    "#34 Toyota Supra,9999" +
                    "SUBARU STI S209,3412" +
                    "VW Golf R '21,3413" +
                    "LR Defender '20,3414" +
                    "Jaguar XJ13,3415" +
                    "Ferrari F50,342" +
                    "Fairlady Z '69,343" +
                    "McLaren GT,3437" +
                    "Fairlady Z '03,344" +
                    "DD Tacoma TRD,3441" +
                    "Porsche Taycan S,3445" +
                    "#357 Corvette,9999" +
                    "Lotus Evija '20,3449" +
                    "Fairlady Z '94,345" +
                    "Ford SD F-450,3476" +
                    "Ford GT '05,348" +
                    "Chevrolet ZR2,3483" +
                    "Ford Bronco,3484" +
                    "Ford Raptor '17,3485" +
                    "Jeep Wrangler,3486" +
                    "M-B X-Class,3487" +
                    "VW Beetle,3488" +
                    "Ford Bronco '21,3489" +
                    "Bone Shaker MT,3514" +
                    "#151 FD Supra,9999" +
                    "#411 FD Corolla,9999" +
                    "FR Stock Car,3528" +
                    "Datsun 280Z,3529" +
                    "VW Golf '92,353" +
                    "VW Golf '03,354" +
                    "SIERRA RX3,3540" +
                    "Wuling Sunshine,3548" +
                    "#91 BMW M2,9999" +
                    "BMW X5M FE,3556" +
                    "Corvette '53 FE,3559" +
                    "Charger '69 FE,3561" +
                    "Exocet OR FE,3562" +
                    "Ford Puma FE,3564" +
                    "Maserati GTS FE,3568" +
                    "Mitsubishi GTO,357" +
                    "Meyers Manx FE,3570" +
                    "Pagani Huayra FE,3572" +
                    "Firebird TA FE,3573" +
                    "911 GT3 RS FE,3574" +
                    "Beetle '63 FE,3577" +
                    "Ferrari 288 GTO,358" +
                    "SUBARU 22B,363" +
                    "Carnival Float,3634" +
                    "VW Beetle,3636" +
                    "MG Metro 6R4,3639" +
                    "SUBARU WRX '04,364" +
                    "Ford Focus '17,3640" +
                    "SUBARU WRX '05,365" +
                    "Mercedes-AMG ONE,3650" +
                    "VW Beetle Taxi,3664" +
                    "Acura Integra,368" +
                    "Supra '98 WP,3681" +
                    "Apollo IE WP,3682" +
                    "Lancer GSR WP,3683" +
                    "Bronco R WP,3684" +
                    "Taycan S WP,3685" +
                    "Ford GT OPI,3699" +
                    "Lancer MR '06,374" +
                    "Lancer GSR '99,375" +
                    "Lancer MR '04,378" +
                    "BMW M3 '97,382" +
                    "BMW M3 '05,383" +
                    "Vauxhall Monaro,397" +
                    "Ford Mustang '00,405" +
                    "Honda NSX-R '05,411" +
                    "Honda NSX-R '92,412" +
                    "Buick Regal GNX,417" +
                    "Audi RS 4 '06,419" +
                    "Audi RS 6 '03,420" +
                    "Acura RSX,422" +
                    "Mazda RX-7 '90,423" +
                    "Mazda RX-7 '97,424" +
                    "RX-7 Spirit R,425" +
                    "Honda S2000,427" +
                    "Saleen S7,432" +
                    "TVR Sagaris,433" +
                    "Silvia '92,439" +
                    "Silvia '94,440" +
                    "Silvia '00,441" +
                    "Nissan GT-R '93,444" +
                    "Nissan GT-R '02,445" +
                    "Toyota Trueno,455" +
                    "Toyota Supra '92,460" +
                    "Toyota Supra '98,461" +
                    "Dodge Viper '99,483" +
                    "Jaguar XJ220,489" +
                    "Dodge Charger 69,513" +
                    "BMW M3-GTR,565" +
                    "Nissan R390,567" +
                    "M-B CLK-GTR,568" +
                    "Honda NSX-R GT,569" +
                    "Peugeot 207 S,615" +
                    "Honda Civic '07,625" +
                    "Audi quattro,633" +
                    "Renault 5 Turbo,634" +
                    "Lambo Miura,637" +
                    "Challenger '70,639" +
                    "Porsche 911 GT1,641" +
                    "BMW M3 '91,642" +
                    "Peugeot 205 T16,9000" +
                    "Mercedes-AMG ONE,9003";

}
