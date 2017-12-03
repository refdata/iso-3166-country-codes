package io.refdata.iso.country;

import java.util.EnumSet;

/**
 * @author refdata
 * Implementation of the standard ISO 3166 - Country Codes
 * @link https://www.iso.org/iso-3166-country-codes.html
 */
public enum CountryCode {

    // A
    AFGHANISTAN("AFGHANISTAN","Afghanistan","Afghanistan (l')",4,"AF","AFG",true),
    ALAND_ISLANDS("ÅLAND ISLANDS","Åland Islands","Åland(les Îles)",248,"AX","ALA",false),
    ALBANIA("ALBANIA","Albania","Albanie (l')",8,"AL","ALB",true),
    ALGERIA("ALGERIA","Algeria","Algérie (l')",12,"DZ","DZA",true),
    AMERICAN_SAMOA("AMERICAN SAMOA","American Samoa","Samoa américaines (les)",16,"AS","ASM",false),
    ANDORRA("ANDORRA","Andorra","Andorre (l')",20,"AD","AND",true),
    ANGOLA("ANGOLA","Angola","Angola (l')",24,"AO","AGO",true),
    ANGUILLA("ANGUILLA","Anguilla","Anguilla",660,"AI","AIA",false),
    ANTARCTICA("ANTARCTICA","Antarctica","Antarctique (l')",10,"AQ","ATA",false),
    ANTIGUA_AND_BARBUDA("ANTIGUA AND BARBUDA","Antigua and Barbuda","Antigua-et-Barbuda",28,"AG","ATG",true),
    ARGENTINA("ARGENTINA","Argentina","Argentine (l')",32,"AR","ARG",true),
    ARMENIA("ARMENIA","Armenia","Arménie (l')",51,"AM","ARM",true),
    ARUBA("ARUBA","Aruba","Aruba",533,"AW","ABW",false),
    AUSTRALIA("AUSTRALIA","Australia","Australie (l')",36,"AU","AUS",true),
    AUSTRIA("AUSTRIA","Austria","Autriche (l')",40,"AT","AUT",true),
    AZERBAIJAN("AZERBAIJAN","Azerbaijan","Azerbaïdjan (l')",31,"AZ","AZE",true),

    // B
    BAHAMAS("BAHAMAS (THE)","Bahamas (the)","Bahamas (les)",44,"BS","BHS",true),
    BAHRAIN("BAHRAIN","Bahrain","Bahreïn",48,"BH","BHR",true),
    BANGLADESH("BANGLADESH","Bangladesh","Bangladesh (le)",50,"BD","BGD",true),
    BARBADOS("BARBADOS","Barbados","Barbade (la)",52,"BB","BRB",true),
    BELARUS("BELARUS","Belarus","Bélarus (le)",112,"BY","BLR",true),
    BELGIUM("BELGIUM","Belgium","Belgique (la)",56,"BE","BEL",true),
    BELIZE("BELIZE","Belize","Belize (le)",84,"BZ","BLZ",true),
    BENIN("BENIN","Benin","Bénin (le)",204,"BJ","BEN",true),
    BERMUDA("BERMUDA","Bermuda","Bermudes (les)",60,"BM","BMU",false),
    BHUTAN("BHUTAN","Bhutan","Bhoutan (le)",64,"BT","BTN",true),
    BOLIVIA("BOLIVIA (PLURINATIONAL STATE OF)","Bolivia (Plurinational State of)","Bolivie (État plurinational de)",68,"BO","BOL",true),
    BONAIRE_SINT_EUSTATIUS_AND_SABA("BONAIRE, SINT EUSTATIUS AND SABA","Bonaire, Sint Eustatius and Saba","Bonaire, Saint-Eustache et Saba",535,"BQ","BES",false),
    BOSNIA_AND_HERZEGOVINA("BOSNIA AND HERZEGOVINA","Bosnia and Herzegovina","Bosnie-Herzégovine (la)",70,"BA","BIH",true),
    BOTSWANA("BOTSWANA","Botswana","Botswana (le)",72,"BW","BWA",true),
    BOUVET_ISLAND("BOUVET ISLAND","Bouvet Island","Bouvet (l'Île)",74,"BV","BVT",false),
    BRAZIL("BRAZIL","Brazil","Brésil (le)",76,"BR","BRA",true),
    BRITISH_INDIAN_OCEAN_TERRITORY("BRITISH INDIAN OCEAN TERRITORY (THE)","British Indian Ocean Territory (the)","Indien (le Territoire britannique de l'océan)",86,"IO","IOT",false),
    BRUNEI_DARUSSALAM("BRUNEI DARUSSALAM","Brunei Darussalam","Brunéi Darussalam (le)",96,"BN","BRN",true),
    BULGARIA("BULGARIA","Bulgaria","Bulgarie (la)",100,"BG","BGR",true),
    BURKINA_FASO("BURKINA FASO","Burkina Faso","Burkina Faso (le)",854,"BF","BFA",true),
    BURUNDI("BURUNDI","Burundi","Burundi (le)",108,"BI","BDI",true),

    // C
    CABO_VERDE("CABO VERDE","Cabo Verde","Cabo Verde",132,"CV","CPV",true),
    CAMBODIA("CAMBODIA","Cambodia","Cambodge (le)",116,"KH","KHM",true),
    CAMEROON("CAMEROON","Cameroon","Cameroun (le)",120,"CM","CMR",true),
    CANADA("CANADA","Canada","Canada (le)",124,"CA","CAN",true),
    CAYMAN_ISLANDS("CAYMAN ISLANDS (THE)","Cayman Islands (the)","Caïmans (les Îles)",136,"KY","CYM",false),
    CENTRAL_AFRICAN_REPUBLIC("CENTRAL AFRICAN REPUBLIC (THE)","Central African Republic (the)","République centrafricaine (la)",140,"CF","CAF",true),
    CHAD("CHAD","Chad","Tchad (le)",148,"TD","TCD",true),
    CHILE("CHILE","Chile","Chili (le)",152,"CL","CHL",true),
    CHINA("CHINA","China","Chine (la)",156,"CN","CHN",true),
    CHRISTMAS_ISLAND("CHRISTMAS ISLAND","Christmas Island","Christmas (l'Île)",162,"CX","CXR",false),
    COCOS_KEELING_ISLANDS("COCOS (KEELING) ISLANDS (THE)","Cocos (Keeling) Islands (the)","Cocos (les Îles)/ Keeling (les Îles)",166,"CC","CCK",false),
    COLOMBIA("COLOMBIA","Colombia","Colombie (la)",170,"CO","COL",true),
    COMOROS("COMOROS (THE)","Comoros (the)","Comores (les)",174,"KM","COM",true),
    CONGO_THE_DEMOCRATIC_REPUBLIC_OF("CONGO (THE DEMOCRATIC REPUBLIC OF THE)","Congo (the Democratic Republic of the)","Congo (la République démocratique du)",180,"CD","COD",true),
    CONGO("CONGO (THE)","Congo (the)","Congo (le)",178,"CG","COG",true),
    COOK_ISLANDS("COOK ISLANDS (THE)","Cook Islands (the)","Cook (les Îles)",184,"CK","COK",false),
    COSTA_RICA("COSTA RICA","Costa Rica","Costa Rica (le)",188,"CR","CRI",true),
    COTE_D_IVOIRE("CÔTE D'IVOIRE","Côte d'Ivoire","Côte d'Ivoire (la)",384,"CI","CIV",true),
    CROATIA("CROATIA","Croatia","Croatie (la)",191,"HR","HRV",true),
    CUBA("CUBA","Cuba","Cuba",192,"CU","CUB",true),
    CURACAO("CURAÇAO","Curaçao","Curaçao",531,"CW","CUW",false),
    CYPRUS("CYPRUS","Cyprus","Chypre",196,"CY","CYP",true),
    CZECHIA("CZECHIA","Czechia","Tchéquie (la)",203,"CZ","CZE",true),

    // D
    DENMARK("DENMARK","Denmark","Danemark (le)",208,"DK","DNK",true),
    DJIBOUTI("DJIBOUTI","Djibouti","Djibouti",262,"DJ","DJI",true),
    DOMINICA("DOMINICA","Dominica","Dominique (la)",212,"DM","DMA",true),
    DOMINICAN_REPUBLIC("DOMINICAN REPUBLIC (THE)","Dominican Republic (the)","dominicaine (la République)",214,"DO","DOM",true),

    // E
    ECUADOR("ECUADOR","Ecuador","Équateur (l')",218,"EC","ECU",true),
    EGYPT("EGYPT","Egypt","Égypte (l')",818,"EG","EGY",true),
    EL_SALVADOR("EL SALVADOR","El Salvador","El Salvador",222,"SV","SLV",true),
    EQUATORIAL_GUINEA("EQUATORIAL GUINEA","Equatorial Guinea","Guinée équatoriale (la)",226,"GQ","GNQ",true),
    ERITREA("ERITREA","Eritrea","Érythrée (l')",232,"ER","ERI",true),
    ESTONIA("ESTONIA","Estonia","Estonie (l')",233,"EE","EST",true),
    ETHIOPIA("ETHIOPIA","Ethiopia","Éthiopie (l')",231,"ET","ETH",true),

    // F
    FALKLAND_ISLANDS("FALKLAND ISLANDS (THE) [MALVINAS]","Falkland Islands (the) [Malvinas]","Falkland (les Îles)/Malouines (les Îles)",238,"FK","FLK",false),
    FAROE_ISLANDS("FAROE ISLANDS (THE)","Faroe Islands (the)","Féroé (les Îles)",234,"FO","FRO",false),
    FIJI("FIJI","Fiji","Fidji (les)",242,"FJ","FJI",true),
    FINLAND("FINLAND","Finland","Finlande (la)",246,"FI","FIN",true),
    FRANCE("FRANCE","France","France (la)",250,"FR","FRA",true),
    FRENCH_GUIANA("FRENCH GUIANA","French Guiana","Guyane française (la )",254,"GF","GUF",false),
    FRENCH_POLYNESIA("FRENCH POLYNESIA","French Polynesia","Polynésie française (la)",258,"PF","PYF",false),
    FRENCH_SOUTHERN_TERRITORIES("FRENCH SOUTHERN TERRITORIES (THE)","French Southern Territories (the)","Terres australes françaises (les)",260,"TF","ATF",false),

    // G
    GABON("GABON","Gabon","Gabon (le)",266,"GA","GAB",true),
    GAMBIA("GAMBIA (THE)","Gambia (the)","Gambie (la)",270,"GM","GMB",true),
    GEORGIA("GEORGIA","Georgia","Géorgie (la)",268,"GE","GEO",true),
    GERMANY("GERMANY","Germany","Allemagne (l')",276,"DE","DEU",true),
    GHANA("GHANA","Ghana","Ghana (le)",288,"GH","GHA",true),
    GIBRALTAR("GIBRALTAR","Gibraltar","Gibraltar",292,"GI","GIB",false),
    GREECE("GREECE","Greece","Grèce (la)",300,"GR","GRC",true),
    GREENLAND("GREENLAND","Greenland","Groenland (le)",304,"GL","GRL",false),
    GRENADA("GRENADA","Grenada","Grenade (la)",308,"GD","GRD",true),
    GUADELOUPE("GUADELOUPE","Guadeloupe","Guadeloupe (la)",312,"GP","GLP",false),
    GUAM("GUAM","Guam","Guam",316,"GU","GUM",false),
    GUATEMALA("GUATEMALA","Guatemala","Guatemala (le)",320,"GT","GTM",true),
    GUERNSEY("GUERNSEY","Guernsey","Guernesey",831,"GG","GGY",false),
    GUINEA("GUINEA","Guinea","Guinée (la)",324,"GN","GIN",true),
    GUINEA_BISSAU("GUINEA-BISSAU","Guinea-Bissau","Guinée-Bissau (la)",624,"GW","GNB",true),
    GUYANA("GUYANA","Guyana","Guyana (le)",328,"GY","GUY",true),

    // H
    HAITI("HAITI","Haiti","Haïti",332,"HT","HTI",true),
    HEARD_ISLAND_AND_MCDONALD_ISLANDS("HEARD ISLAND AND MCDONALD ISLANDS","Heard Island and McDonald Islands","Heard-et-Îles MacDonald (l'Île)",334,"HM","HMD",false),
    HOLY_SEE("HOLY SEE (THE)","Holy See (the)","Saint-Siège (le)",336,"VA","VAT",true),
    HONDURAS("HONDURAS","Honduras","Honduras (le)",340,"HN","HND",true),
    HONG_KONG("HONG KONG","Hong Kong","Hong Kong",344,"HK","HKG",false),
    HUNGARY("HUNGARY","Hungary","Hongrie (la)",348,"HU","HUN",true),

    //I
    ICELAND("ICELAND","Iceland","Islande (l')",352,"IS","ISL",true),
    INDIA("INDIA","India","Inde (l')",356,"IN","IND",true),
    INDONESIA("INDONESIA","Indonesia","Indonésie (l')",360,"ID","IDN",true),
    IRAN("IRAN (ISLAMIC REPUBLIC OF)","Iran (Islamic Republic of)","Iran (République Islamique d')",364,"IR","IRN",true),
    IRAQ("IRAQ","Iraq","Iraq (l')",368,"IQ","IRQ",true),
    IRELAND("IRELAND","Ireland","Irlande (l')",372,"IE","IRL",true),
    ISLE_OF_MAN("ISLE OF MAN","Isle of Man","Île de Man",833,"IM","IMN",false),
    ISRAEL("ISRAEL","Israel","Israël",376,"IL","ISR",true),
    ITALY("ITALY","Italy","Italie (l')",380,"IT","ITA",true),

    // J
    JAMAICA("JAMAICA","Jamaica","Jamaïque (la)",388,"JM","JAM",true),
    JAPAN("JAPAN","Japan","Japon (le)",392,"JP","JPN",true),
    JERSEY("JERSEY","Jersey","Jersey",832,"JE","JEY",false),
    JORDAN("JORDAN","Jordan","Jordanie (la)",400,"JO","JOR",true),

    // K
    KAZAKHSTAN("KAZAKHSTAN","Kazakhstan","Kazakhstan (le)",398,"KZ","KAZ",true),
    KENYA("KENYA","Kenya","Kenya (le)",404,"KE","KEN",true),
    KIRIBATI("KIRIBATI","Kiribati","Kiribati",296,"KI","KIR",true),
    KOREA_THE_DEMOCRATIC_PEOPLE_S_REPUBLIC_OF("KOREA (THE DEMOCRATIC PEOPLE'S REPUBLIC OF)","Korea (the Democratic People's Republic of)","Corée (la République populaire démocratique de)",408,"KP","PRK",true),
    KOREA_THE_REPUBLIC_OF("KOREA (THE REPUBLIC OF)","Korea (the Republic of)","Corée (la République de)",410,"KR","KOR",true),
    KUWAIT("KUWAIT","Kuwait","Koweït (le)",414,"KW","KWT",true),
    KYRGYZSTAN("KYRGYZSTAN","Kyrgyzstan","Kirghizistan (le)",417,"KG","KGZ",true),

    // L
    LAO("LAO PEOPLE'S DEMOCRATIC REPUBLIC (THE)","Lao People's Democratic Republic (the)","Lao, République démocratique populaire",418,"LA","LAO",true),
    LATVIA("LATVIA","Latvia","Lettonie (la)",428,"LV","LVA",true),
    LEBANON("LEBANON","Lebanon","Liban (le)",422,"LB","LBN",true),
    LESOTHO("LESOTHO","Lesotho","Lesotho (le)",426,"LS","LSO",true),
    LIBERIA("LIBERIA","Liberia","Libéria (le)",430,"LR","LBR",true),
    LIBYA("LIBYA","Libya","Libye (la)",434,"LY","LBY",true),
    LIECHTENSTEIN("LIECHTENSTEIN","Liechtenstein","Liechtenstein (le)",438,"LI","LIE",true),
    LITHUANIA("LITHUANIA","Lithuania","Lituanie (la)",440,"LT","LTU",true),
    LUXEMBOURG("LUXEMBOURG","Luxembourg","Luxembourg (le)",442,"LU","LUX",true),

    // M
    MACAO("MACAO","Macao","Macao",446,"MO","MAC",false),
    MACEDONIA("MACEDONIA (THE FORMER YUGOSLAV REPUBLIC OF)","Macedonia (the former Yugoslav Republic of)","Macédoine (l'ex‑République yougoslave de)",807,"MK","MKD",true),
    MADAGASCAR("MADAGASCAR","Madagascar","Madagascar",450,"MG","MDG",true),
    MALAWI("MALAWI","Malawi","Malawi (le)",454,"MW","MWI",true),
    MALAYSIA("MALAYSIA","Malaysia","Malaisie (la)",458,"MY","MYS",true),
    MALDIVES("MALDIVES","Maldives","Maldives (les)",462,"MV","MDV",true),
    MALI("MALI","Mali","Mali (le)",466,"ML","MLI",true),
    MALTA("MALTA","Malta","Malte",470,"MT","MLT",true),
    MARSHALL_ISLANDS("MARSHALL ISLANDS (THE)","Marshall Islands (the)","Marshall (Îles)",584,"MH","MHL",true),
    MARTINIQUE("MARTINIQUE","Martinique","Martinique (la)",474,"MQ","MTQ",false),
    MAURITANIA("MAURITANIA","Mauritania","Mauritanie (la)",478,"MR","MRT",true),
    MAURITIUS("MAURITIUS","Mauritius","Maurice",480,"MU","MUS",true),
    MAYOTTE("MAYOTTE","Mayotte","Mayotte",175,"YT","MYT",false),
    MEXICO("MEXICO","Mexico","Mexique (le)",484,"MX","MEX",true),
    MICRONESIA("MICRONESIA (FEDERATED STATES OF)","Micronesia (Federated States of)","Micronésie (États fédérés de)",583,"FM","FSM",true),
    MOLDOVA("MOLDOVA (THE REPUBLIC OF)","Moldova (the Republic of)","Moldova, République de",498,"MD","MDA",true),
    MONACO("MONACO","Monaco","Monaco",492,"MC","MCO",true),
    MONGOLIA("MONGOLIA","Mongolia","Mongolie (la)",496,"MN","MNG",true),
    MONTENEGRO("MONTENEGRO","Montenegro","Monténégro (le)",499,"ME","MNE",true),
    MONTSERRAT("MONTSERRAT","Montserrat","Montserrat",500,"MS","MSR",false),
    MOROCCO("MOROCCO","Morocco","Maroc (le)",504,"MA","MAR",true),
    MOZAMBIQUE("MOZAMBIQUE","Mozambique","Mozambique (le)",508,"MZ","MOZ",true),
    MYANMAR("MYANMAR","Myanmar","Myanmar (le)",104,"MM","MMR",true),

    // N
    NAMIBIA("NAMIBIA","Namibia","Namibie (la)",516,"NA","NAM",true),
    NAURU("NAURU","Nauru","Nauru",520,"NR","NRU",true),
    NEPAL("NEPAL","Nepal","Népal (le)",524,"NP","NPL",true),
    NETHERLANDS("NETHERLANDS (THE)","Netherlands (the)","Pays-Bas (les)",528,"NL","NLD",true),
    NEW_CALEDONIA("NEW CALEDONIA","New Caledonia","Nouvelle-Calédonie (la)",540,"NC","NCL",false),
    NEW_ZEALAND("NEW ZEALAND","New Zealand","Nouvelle-Zélande (la)",554,"NZ","NZL",true),
    NICARAGUA("NICARAGUA","Nicaragua","Nicaragua (le)",558,"NI","NIC",true),
    NIGER("NIGER (THE)","Niger (the)","Niger (le)",562,"NE","NER",true),
    NIGERIA("NIGERIA","Nigeria","Nigéria (le)",566,"NG","NGA",true),
    NIUE("NIUE","Niue","Niue",570,"NU","NIU",false),
    NORFOLK_ISLAND("NORFOLK ISLAND","Norfolk Island","Norfolk (l'Île)",574,"NF","NFK",false),
    NORTHERN_MARIANA_ISLANDS("NORTHERN MARIANA ISLANDS (THE)","Northern Mariana Islands (the)","Mariannes du Nord (les Îles)",580,"MP","MNP",false),
    NORWAY("NORWAY","Norway","Norvège (la)",578,"NO","NOR",true),

    // O
    OMAN("OMAN","Oman","Oman",512,"OM","OMN",true),

    // P
    PAKISTAN("PAKISTAN","Pakistan","Pakistan (le)",586,"PK","PAK",true),
    PALAU("PALAU","Palau","Palaos (les)",585,"PW","PLW",true),
    PALESTINE("PALESTINE, STATE OF","Palestine, State of","Palestine, État de",275,"PS","PSE",false),
    PANAMA("PANAMA","Panama","Panama (le)",591,"PA","PAN",true),
    PAPUA_NEW_GUINEA("PAPUA NEW GUINEA","Papua New Guinea","Papouasie-Nouvelle-Guinée (la)",598,"PG","PNG",true),
    PARAGUAY("PARAGUAY","Paraguay","Paraguay (le)",600,"PY","PRY",true),
    PERU("PERU","Peru","Pérou (le)",604,"PE","PER",true),
    PHILIPPINES("PHILIPPINES (THE)","Philippines (the)","Philippines (les)",608,"PH","PHL",true),
    PITCAIRN("PITCAIRN","Pitcairn","Pitcairn",612,"PN","PCN",false),
    POLAND("POLAND","Poland","Pologne (la)",616,"PL","POL",true),
    PORTUGAL("PORTUGAL","Portugal","Portugal (le)",620,"PT","PRT",true),
    PUERTO_RICO("PUERTO RICO","Puerto Rico","Porto Rico",630,"PR","PRI",false),

    // Q
    QATAR("QATAR","Qatar","Qatar (le)",634,"QA","QAT",true),

    // R
    REUNION("RÉUNION","Réunion","Réunion (La)",638,"RE","REU",false),
    ROMANIA("ROMANIA","Romania","Roumanie (la)",642,"RO","ROU",true),
    RUSSIAN_FEDERATION("RUSSIAN FEDERATION (THE)","Russian Federation (the)","Russie (la Fédération de)",643,"RU","RUS",true),
    RWANDA("RWANDA","Rwanda","Rwanda (le)",646,"RW","RWA",true),

    // S
    SAINT_BARTHELEMY("SAINT BARTHÉLEMY","Saint Barthélemy","Saint-Barthélemy",652,"BL","BLM",false),
    SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA("SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA","Saint Helena, Ascension and Tristan da Cunha","Sainte-Hélène, Ascension et Tristan da Cunha",654,"SH","SHN",false),
    SAINT_KITTS_AND_NEVIS("SAINT KITTS AND NEVIS","Saint Kitts and Nevis","Saint-Kitts-et-Nevis",659,"KN","KNA",true),
    SAINT_LUCIA("SAINT LUCIA","Saint Lucia","Sainte-Lucie",662,"LC","LCA",true),
    SAINT_MARTIN("SAINT MARTIN (FRENCH PART)","Saint Martin (French part)","Saint-Martin (partie française)",663,"MF","MAF",false),
    SAINT_PIERRE_AND_MIQUELON("SAINT PIERRE AND MIQUELON","Saint Pierre and Miquelon","Saint-Pierre-et-Miquelon",666,"PM","SPM",false),
    SAINT_VINCENT_AND_THE_GRENADINES("SAINT VINCENT AND THE GRENADINES","Saint Vincent and the Grenadines","Saint-Vincent-et-les Grenadines",670,"VC","VCT",true),
    SAMOA("SAMOA","Samoa","Samoa (le)",882,"WS","WSM",true),
    SAN_MARINO("SAN MARINO","San Marino","Saint-Marin",674,"SM","SMR",true),
    SAO_TOME_AND_PRINCIPE("SAO TOME AND PRINCIPE","Sao Tome and Principe","Sao Tomé-et-Principe",678,"ST","STP",true),
    SAUDI_ARABIA("SAUDI ARABIA","Saudi Arabia","Arabie saoudite (l')",682,"SA","SAU",true),
    SENEGAL("SENEGAL","Senegal","Sénégal (le)",686,"SN","SEN",true),
    SERBIA("SERBIA","Serbia","Serbie (la)",688,"RS","SRB",true),
    SEYCHELLES("SEYCHELLES","Seychelles","Seychelles (les)",690,"SC","SYC",true),
    SIERRA_LEONE("SIERRA LEONE","Sierra Leone","Sierra Leone (la)",694,"SL","SLE",true),
    SINGAPORE("SINGAPORE","Singapore","Singapour",702,"SG","SGP",true),
    SINT_MAARTEN("SINT MAARTEN (DUTCH PART)","Sint Maarten (Dutch part)","Saint-Martin (partie néerlandaise)",534,"SX","SXM",false),
    SLOVAKIA("SLOVAKIA","Slovakia","Slovaquie (la)",703,"SK","SVK",true),
    SLOVENIA("SLOVENIA","Slovenia","Slovénie (la)",705,"SI","SVN",true),
    SOLOMON_ISLANDS("SOLOMON ISLANDS","Solomon Islands","Salomon (Îles)",90,"SB","SLB",true),
    SOMALIA("SOMALIA","Somalia","Somalie (la)",706,"SO","SOM",true),
    SOUTH_AFRICA("SOUTH AFRICA","South Africa","Afrique du Sud (l')",710,"ZA","ZAF",true),
    SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS("SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS","South Georgia and the South Sandwich Islands","Géorgie du Sud-et-les Îles Sandwich du Sud (la)",239,"GS","SGS",false),
    SOUTH_SUDAN("SOUTH SUDAN","South Sudan","Soudan du Sud (le)",728,"SS","SSD",true),
    SPAIN("SPAIN","Spain","Espagne (l')",724,"ES","ESP",true),
    SRI_LANKA("SRI LANKA","Sri Lanka","Sri Lanka",144,"LK","LKA",true),
    SUDAN("SUDAN (THE)","Sudan (the)","Soudan (le)",729,"SD","SDN",true),
    SURINAME("SURINAME","Suriname","Suriname (le)",740,"SR","SUR",true),
    SVALBARD_AND_JAN_MAYEN("SVALBARD AND JAN MAYEN","Svalbard and Jan Mayen","Svalbard et l'Île Jan Mayen (le)",744,"SJ","SJM",false),
    SWAZILAND("SWAZILAND","Swaziland","Swaziland (le)",748,"SZ","SWZ",true),
    SWEDEN("SWEDEN","Sweden","Suède (la)",752,"SE","SWE",true),
    SWITZERLAND("SWITZERLAND","Switzerland","Suisse (la)",756,"CH","CHE",true),
    SYRIAN_ARAB_REPUBLIC("SYRIAN ARAB REPUBLIC","Syrian Arab Republic","République arabe syrienne (la)",760,"SY","SYR",true),

    // T
    TAIWAN("TAIWAN (PROVINCE OF CHINA)","Taiwan (Province of China)","Taïwan (Province de Chine)",158,"TW","TWN",false),
    TAJIKISTAN("TAJIKISTAN","Tajikistan","Tadjikistan (le)",762,"TJ","TJK",true),
    TANZANIA("TANZANIA, UNITED REPUBLIC OF","Tanzania, United Republic of","Tanzanie, République-Unie de",834,"TZ","TZA",true),
    THAILAND("THAILAND","Thailand","Thaïlande (la)",764,"TH","THA",true),
    TIMOR_LESTE("TIMOR-LESTE","Timor-Leste","Timor-Leste (le)",626,"TL","TLS",true),
    TOGO("TOGO","Togo","Togo (le)",768,"TG","TGO",true),
    TOKELAU("TOKELAU","Tokelau","Tokelau (les)",772,"TK","TKL",false),
    TONGA("TONGA","Tonga","Tonga (les)",776,"TO","TON",true),
    TRINIDAD_AND_TOBAGO("TRINIDAD AND TOBAGO","Trinidad and Tobago","Trinité-et-Tobago (la)",780,"TT","TTO",true),
    TUNISIA("TUNISIA","Tunisia","Tunisie (la)",788,"TN","TUN",true),
    TURKEY("TURKEY","Turkey","Turquie (la)",792,"TR","TUR",true),
    TURKMENISTAN("TURKMENISTAN","Turkmenistan","Turkménistan (le)",795,"TM","TKM",true),
    TURKS_AND_CAICOS_ISLANDS("TURKS AND CAICOS ISLANDS (THE)","Turks and Caicos Islands (the)","Turks-et-Caïcos (les Îles)",796,"TC","TCA",false),
    TUVALU("TUVALU","Tuvalu","Tuvalu (les)",798,"TV","TUV",true),

    // U
    UGANDA("UGANDA","Uganda","Ouganda (l')",800,"UG","UGA",true),
    UKRAINE("UKRAINE","Ukraine","Ukraine (l')",804,"UA","UKR",true),
    UNITED_ARAB_EMIRATES("UNITED ARAB EMIRATES (THE)","United Arab Emirates (the)","Émirats arabes unis (les)",784,"AE","ARE",true),
    UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND("UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND (THE)","United Kingdom of Great Britain and Northern Ireland (the)","Royaume-Uni de Grande-Bretagne et d'Irlande du Nord (le)",826,"GB","GBR",true),
    UNITED_STATES_MINOR_OUTLYING_ISLANDS("UNITED STATES MINOR OUTLYING ISLANDS (THE)","United States Minor Outlying Islands (the)","Îles mineures éloignées des États-Unis (les)",581,"UM","UMI",false),
    UNITED_STATES_OF_AMERICA("UNITED STATES OF AMERICA (THE)","United States of America (the)","États-Unis d'Amérique (les)",840,"US","USA",true),
    URUGUAY("URUGUAY","Uruguay","Uruguay (l')",858,"UY","URY",true),
    UZBEKISTAN("UZBEKISTAN","Uzbekistan","Ouzbékistan (l')",860,"UZ","UZB",true),

    // V
    VANUATU("VANUATU","Vanuatu","Vanuatu (le)",548,"VU","VUT",true),
    VENEZUELA("VENEZUELA (BOLIVARIAN REPUBLIC OF)","Venezuela (Bolivarian Republic of)","Venezuela (République bolivarienne du)",862,"VE","VEN",true),
    VIET_NAM("VIET NAM","Viet Nam","Viet Nam (le)",704,"VN","VNM",true),
    VIRGIN_ISLANDS_BRITISH("VIRGIN ISLANDS (BRITISH)","Virgin Islands (British)","Vierges britanniques (les Îles)",92,"VG","VGB",false),
    VIRGIN_ISLANDS_US("VIRGIN ISLANDS (U.S.)","Virgin Islands (U.S.)","Vierges des États-Unis (les Îles)",850,"VI","VIR",false),
    WALLIS_AND_FUTUNA("WALLIS AND FUTUNA","Wallis and Futuna","Wallis-et-Futuna",876,"WF","WLF",false),

    // W
    WESTERN_SAHARA("WESTERN SAHARA","Western Sahara","Sahara occidental (le)*",732,"EH","ESH",false),

    // Y
    YEMEN("YEMEN","Yemen","Yémen (le)",887,"YE","YEM",true),

    // Z
    ZAMBIA("ZAMBIA","Zambia","Zambie (la)",894,"ZM","ZMB",true),
    ZIMBABWE("ZIMBABWE","Zimbabwe","Zimbabwe (le)",716,"ZW","ZWE",true);

    // ISO 3166-1 country name, in english upper-case
    private String name;

    // ISO 3166-1 country short name, in english lower-case
    private String shortNameEN;

    // ISO 3166-1 country short name, in french lower-case
    private String shortNameFR;

    // ISO 3166-1 numeric-3 code
    private int numericCode;

    // ISO 3166-1 alpha-2 code
    private String alpha2Code;

    // ISO 3166-1 alpha-3 code
    private String alpha3Code;

    // ISO 3166-1 considered as sovereign state
    private boolean independant;

    CountryCode(final String name, final String shortNameEN, final String shortNameFR, final int numericCode, final String alpha2Code, final String alpha3Code, final boolean independant){
        this.name = name;
        this.shortNameEN = shortNameEN;
        this.shortNameFR = shortNameFR;
        this.numericCode = numericCode;
        this.alpha2Code = alpha2Code;
        this.alpha3Code = alpha3Code;
        this.independant = independant;
    }

    public String getName() {
        return name;
    }

    public String getShortNameEN() {
        return shortNameEN;
    }

    public String getShortNameFR() {
        return shortNameFR;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public boolean isIndependant() {
        return independant;
    }

    public EnumSet<CountryCode> getFilteredCountryCodes( /* order, first letters,  sovereignity*/ ) {
        // TODO
        return null;
    }

    //TODO create valueOf with ISO2, ISO3, NUMERIC3 (all relevant fields)


}

