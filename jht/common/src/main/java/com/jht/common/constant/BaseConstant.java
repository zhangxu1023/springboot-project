package com.jht.common.constant;


/**
 * @author Alvis
 * @Description: 公共常量
 * @date 2017年10月26日 上午10:47:08
 */
public class BaseConstant {
    /**
     * 没有输入查询字段 返回
     */
    public final static String MESSAGE_ERROR_FIELD = "请输入查询字段";
    /**
     * 输入的查询字段没有通过验证 返回
     */
    public final static String MESSAGE_ERROR_VALIDATOR = "查询字段验证失败";
    /**
     * 密码加密方式
     */
    public static final String MD5 = "MD5";
    /**
     * 用户密码
     */
    public static final String PASSWORD = "password";
    /**
     * 用户密码盐值
     */
    public static final String SALT = "salt";
    /**
     * 没有输入信息 返回
     */
    public final static String MESSAGE_ERROR_NO = "没有输入";
    /**
     * token错误
     */
    public final static String MESSAGE_ERROR_TOKEN_MISSING = "token missing";

    /**
     * 银行账户数量已超过最大值
     */
    public final static String MESSAGE_USER_BANK_ACCOUNT_MAX_NUM = "银行账户数量已超过最大值";

    /**
     * DTO 路径常量集合
     */

    public final static String CATEGORYDTO = "com.jht.category.dto.CategoryDTO";
    public final static String PROPERTYDTO = "com.jht.prop.dto.PropertyDTO";
    public final static String PROPERTYVALUEDTO = "com.jht.propvalue.dto.PropertyValueDTO";

    public final static String USERDTO = "com.jht.user.dto.UserDTO";
    public final static String COMPANYDTO = "com.jht.company.dto.CompanyDTO";
    public final static String FUNCTIONDTO = "com.jht.function.dto.FunctionDTO";
    public final static String MENUDTO = "com.jht.menu.dto.MenuDTO";
    public final static String PERMISSIONDTO = "com.jht.permission.dto.PermissionDTO";
    public final static String ROLEDTO = "com.jht.role.dto.RoleDTO";
    public final static String INVOICEDTO = "com.jht.invoice.dto.InvoiceDTO";
    public final static String INVOICEOUTDTO = "com.jht.invoice.dto.InvoiceOutDTO";
    public final static String BANKDTO = "com.jht.bank.dto.BankDTO";

    public final static String REGIONDTO = "com.jht.location.dto.RegionDTO";
    public final static String PROVINCEDTO = "com.jht.location.dto.ProvinceDTO";
    public final static String CITYDTO = "com.jht.location.dto.CityDTO";
    public final static String AREADTO = "com.jht.location.dto.AreaDTO";

    public final static String MANAGERDTO = "com.jht.manager.dto.ManagerDTO";
    public final static String MANAGERFUNCTIONDTO = "com.jht.function.dto.ManagerFunctionDTO";
    public final static String MANAGERMENUDTO = "com.jht.menu.dto.ManagerMenuDTO";
    public final static String MANAGERPERMISSIONDTO = "com.jht.permission.dto.ManagerPermissionDTO";
    public final static String MANAGERROLEDTO = "com.jht.role.dto.ManagerRoleDTO";
    public final static String DICTDTO = "com.jht.dict.dto.DictDTO";

    public final static String ITEMDTO = "com.jht.item.dto.ItemDTO";
    public final static String MARKETDTO = "com.jht.market.dto.MarketDTO";
    public final static String STOCKDTO = "com.jht.item.dto.StockDTO";
    public final static String LOCATIONDTO = "com.jht.location.dto.LocationDTO";
    public final static String CONTACTDTO = "com.jht.company.dto.ContactDTO";
    ;

    public final static String ORDERCONTRACTDTO = "com.jht.order.dto.OrderContractDTO";
    public final static String ORDERINVOICEDTO = "com.jht.order.dto.OrderInvoiceDTO";
    public final static String ORDERPAYMENTDTO = "com.jht.order.dto.OrderPaymentDTO";
    public final static String DELIVERYORDERDTO = "com.jht.order.dto.DeliveryOrderDTO";
    public final static String TRADE_ORDER_OUT_DTO = "com.jht.order.dto.TradeOrderOutDTO";

    public final static String MAPPRICEDTO = "com.jht.mapprice.dto.MapPriceDTO";

    public final static String USERADDRESSOUTDTO = "com.jht.user.dto.UserAddressOutDTO";
    public final static String UCUSERTRADEPROPERTYPRODUCTSELLERDTO = "com.jht.user.dto.UcUserTradePropertyProductSellerDTO";
    public final static String UCUSERTRADEPROPERTYCUSTOMERSELLERDTO = "com.jht.user.dto.UcUserTradePropertyCustomerSellerDTO";
    public final static String UCUSERTRADEPROPERTYPRODUCTPURCHASEDTO = "com.jht.user.dto.UcUserTradePropertyProductPurchaseDTO";
    public final static String UCUSERTRADEPROPERTYSUPPLIERPURCHASEDTO = "com.jht.user.dto.UcUserTradePropertySupplierPurchaseDTO";
    public final static String TRADEITEMENQUIRYINFOOUTDTO = "com.jht.enquiry.dto.TradeItemEnquiryInfoOutDTO";
    public final static String CONSIGNEDPROCESSINGDTO = "com.jht.consigned.dto.ConsignedProcessingDTO";
    public final static String DINGTALKENTMESSAGESENDLOGDTO = "com.jht.dingtalk.dto.DingtalkEntMessageSendLogDTO";
    public final static String BILLACCOUNTDETAILOUTDTO = "com.jht.bill.dto.BillAccountDetailOutDTO";
    public final static String BANKPAYMENTMASTEROUTDTO = "com.jht.payment.dto.BankPaymentMasterOutDTO";
    public final static String PAYMENTAPPLICATIONDETAILOUTDTO = "com.jht.payment.dto.PaymentApplicationDetailOutDTO";
    public final static String PURCHASEORDERLOGISTICSINFODTO = "com.jht.purchase.dto.PurchaseOrderLogisticsInfoDTO";
    public final static String LOGISTICSTRANSPORTBILLINFOOUTDTO = "com.jht.logistics.dto.LogisticsTransportBillInfoOutDTO";
    public final static String COMPANYPRODUCTPURCHASEMANAGERDTO = "com.jht.company.dto.UcCompanyProductPurchaseManagerOutDTO";

    public final static String INVOICEINFODETAIL = "com.jht.invoice.entity.InvoiceInfoDetail";
    public final static String INVOICEINFODETAILOUTDTO = "com.jht.invoice.dto.InvoiceInfoDetailOutDTO";
    public final static String COMMODITYTAXITEMDICTOUTDTO = "com.jht.invoice.dto.CommodityTaxItemDictOutDTO";
    public final static String INVOICEAPPLICATIONMASTEROUTDTO = "com.jht.invoice.dto.InvoiceApplicationMasterOutDTO";

    // 电子合同用 -- 开始
    public final static String SIGNATUREOUTDTO = "com.jht.econtract.dto.SignatureOutDTO";
    public final static String CONTRACTSMSRECEIVERCHANGELOGOUTDTO = "com.jht.econtract.dto.ContractSmsReceiverChangeLogOutDTO";
    public final static String CONTRACTTEMPLATEMANAGEMENTDTO = "com.jht.econtract.dto.ContractTemplateManagementDTO";

    // 电子合同用 -- 結束

    // 付款-------开始
    public final static String PATMENTAPPLICATIONMASTERDTO = "com.jht.payment.dto.PaymentApplicationMasterOutDTO";
    public final static String BANKTRANSACTIONOUTDTO = "com.jht.payment.dto.BankTransactionOutDTO";
    // 付款-------结束
    // 物流管理V1.1 --开始
    public final static String LOGISTICSINFOMASTEROUTDTO = "com.jht.logistics.dto.LogisticsInfoMasterOutDTO";
    // 物流管理V1.1 --结束
    // 亨通电子签章V1.0 --开始
    public final static String PLATFORMUSERCONTACTOUTDTO = "com.jht.company.dto.PlatformUserContactOutDTO";
    // 亨通电子签章V1.0 --结束

    public final static String TRACKRECORDCOMMENTOUTDTO = "com.jht.crm.dto.TrackRecordCommentOutDTO";

    public final static String OPMFUNCTIONLOGOUTDTO = "com.jht.log.dto.OpmFunctionLogOutDTO";

    // 缆360小程序V1.0----开始
    public final static String STOCKINVENTORYOUTDTO = "com.jht.inventory.dto.StockInventoryOutDTO";
    public final static String STOCKINOUTRECORDDETAILOUTDTO = "com.jht.inventory.dto.StockInOutRecordDetailOutDTO";
    // 缆360小程序V1.0----结束

    // 发票税率字典----开始
    public final static String INVOICETAXRATEOUTDTO = "com.jht.invoice.dto.InvoiceTaxRateOutDTO";
    // 发票税率字典----结束
    // 资金账户----开始
    public final static String FUNDACCOUNTTRANSACTIONOUTDTO = "com.jht.fund.dto.FundAccountTransactionOutDTO";

    public final static String FUNDACCOUNTOUTDTO = "com.jht.fund.dto.FundAccountOutDTO";
    // 资金账户----结束

    // 物流管理V1.3 ----开始
    public final static String LOGISTICSTRANSPORTBILLORDERCHANGELOGINDTO = "com.jht.logistics.dto.LogisticsTransportBillOrderChangeLogInDTO";
    public final static String LOGISTICSTRANSPORTBILLORDERCHANGELOGOUTDTO = "com.jht.logistics.dto.LogisticsTransportBillOrderChangeLogOutDTO";
    public final static String LOGISTICSBILLCHANGELOGOUTDTO = "com.jht.logistics.dto.LogisticsBillChangeLogOutDTO";
    // 物流管理V1.3----结束
    // 物流管理V1.3.1 ----开始
    public final static String CONTRACTMAINOUTDTO = "com.jht.econtract.dto.ContractMainOutDTO";
    // 物流管理V1.3.1 ----结束

    // CRM钉钉V2.6 ----开始
    public final static String RELEASENOTESRECORDOUTDTO = "com.jht.dingtalk.dto.ReleaseNotesRecordOutDTO";
    public final static String INSPIRATIONALLANGUAGEOUTDTO = "com.jht.dingtalk.dto.InspirationalLanguageOutDTO";
    public final static String ORDERSTATUSTRACKOUTDTO = "com.jht.order.dto.OrderStatusTrackOutDTO";
    public final static String DINGTALKREGEXOUTDTO = "com.jht.dingtalk.dto.DingtalkRegexOutDTO";
    // CRM钉钉V2.6 ----开始
    
    // 应收账款V1.0 ----开始
    public final static String NOTOPENEDACCOUNTOUTDTO = "com.jht.receivable.dto.NotOpenedAccountOutDTO";
    public final static String ACCOUNTSRECEIVABLEMANAGEOUTDTO = "com.jht.receivable.dto.AccountsReceivableManageOutDTO";
    public final static String ACCOUNTSRECEIVABLEOUTDTO = "com.jht.receivable.dto.AccountsReceivableOutDTO";
    public final static String NOTGENERATEDRECEIVABLESOUTDTO = "com.jht.receivable.dto.NotGeneratedReceivablesOutDTO";
    public final static String ACCOUNTSRECEIVABLEFOLLOWUPRECORDDTO = "com.jht.receivable.dto.AccountsReceivableFollowUpRecordDTO";
    public final static String SETTLEDACCOUNTSOUTDTO = "com.jht.receivable.dto.SettledAccountsOutDTO";
    public final static String ACCOUNTSOVERDUERECORDINDTO = "com.jht.receivable.dto.AccountsOverdueRecordInDTO";
    public final static String ACCOUNTSOVERDUERECORDOUTDTO = "com.jht.receivable.dto.AccountsOverdueRecordOutDTO";
    public final static String RECEIVABLEORDEROUTDTO = "com.jht.receivable.dto.ReceivableOrderOutDTO";
    // 应收账款V1.0 ----结束
    
    // 报价 ----开始
    public final static String PRICEBASEOUTDTO = "com.jht.price.dto.PriceBaseOutDTO";
    public final static String PRICETEMPLATEOUTDTO = "com.jht.price.dto.PriceTemplateOutDTO";
    public final static String PRICETEMPLATECATEGORYGROUPDTO = "com.jht.price.dto.PriceTemplateCategoryGroupDTO";
    public final static String MARKETDATAOUTDTO = "com.jht.market.dto.MarketDataOutDTO";
    public final static String CARRIERMANAGEMENTOUTDTO = "com.jht.logistics.dto.CarrierManagementOutDTO";
    public final static String PROCESSNODEBASEOUTDTO = "com.jht.price.dto.ProcessNodeBaseOutDTO";
    public final static String PROCESSNODEOPERATERULEOUTDTO = "com.jht.price.dto.ProcessNodeOperateRuleOutDTO";
    public final static String QUOTEDETAILOUTDTO = "com.jht.price.dto.QuoteDetailOutDTO";
    public final static String MARKETDATAORIGINRULEOUTDTO = "com.jht.market.dto.MarketDataOriginRuleOutDTO";
    // 报价 ----结束
    
    // 应付账款V1.0 ----开始
    public final static String ACCOUNTSPAYABLEOUTDTO = "com.jht.payable.dto.AccountsPayableOutDTO";
    public final static String PAYABLEORDEROUTDTO = "com.jht.payable.dto.PayableOrderOutDTO";
    public final static String ACCOUNTSPAYABLEMANAGEOUTDTO = "com.jht.payable.dto.AccountsPayableManageOutDTO";
    public final static String NOTOPENEDACCOUNTOFPAYABLEOUTDTO = "com.jht.payable.dto.NotOpenedAccountOfPayableOutDTO";
    public final static String NOTGENERATEDPAYABLEOUTDTO = "com.jht.payable.dto.NotGeneratedPayableOutDTO";
    public final static String ACCOUNTSPAYABLERECORDOUTDTO = "com.jht.payable.dto.AccountsPayableRecordOutDTO";
    // 应付账款V1.0 ----结束
    
    // 发票管理V1.3 ----开始
    public final static String INVOICESUBTRACTITEMOUTDTO = "com.jht.invoice.dto.InvoiceSubtractItemOutDTO";
    public final static String INVOICECATEGORYOUTDTO = "com.jht.invoice.dto.InvoiceCategoryOutDTO";
    // 发票管理V1.3 ----结束

    // 销售对账管理 V1.0 ----开始
    public final static String ACCOUNTSSTATEMENTOUTDTO = "com.jht.statement.dto.AccountsStatementOutDTO";
    // 销售对账管理 V1.0 ----结束
    /**
     * 状态----- 正常
     */
    public final static Long STATUS_NORMAL = 0L;
    /**
     * 会员账号状态正常
     */
    public final static String NORMAL = "NORMAL";
    /**
     * 会员账号状态挂起
     */
    public final static String SUSPENSION = "SUSPENSION";
    /**
     * 客服电话
     */
    public final static String PHONE = "400-186-5151";
    /**
     * 状态----- 删除
     */
    public final static Long STATUS_DELETED = 1L;
    public final static String DISABLED = "1";
    /**
     * 排序默认值
     */
    public final static Integer DEFAULT_SORT = 0;

    /**
     * 采购商
     */
    public final static String BUYER = "BUYER";
    /**
     * 注册会员
     */
    public final static String REGISTER = "REGISTER";
    /**
     * 普通用户
     */
    public final static String COMMON_USER = "COMMON_USER";
    /**
     * 企业管理员
     */
    public final static String COMPANY_MANAGE = "COMPANY_MANAGE";
    /**
     * 电话
     */
    public final static String REDIS_PHONE = "REDIS_PHONE";
    /**
     * 邮箱
     */
    public final static String REDIS_MAIL = "REDIS_MAIL";
    /**
     * token
     */
    public final static String REDIS_TOKEN = "REDIS_TOKEN";
    /**
     * 验证码
     */
    public final static String REDIS_VERIFICATION_CODE = "REDIS_VERIFICATION_CODE";
    /**
     * redis key user前缀
     */
    public final static String REDIS_PRE_USER_KEY = "user_";

    // APP V3.4 --开始
    /**
     * redis key user前缀（APP用）
     */
    public final static String REDIS_PRE_USER_APP_KEY = "user_app_";
    // APP V3.4 --结束
    /**
     * redis key manager前缀
     */
    public final static String REDIS_PRE_MANAGER_KEY = "manager_";
    /**
     * 手机
     */
    public final static String MOBILE = "mobile";
    /**
     * email
     */
    public final static String MAIL = "mail";
    /**
     * 模板
     */
    public final static String TEMPLATE = "module";
    /**
     * 发送sms队列，里面是map，有mobile,module,mail
     */
    public final static String SMS_QUEUE = "sms_queue";
    /**
     * 发送order队列，里面是 属性值对象
     */
    public final static String ORDER_QUEUE = "order_queue";
    /**
     * 发送FOREST队列，里面是 属性值对象
     */
    public final static String FOREST_QUEUE = "forest_queue";
    /**
     * sms中心频道名称
     */
    public final static String REDIS_SMS = "REDIS_SMS";
    /**
     * order中心频道名称
     */
    public final static String REDIS_ORDER = "REDIS_ORDER";
    /**
     * forest中心频道名称
     */
    public final static String REDIS_FOREST = "REDIS_FOREST";
    /**
     * 增加
     */
    public final static String INCREASE = "increase";
    /**
     * 减少
     */
    public final static String REDUCE = "reduce";
    /**
     * 定时关闭挂单标识
     */
    public final static String UPDATEORDER = "UPDATE_ORDER";
    /**
     * 上传图片限制数(上限)
     */
    public final static int IMG = 10;
    /**
     * 上传图片限制数(5张上限)
     */
    public final static int IMGFIVE = 5;
    /**
     * 上传图片限制数(30张上限)
     */
    public final static int IMGTHIRTY = 30;
    /**
     * 上传图片限制数(下限)
     */
    public final static int IMGZERO = 0;
    /**
     * 会员审核状态:未认证
     */
    public final static Long UNAUTHORIZED = 71L;
    /**
     * 会员审核状态:审核中
     */
    public final static Long APPLYING = 72L;
    /**
     * 会员审核状态:已驳回
     */
    public final static Long REJECT = 73L;
    /**
     * 会员审核状态:审核通过
     */
    public final static Long SUCCESS = 74L;
    // 卖方
    public final static String SELLER = "SELLER";
    /**
     * 创建管理员密码加密常量
     */
    public static final int HASH_INTERATIONS = 1024;
    public static final int SALT_SIZE = 8;
    /**
     * 挂单id生成策略
     */
    public final static String ITEMFLAG = "GD";
    /**
     * 电子合同id生成策略
     */
    public final static String CONTRACTFLAG = "CS";
    /**
     * 委托加工单编号生成策略
     */
    public final static String CONSIGNEDFLAG = "WT";
    /**
     * 产能编号生成策略
     */
    public final static String CAPACITYFLAG = "CN";
    /**
     * APP订单id生成策略
     */
    public final static String ORDERFLAG_A = "XA";
    /**
     * WEB订单id生成策略
     */
    public final static String ORDERFLAG_W = "XW";
    /**
     * 代客下单订单id生成策略
     */
    public final static String ORDERFLAG_C = "XC";
    /**
     * 后台新建订单id生成策略
     */
    public final static String ORDERFLAG_B = "XB";
    /**
     * 后台新建采购订单id生成策略
     */
    public final static String PURCHASEFLAG_B = "BB";
    /**
     * 运营管理后台，代客下单生成的销售订单后对应生成的采购订单
     */
    public final static String PURCHASEFLAG_C = "BC";
    /**
     * 缆360，挂单询价信息编号
     */
    public final static String ENQUIRYFLAG = "CC";
    /**
     * 缆360编号规则
     */
    public final static String FLAG = "0000";

    public final static String FIRST = "first";
    public final static String SECOND = "second";
    public final static String THIRD = "third";
    /**
     * 注册会员code
     */
    public final static Long REGISTERCODE = 65L;
    /**
     * 认证会员code
     */
    public final static Long VERIFIEDCODE = 66L;
    /**
     * 交易会员code
     */
    public final static Long TRADECODE = 67L;
    /**
     * 不限
     */
    public final static String UNLIMIT = "unlimit";
    /**
     * 不限地区
     */
    public final static String UNLIMIT_REGION = "不限";
    /**
     * 发货地
     */
    public final static String SHIPMENTS_AREA = "发货地";
    /**
     * 交货地
     */
    public final static String DELIVERY_AREA = "交货地";
    /**
     * 银行账户限制数
     */
    public final static Integer BANKCOUNT = 10;
    /**
     * 订单状态:交易完成
     */
    public final static Long TRADEFINISH = 6L;
    /**
     * 密码正则表达式
     */
    public final static String REGEXP_PASSWORD = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[#@!~%^&*$`(){}+=_|;:'<>.,?-])[a-zA-Z\\d#@!~%^&*$`(){}+=_|;:'<>.,?-]{8,16}$";
    /**
     * 用户名正则表达式
     */
    public final static String REGEXP_USERNAME = "^[a-zA-Z][a-zA-Z|0-9]{7,15}$";
    /**
     * 联系人正则表达式
     */
    public final static String REGEXP_REALNAME = "^['#;*/\"-]*$";

    /**
     * 公司名正则表达式
     */
    public final static String REGEXP_COMPANYNAME = "^(?=.*['#;*/])";

    /**
     * 手机号正则表达式
     */
    public final static String REGEXP_MOBILE = "^[1][0-9]{10}$";

    /**
     * 座机号正则表达式
     */
    public final static String REGEXP_TELEPHONE = "^0\\d{2}-\\d{7,8}$|^0\\d{3}-\\d{7,8}$";

    /**
     * 数字正则表达式
     */
    public final static String REGEXP_NUMBER = "^[0-9]*$";

    /**
     * 挂单待上架
     */
    public final static Long DOWNSHELF = 62L;
    /**
     * 挂单销售中
     */
    public final static Long UPSHELF = 63L;
    /**
     * 挂单已售罄
     */
    public final static Long SOLTOUT = 64L;
    /**
     * 采购会员角色
     */
    public final static Long BUYROLE = 2L;
    /**
     * 当前登陆人id
     */
    public final static String LOGINPERSONID = "LoginPersonId";
    /**
     * 当前登陆人类型
     */
    public final static String LOGIN_PERSON_TYPE = "LoginPersonType";
    /**
     * 企业认证审核中的返回说明
     */
    public final static String CHECKING_RETURN = "请您准备51有色会员注册申请表和企业开票信息(以上资料均需加盖企业公章或合同章),我们将派人收取。";
    /**
     * 企业认证联系方式---手机
     */
    public final static String CONTACT_MOBILE = "手机";
    /**
     * 企业认证联系方式---座机
     */
    public final static String CONTACT_LANDLINE = "座机";
    /**
     * 企业认证企业证件类型---统一社会信用证
     */
    public final static String CERTIFICATE_UNIFIED = "统一社会信用证";
    /**
     * 企业认证企业证件类型---企业三证
     */
    public final static String CERTIFICATE_THREE = "企业三证";

    /**
     * 订货单code生成策略 A组
     */
    public final static String GOODS_ORDER_CREATE_FLG = "DH";

    /**
     * 订货单code生成策略 A组
     */
    public final static String GOODS_ORDER_CATEGORY_NAME = "0000";

    /**
     * 物流单code生成策略 A组
     */
    public final static String ORDER_LOGISTICS_CREATE_FLG = "WL";

    /**
     * 物流单code生成策略 A组
     */
    public final static String ORDER_LOGISTICS_CATEGORY_NAME = "0000";
    /**
     * 电子合同下载所需下划线
     */
    public final static String MARK = "_";
    /**
     * 电子合同附页下载文件名固定文字【_合同附页】
     */
    public final static String TAIL = "_合同附页";

    /**
     * 合同类型 123：自营采购合同；124：自营销售合同；125：撮合合同
     */
    public final static String CONTRACT_SELF_SUPPORT_PURCHASE = "123";

    public final static String CONTRACT_SELF_SUPPORT_SELL = "124";

    public final static String CONTRACT_MARRIED_DEAL = "125";

    /**
     * 现货资源单编码规则
     */
    public final static String ST = "ST";
    /**
     * 标识位
     */
    public final static String FALG = "flag";
    /**
     * 付款编号规则
     */
    public final static String PAYMENT_PN = "PN";
    /**
     * 支付编号规则
     */
    public final static String PAYMENT_PA = "PA";

    public final static String PAYMENTFLAG = "0000";
    /**
     * pdf转图片文件夹名称
     */
    public final static String PAYMENT = "payment";

    public final static String INVOICE = "invoice";

    public final static String IMAGE = "image";

    public final static String PDF = "pdf";

    /**
     * 变现主表生成规则
     */
    public final static String DP = "DP";
    public final static String CZ00 = "CZ00";

    /**
     * 添加运单的场合，运单编号的命名规则
     */
    public final static String TRANSPORTBILLFLAG = "YD";

    /**
     * 物流单信息表code生成策略 A组
     */
    public final static String LOGISTICS_INFO_CREATE_FLG = "WL";

    /**
     * 物流单信息表code生成策略 A组
     */
    public final static String LOGISTICS_INFO_CATEGORY_NAME = "0000";
    /**
     * 发票主表code生成策略
     */
    public final static String INVOICE_FALG = "IN";

    /**
     * 签到管理员角色id: 28
     */
    public final static long SIGN_MANAGER_ROLE_ID = 28L;

    /**
     * 业务条线部门id: 2
     */
    public final static long BUSINESS_LINE_DEPARTMENT = 2L;

    /**
     * 物流管理员角色id: 31
     */
    public final static long LOGISTICS_MANAGER_ROLE_ID = 31L;

    /**
     * 上午时间开始:7点30(发送钉钉物流通知用)
     */
    public final static String MORNING_START = "07:30:00";

    /**
     * 上午时间结束:8点30(发送钉钉物流通知用)
     */
    public final static String MORNING_END = "08:30:00";

    /**
     * 中午时间开始:11点30(发送钉钉物流通知用)
     */
    public final static String NOON_START = "11:30:00";

    /**
     * 中午时间开始:12点30(发送钉钉物流通知用)
     */
    public final static String NOON_END = "12:30:00";
    /**
     * 晚间时间开始:16点30(发送钉钉物流通知用)
     */
    public final static String EVENING_START = "16:30:00";
    /**
     * 晚间时间开始:17点30(发送钉钉物流通知用)
     */
    public final static String EVENING_END = "17:30:00";

    /**
     * 仓库表code生成策略
     */
    public final static String STOCK_FLAG = "ST";

    /**
     * 仓库表code生成策略 仓库类型标识符：实体仓
     */
    public final static String STOCK_TYPE_REAL_FLAG = "1";

    /**
     * 仓库表code生成策略 仓库类型标识符：虚拟仓
     */
    public final static String STOCK_TYPE_VIRTUAL_FLAG = "2";

    /**
     * 仓库表code生成策略 预留位
     */
    public final static String STOCK_CODE_RESERVED = "000";

    /**
     * 入库单code生成策略
     */
    public final static String STOCK_IN_RECORD_FLAG = "RK";

    /**
     * 出库单code生成策略
     */
    public final static String STOCK_OUT_RECORD_FLAG = "CK";

    /**
     * 入出库标识 0:入库
     */
    public final static int STOCK_IN_IDENTIFICATION = 0;

    /**
     * 入出库标识 1:出库
     */
    public final static int STOCK_OUT_IDENTIFICATION = 1;

    /**
     * 入库出库单编号预留位
     */
    public final static String STOCK_IN_OUT_RECORD_CODE_RESERVED = "0000";

    /**
     * 缆360小程序下单订单编号生成规则----对应票号: #8483
     */
    public final static String WECHAT_MINI_PROGRAM_ORDER_FLAG = "XM";

    /**
     * 凭证文件服务器存放路径（订单管理V1.6）
     */
    public final static String VOUCHER_IMG_PATH = "order/voucher";

    // 钉钉CRM V2.5 --开始
    /**
     * 钉钉合同编号生成策略
     */
    public final static String DTCONTRACTNOFLAG = "DT";

    /**
     * 自营公司全称：江苏五一、天津五一
     */
    public final static String SELF_COMPANY_NAME_JS = "江苏五一互联电子商务有限公司";
    public final static String SELF_COMPANY_NAME_TJ = "天津五一互联信息技术有限公司";
    public final static String SELF_COMPANY_NAME_CS = "江苏五一互联科技有限公司";

    /**
     * 自营公司字母简称：JS、TJ
     */
    public final static String SELF_COMPANY_FLAG_JS = "JS";
    public final static String SELF_COMPANY_FLAG_TJ = "TJ";
    // 钉钉CRM V2.5 --结束

    // 合同管理 V1.2--开始
    /**
     * 商城集市标识 10:集市用户
     */
    public final static String MARKET_FLAG_MARKET = "10";
    /**
     * 商城集市标识 20:商城用户
     */
    public final static String MARKET_FLAG_STORE = "20";
    // 合同管理 V1.2--结束

    // 资金账户管理 V1.0--开始

    /**
     * 资金账户交易记录编号预留位
     */
    public final static String TRANSACTIONAL_CODE_RESERVED = "00";

    /**
     * 资金账户交易记录编号编号规则:线上
     */
    public final static String TRANSACTIONAL_CODE_ON = "ON";

    /**
     * 资金账户交易记录编号编号规则:线下
     */
    public final static String TRANSACTIONAL_CODE_OF = "OF";

    /**
     * 资金账户交易记录编号编号规则:收入
     */
    public final static String TRANSACTIONAL_CODE_SR = "SR";

    /**
     * 资金账户交易记录编号编号规则:支出
     */
    public final static String TRANSACTIONAL_CODE_ZC = "ZC";

    /**
     * 资金账户交易记录编号编号规则:冻结
     */
    public final static String TRANSACTIONAL_CODE_DJ = "DJ";

    /**
     * 资金账户交易记录编号编号规则:解冻
     */
    public final static String TRANSACTIONAL_CODE_JD = "JD";

    /**
     * 资金账户交易记录编号编号规则:预付
     */
    public final static String TRANSACTIONAL_CODE_YF = "YF";

    /**
     * 资金账户交易记录编号编号规则:退款
     */
    public final static String TRANSACTIONAL_CODE_RE = "RE";

    // 资金账户管理 V1.0--结束

    // 物流管理 V1.3--开始
    /**
     * 订单有物流的时间---用于判断销售订单实际数量是否取值运单中的实收数量(物流管理V1.3添加)
     * 1、2019-06-24含24日，之前的订单，直接取订单中的实际数量显示
     * 2、2019-06-25之后的订单，如果来源是后台PC下单，那么取订单中的实际数量显示;如果来源是非后台PC下单的，取订单关联的运单的实收数量合计显示
     */
    public final static String ORDER_HAS_LOGISTICS_DATETIME = "2019-06-25 00:00:00";
    // 物流管理 V1.3--开始
    // 钉钉 V2.6--开始
    /**
     * 发送物流通知时统计2019年10月1日之后的运单(#8188)
     */
    public final static String LOGISTICS_NOTIFICATION_DATETIME = "2019-10-01 00:00:00";
    /**
     * 钉钉2.6上线时间
     */
    public final static String DINGDING_V26_UPTIME = "2020-06-12 00:00:00";
    /**
     * 结算方式种类：A类
     */
    public final static String SETTLEMENT_TYPE_VARIETY_A = "A";
    /**
     * 结算方式种类：B类
     */
    public final static String SETTLEMENT_TYPE_VARIETY_B = "B";
    // 钉钉 V2.6--开始
    
    // log输出时，不需要打印上传文件的Base64值的接口 --开始
    /**
     * 上传合同附件
     */
    public final static String ECONTRACT_ATTACHMENT_UPLOAD = "com.jht.econtract.rest.EcontractRestController.econtractAttachmentUpload";
    /**
     * 企业认证审核提交
     */
    public final static String SUBMIT_COMPANY_REVIEW = "com.jht.user.rest.CompanyRestController.submitCompanyReview";
    /**
     * 修改公司信息
     */
    public final static String COMPANY_UPDATE = "com.jht.user.rest.CompanyRestController.update";
    
    /**
     * 上传框架合同
     */
    public final static String ADD_FRAME_CONTRACT = "com.jht.econtract.rest.EcontractRestController.addFrameContract";
    // log输出时，不需要打印上传文件的Base64值的接口 --结束
    
    // 亨通系的开放接口，只需要业务接口输出解签后的log，无需基盘先行输出 --开始
    /**
     * 亨通系接口
     */
    public final static String OPENAPI_ECONTRACT_CONTRACTUPLOAD = "com.jht.econtract.rest.OpenApiEcontractRestController.contractUpload";
    
    public final static String OPENAPI_ECONTRACT_COMPANYAUTHORATIONVERIFICATION = "com.jht.econtract.rest.OpenApiEcontractRestController.companyAuthorationVerification";
    
    public final static String OPENAPI_ECONTRACT_CONTRACTGETSIGNERSTATUS = "com.jht.econtract.rest.OpenApiEcontractRestController.contractGetSignerStatus";
    
    public final static String OPENAPI_ECONTRACT_CONTRACTSENDMANUAL = "com.jht.econtract.rest.OpenApiEcontractRestController.contractSendManual";
    
    public final static String OPENAPI_ECONTRACT_CONTRACTLOCK = "com.jht.econtract.rest.OpenApiEcontractRestController.contractLock";
    
    public final static String OPENAPI_ECONTRACT_CONTRACTDOWNLOAD = "com.jht.econtract.rest.OpenApiEcontractRestController.contractDownload";
    
    // 亨通系的开放接口，只需要业务接口输出解签后的log，无需基盘先行输出 --结束
    
    // 应收账款V1.0--开始
    /**
     * 帐户交易说明---开户
     */
    public final static String FUND_ACCOUNT_TRANSACTION_MEMO_OPEN = "开户";
    /**
     * 应收编号标识位
     */
    public final static String RECEIVABLE_CODE_AMAR = "AMAR";
    
    /**
     * 账款结清编码标识位
     */
    public final static String ACCOUNTS_SETTLEMENT_CODE_AMSA = "AMSA";
    
    /**
     * 应付编号标识位
     */
    public final static String PAYABLE_CODE_AMAP = "AMAP";
    
    /**
     * 对账单编号标识位
     */
    public final static String STATEMENT_CODE_AMAS = "AMAS";
    
    /**
     * 结清账款 文言
     */
    public final static String FUND_ACCOUNT_TRANSACTION_MEMO_SETTLE_ACCOUNTS = "结清账款";
    
    
    /**
     * 签收状态 已签收
     */
    public final static String SIGN_STATUS_SIGNED = "已签收";
    
    
    /**
     * 签收状态 未签收
     */
    public final static String SIGN_STATUS_NOT_SIGNED = "未签收";
    // 应收账款V1.0--结束

    /**
     * 通用文件服务器存放路径
     */
    public final static String COMMON_UPLOAD_PATH = "/common/upload";
    /**
     * 通用文件上传接口（为了在LogInterceptor中配置无需打印参数）
     */
    public final static String COMMON_UPLOAD = "com.jht.common.rest.CommonRestController.upload";

    public final static String SYSTEM_OPERATION ="更新发布";
    public final static String MANUAL_OPERATION ="编辑发布";
    public final static String WEEK_SIX ="星期六";
    public final static String WEEK_SEVEN ="星期日";


    /**
     * 请求设备标识
     */
    public final static String DEVICE_FLAG = "device-flag";

    /**
     * 请求设备标识-51有色网站
     */
    public final static String DEVICE_FLAG_51WEB = "51youseWeb";

    /**
     * 请求设备标识-缆360网站
     */
    public final static String DEVICE_FLAG_360WEB = "lan360Web";

    /**
     * 请求设备标识-app端_ios
     */
    public final static String DEVICE_FLAG_IOS_APP = "iosApp";

    /**
     * 请求设备标识-app端_android
     */
    public final static String DEVICE_FLAG_ANDROID_APP = "androidApp";

    /**
     * 请求设备标识-钉钉端
     */
    public final static String DEVICE_FLAG_DINGTALK = "dingTalk";

    /**
     * 请求设备标识-运营端
     */
    public final static String DEVICE_FLAG_OPERATION = "operation";

    /**
     * 请求设备标识-缆360小程序
     */
    public final static String DEVICE_FLAG_LAN360WECHATMINIPG = "lan360WechatMiniPg";

    /**
     * 操作日志模板-添加菜单
     */
    public static final String OPM_FUNCTION_LOG_ADD_MENU_TEMPLATE = "为#'{'{0}}{1}#'{'{2}}";
    /**
     * 业务节点操作规则英文名-仅显示
     */
    public final static String PROCESS_NODE_OPERATE_RULE_DISPLAY_ONLY = "displayOnly";

    /**
     * 业务节点操作规则英文名-编辑
     */
    public final static String PROCESS_NODE_OPERATE_RULE_EDIT = "edit";
    
    /**
     * 报价主记录显示状态名称-全部下架
     */
    public final static String QUOTE_MASTER_STATUS_NAME_PULL_OFF_SHELVES = "全部下架";
    
    /**
     * 报价主记录显示状态名称-全部上架
     */
    public final static String QUOTE_MASTER_STATUS_NAME_ALL_PUT_ON_SALE = "全部上架";
    
    /**
     * 报价主记录显示状态名称-部分上架
     */
    public final static String PQUOTE_MASTER_STATUS_NAME_PARTLY_PUT_ON_SALE = "部分上架";

    /**
     * 报价编号的命名规则
     */
    public final static String QUOTE_CODE_FLAG = "BJ";
    
    // 钉钉CRM V2.9 --开始
    /**
     * 钉钉报表筛选类型标识_部门
     */
    public final static String DING_DING_GRAPH_SEARCH_FILTER_FLAG_DEPT = "dept";
    
    /**
     * 钉钉报表筛选类型标识_自己
     */
    public final static String DING_DING_GRAPH_SEARCH_FILTER_FLAG_MINE = "mine";
    
    /**
     * 钉钉报表筛选类型标识_选员工
     */
    public final static String DING_DING_GRAPH_SEARCH_FILTER_FLAG_EMPLOYEES = "employees";
    
    /**
     * 数据分析角色id: 8
     */
    public final static long DATA_ANALYZE_ROLE_ID = 8L;
    
    /**
     * 全公司部门id: 1
     */
    public final static long WHOLE_COMPANY_DEPARTMENT = 1L;
    
    /**
     * 钉钉报表筛选类型标识_选员工
     */
    public final static String DING_DING_ROOT_DEPT_NAME = "全公司";
    // 钉钉CRM V2.9 --结束

    /**
     * 添加开票申请的场合，开票申请编号的命名规则
     */
    public final static String INVOICE_APPLICATION_FLAG = "IN";

    /**
     * 字符串"null"
     */
    public final static String STR_NULL = "null";
}
