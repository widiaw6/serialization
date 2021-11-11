package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Company(
    @Json(name = "internalId") var internalId: String = "",
    @Json(name = "name") var name: String = "",
    @Json(name = "description") var description: String? = null,
    @Json(name = "code") var code: String? = null,
    @Json(name = "address") var address: String? = null,
    @Json(name = "country") var country: String? = null,
    @Json(name = "province") var province: String? = null,
    @Json(name = "city") var city: String? = null,
    @Json(name = "longitude") var longitude: Double? = null,
    @Json(name = "latitude") var latitude: Double? = null,
    @Json(name = "plusCode") var plusCode: String? = null,
    @Json(name = "isAuthorityUploadDoc") var isAuthorityUploadDoc: Boolean? = null,
    @Json(name = "isSPPKP") var isSPPKP: Boolean? = null,
    @Json(name = "isSIUJPT") var isSIUJPT: Boolean? = null,
    @Json(name = "isHasYellowPlate") var isHasYellowPlate: Boolean? = null,
    @Json(name = "authorityName") var authorityName: String? = null,
    @Json(name = "authorityEmail") var authorityEmail: String? = null,
    @Json(name = "authorityDialCode") var authorityDialCode: String? = null,
    @Json(name = "authorityPhone") var authorityPhone: String? = null,
    @Json(name = "ratingVendor") var ratingVendor: Float? = null,
    @Json(name = "note") var note: String? = null,
    @Json(name = "companyProfile") var companyProfile: CompanyProfile? = null,
    @Json(name = "companyUnit") var companyUnit: CompanyUnit? = null,
    @Json(name = "phones") var phones: List<PhoneModel> = ArrayList(),
    @Json(name = "jobPosition") var jobPosition: String? = null,
    @Json(name = "emailedTo") var email: String? = null,
    @Json(name = "bankIid") var bankIid: String? = null,
    @Json(name = "bankAccountName") var bankAccountName: String? = null,
    @Json(name = "bankAccountNumber") var bankAccountNumber: String? = null,
    @Json(name = "bankAccountFileIid") var bankAccountFileIid: String? = null,
    @Json(name = "menuStepper") var menuStepper: MenuStepper? = null,
    @Json(name = "workCategory") var workCategory: WorkCategory? = null,
    @Json(name = "adminAccounts") var adminAccounts: List<ChildAccount> = ArrayList(),
    @Json(name = "waitingAccounts") var waitingAccounts: List<ChildAccount> = ArrayList(),
    @Json(name = "companyFiles") var companyFiles: List<Attachment> = ArrayList(),
    @Json(name = "individuFiles") var individualFiles: List<Attachment> = ArrayList(),
    @Json(name = "appStepper") var appStepper: String? = null,
    @Json(name = "defaultRoute") var defaultRoute: String? = null,
    @Json(name = "defaultPoolLocation") var defaultPoolLocation: String? = null,
    @Json(name = "defaultVehicleModelAmounts") var defaultVehicles: List<OwnedVehicleType> = ArrayList(),
    @Json(name = "defaultItemCategories") var defaultItemCategories: List<ItemCategory> = ArrayList(),
    @Json(name = "emergencyContactName") var emergencyContactName: String? = null,
    @Json(name = "emergencyContactPhone") var emergencyContactPhone: String? = null,
    @Json(name = "emergencyContactDialCode") var emergencyContactDialCode: String? = null,
    @Json(name = "bankAccounts") var bankAccounts: List<BankAccount> = ArrayList(),
    @Json(name = "expectedRoute") var expectedRoute: String? = null,
    @Json(name = "currentCustomerProject") var currentCustomerProject: String? = null,
    @Json(name = "companyDatas") var companyDatas: List<CompanyData> = ArrayList(),
    @Json(name = "financeEmail") var financeEmail: String? = null,
    @Json(name = "addressDetail") var addressDetail: String? = null,
    @Json(name = "npwpNumber") var npwpNumber: String? = null,
    @Json(name = "idCardNumber") var idCardNumber: String? = null,
)