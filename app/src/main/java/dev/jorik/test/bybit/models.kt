package dev.jorik.test.bybit

import com.google.gson.annotations.SerializedName

val endpoint = "https://api.bybit.com/v5/announcements/index?locale=en-US&limit=10"
val stubJson = "{\"retCode\":0,\"retMsg\":\"OK\",\"result\":{\"total\":1747,\"list\":[{\"title\":\"Protect Your First Copy Trade With 100 USDT Loss Coverage\",\"description\":\"Our rejuvenated Copy Trading 101 event is designed to help you safely navigate the markets, minimize potential losses, and optimize your trading strategy with a 100 USDT Loss Coverage Voucher. \",\"type\":{\"title\":\"Latest Activities\",\"key\":\"latest_activities\"},\"tags\":[\"Derivatives\",\"Copy Trading\",\"USDT\"],\"url\":\"https://announcements.bybit.com/en-US/article/protect-your-first-copy-trade-with-100-usdt-loss-coverage-bltef8ac47a10cb68b5/\",\"dateTimestamp\":1704247200000,\"startDateTimestamp\":1704103200000,\"endDateTimestamp\":1711900799000},{\"title\":\"Now Live: SoulSociety (HON) on Bybit Web3 IDO\",\"description\":\"We're excited to announce that our latest IDO project, SoulSociety (HON), is now live!\",\"type\":{\"title\":\"New Listings\",\"key\":\"new_crypto\"},\"tags\":[\"WEB3\"],\"url\":\"https://announcements.bybit.com/en-US/article/now-live-soulsociety-hon-on-bybit-web3-ido-blt62ea44f1430505ef/\",\"dateTimestamp\":1704880800000,\"startDateTimestamp\":1704880800000,\"endDateTimestamp\":1705729770000},{\"title\":\"Bybit to List SEI/USDC on Spot: Trade With 0 Fees!\",\"description\":\"We are excited to announce the upcoming listing of SEI/USDC  on our Spot trading platform! \",\"type\":{\"title\":\"New Listings\",\"key\":\"new_crypto\"},\"tags\":[\"Spot\",\"Spot Listings\",\"Trading Bots\",\"Institutions\"],\"url\":\"https://announcements.bybit.com/en-US/article/bybit-to-list-sei-usdc-on-spot-trade-with-0-fees--blt14e790cf97da85cf/\",\"dateTimestamp\":1704873600000,\"startDateTimestamp\":1704873600000,\"endDateTimestamp\":1706690838000},{\"title\":\"Bybit to Support SaitamaV2 (SAITAMA) Contract Swap and Rebranding to The SaitaChain Coin (STC)\",\"description\":\"Bybit will be supporting the contract swap and rebranding of SaitamaV2 (SAITAMA) to The SaitaChain Coin (STC). \",\"type\":{\"title\":\"Latest Bybit News\",\"key\":\"latest_bybit_news\"},\"tags\":[\"Spot\"],\"url\":\"https://announcements.bybit.com/en-US/article/bybit-to-support-saitamav2-saitama-contract-swap-and-rebranding-to-the-saitachain-coin-stc--blt50c6effd480b25f6/\",\"dateTimestamp\":1704795678000,\"startDateTimestamp\":1704795678000,\"endDateTimestamp\":1706696478000},{\"title\":\"New Listing: VIC/USDT — Split a 80,000 VIC Prize Pool\",\"description\":\"We are excited to announce the upcoming listing of Viction (VIC) on our Spot trading platform!\",\"type\":{\"title\":\"New Listings\",\"key\":\"new_crypto\"},\"tags\":[\"Spot\",\"Spot Listings\",\"Trading Bots\",\"Institutions\"],\"url\":\"https://announcements.bybit.com/en-US/article/new-listing-vic-usdt-split-a-80-000-vic-prize-pool-blt9e5273aa3f275ba2/\",\"dateTimestamp\":1704794400000,\"startDateTimestamp\":1704794400000,\"endDateTimestamp\":1706000400000},{\"title\":\"New Listing: XAI/USDT — Split a 2,000,000 XAI + 30,000 USDT Prize Pool\",\"description\":\"We are excited to announce the upcoming listing of Xai (XAI) on our Spot trading platform!\",\"type\":{\"title\":\"New Listings\",\"key\":\"new_crypto\"},\"tags\":[\"Spot\",\"Spot Listings\",\"Trading Bots\",\"Institutions\"],\"url\":\"https://announcements.bybit.com/en-US/article/new-listing-xai-usdt-split-a-2-000-000-xai-30-000-usdt-prize-pool-blt8c44c89fb3f232eb/\",\"dateTimestamp\":1704772800000,\"startDateTimestamp\":1704772800000,\"endDateTimestamp\":1706025599000},{\"title\":\"Upcoming Funding Account Upgrade on Jan 9, 2024\",\"description\":\"In our efforts to bring you a next-level trading experience, Bybit will be upgrading its Funding Account on Jan 9, 2024, 3:15AM UTC.\",\"type\":{\"title\":\"Latest Bybit News\",\"key\":\"latest_bybit_news\"},\"tags\":[\"P2P Trading\"],\"url\":\"https://announcements.bybit.com/en-US/article/upcoming-funding-account-upgrade-on-jan-9-2024-blt75fea74ac4a27d8d/\",\"dateTimestamp\":1704769772000,\"startDateTimestamp\":1704769772000,\"endDateTimestamp\":1704769772000},{\"title\":\"GEOpay Festive Delight: Deposit MYR With 0 Fees\",\"description\":\"Embrace the New Year's cheer and celebrate the seamless support of GEOpay with One-Click Buy. We've prepared an exciting offer just for you!\",\"type\":{\"title\":\"Latest Activities\",\"key\":\"latest_activities\"},\"tags\":[\"Fiat Deposit\"],\"url\":\"https://announcements.bybit.com/en-US/article/geopay-festive-delight-deposit-myr-with-0-fees-bltd99a7942665fdfe8/\",\"dateTimestamp\":1704711600000,\"startDateTimestamp\":1701424800000,\"endDateTimestamp\":1706716799000},{\"title\":\"Moon App (APP) on Bybit Web3 IDO: Snapshot Period Starts Soon\",\"description\":\"The Snapshot Period for the highly anticipated IDO Project, Moon App (APP), will start soon!\",\"type\":{\"title\":\"Latest Activities\",\"key\":\"latest_activities\"},\"tags\":[\"WEB3\"],\"url\":\"https://announcements.bybit.com/en-US/article/moon-app-app-on-bybit-web3-ido-snapshot-period-starts-soon-blt7d59beac0663e5fc/\",\"dateTimestamp\":1704699190000,\"startDateTimestamp\":1704794400000,\"endDateTimestamp\":1705053600000},{\"title\":\"New Listings: PORT3/USDT — Grab a Share of the 200,000 USDT Prize Pool\",\"description\":\"Bybit is excited to announce the upcoming listing of Port3 Network (PORT3) on our Spot trading platform!\",\"type\":{\"title\":\"New Listings\",\"key\":\"new_crypto\"},\"tags\":[\"Spot\",\"Spot Listings\",\"Trading Bots\",\"Institutions\"],\"url\":\"https://announcements.bybit.com/en-US/article/new-listings-port3-usdt-grab-a-share-of-the-200-000-usdt-prize-pool-blt62ed0bf7cf780a11/\",\"dateTimestamp\":1704686400000,\"startDateTimestamp\":1704693600000,\"endDateTimestamp\":1705914000000}]},\"retExtInfo\":{},\"time\":1704871163290}"

data class Response(
    @SerializedName("retCode") val code :Int,
    @SerializedName("retMsg") val message :String,
    @SerializedName("result") val result :Result,
    @SerializedName("retExtInfo") val info :Any,
    @SerializedName("time") val time :Long,
)

data class Result(
    @SerializedName("total")val total :Int,
    @SerializedName("list")val list :List<Item>
)

data class Item(
    @SerializedName("title") val title :String,
    @SerializedName("description") val description :String,
    @SerializedName("type") val type :Type,
    @SerializedName("tags") val tags :List<String>,
    @SerializedName("url") val url :String,
    @SerializedName("dateTimestamp") val timestamp :Long,
    @SerializedName("startDateTimestamp") val startDate :Long,
    @SerializedName("endDateTimestamp") val endDate :Long,
)

data class Type(
    @SerializedName("title") val title :String,
    @SerializedName("key") val key :String,
)

/*
retCode	0
retMsg	"OK"
result	{…}
retExtInfo	{}
time	1704890005785
 */
/*
total	1753
list	[…]
 */
/*
title	"Protect Your First Copy Trade With 100 USDT Loss Coverage"
description	"Our rejuvenated Copy Trading 101 event is designed to help you safely navigate the markets, minimize potential losses, and optimize your trading strategy with a 100 USDT Loss Coverage Voucher. "
type
    title	"Latest Activities"
    key	"latest_activities"
tags
    0	"Derivatives"
    1	"Copy Trading"
    2	"USDT"
url	"https://announcements.bybit.com/en-US/article/protect-your-first-copy-trade-with-100-usdt-loss-coverage-bltef8ac47a10cb68b5/"
dateTimestamp	1704247200000
startDateTimestamp	1704103200000
endDateTimestamp	1711900799000
 */