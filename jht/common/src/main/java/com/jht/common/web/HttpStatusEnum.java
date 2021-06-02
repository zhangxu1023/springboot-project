package com.jht.common.web;

/**
 * http状态码
 * @author spring
 *
 */
public enum HttpStatusEnum {
	// 1xx Informational
	/**
	 * {@code 100 Continue}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.1.1">HTTP/1.1</a>
	 */
	CONTINUE(100, "Continue", ""),
	/**
	 * {@code 101 Switching Protocols}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.1.2">HTTP/1.1</a>
	 */
	SWITCHING_PROTOCOLS(101, "Switching Protocols", ""),
	/**
	 * {@code 102 Processing}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2518#section-10.1">WebDAV</a>
	 */
	PROCESSING(102, "Processing", ""),
	/**
	 * {@code 103 Checkpoint}.
	 * 
	 * @see <a href=
	 *      "http://code.google.com/p/gears/wiki/ResumableHttpRequestsProposal">A
	 *      proposal for supporting resumable POST/PUT HTTP requests in HTTP/1.0</a>
	 */
	CHECKPOINT(103, "Checkpoint", ""),

	// 2xx Success
	/**	
	 * {@code 200 OK}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2.1">HTTP/1.1</a>
	 */
	OK(200, "OK", ""),
	/**
	 * {@code 201 Created}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2.2">HTTP/1.1</a>
	 */
	CREATED(201, "Created", ""),
	/**
	 * {@code 202 Accepted}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2.3">HTTP/1.1</a>
	 */
	ACCEPTED(202, "Accepted", ""),
	/**
	 * {@code 203 Non-Authoritative Information}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2.4">HTTP/1.1</a>
	 */
	NON_AUTHORITATIVE_INFORMATION(203, "Non-Authoritative Information", ""),
	/**
	 * {@code 204 No Content}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2.5">HTTP/1.1</a>
	 */
	NO_CONTENT(204, "No Content", ""),
	/**
	 * {@code 205 Reset Content}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2.6">HTTP/1.1</a>
	 */
	RESET_CONTENT(205, "Reset Content", ""),
	/**
	 * {@code 206 Partial Content}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.2.7">HTTP/1.1</a>
	 */
	PARTIAL_CONTENT(206, "Partial Content", ""),
	/**
	 * {@code 207 Multi-Status}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc4918#section-13">WebDAV</a>
	 */
	MULTI_STATUS(207, "Multi-Status", ""),
	/**
	 * {@code 208 Already Reported}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc5842#section-7.1">WebDAV Binding
	 *      Extensions</a>
	 */
	ALREADY_REPORTED(208, "Already Reported", ""),
	/**
	 * {@code 226 IM Used}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc3229#section-10.4.1">Delta
	 *      encoding in HTTP</a>
	 */
	IM_USED(226, "IM Used", ""),

	// 3xx Redirection
	/**
	 * {@code 300 Multiple Choices}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3.1">HTTP/1.1</a>
	 */
	MULTIPLE_CHOICES(300, "Multiple Choices", ""),
	/**
	 * {@code 301 Moved Permanently}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3.2">HTTP/1.1</a>
	 */
	MOVED_PERMANENTLY(301, "Moved Permanently", ""),
	/**
	 * {@code 302 Found}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3.3">HTTP/1.1</a>
	 */
	FOUND(302, "Found", ""),
	/**
	 * {@code 302 Moved Temporarily}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc1945#section-9.3">HTTP/1.0</a>
	 * @deprecated In favor of {@link #FOUND} which will be returned from
	 *             {@code HttpStatus.valueOf(302)}
	 */
	@Deprecated
	MOVED_TEMPORARILY(302, "Moved Temporarily", ""),
	/**
	 * {@code 303 See Other}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3.4">HTTP/1.1</a>
	 */
	SEE_OTHER(303, "See Other", ""),
	/**
	 * {@code 304 Not Modified}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3.5">HTTP/1.1</a>
	 */
	NOT_MODIFIED(304, "Not Modified", ""),
	/**
	 * {@code 305 Use Proxy}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3.6">HTTP/1.1</a>
	 */
	USE_PROXY(305, "Use Proxy", ""),
	/**
	 * {@code 307 Temporary Redirect}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.3.8">HTTP/1.1</a>
	 */
	TEMPORARY_REDIRECT(307, "Temporary Redirect", ""),
	/**
	 * {@code 308 Resume Incomplete}.
	 * 
	 * @see <a href=
	 *      "http://code.google.com/p/gears/wiki/ResumableHttpRequestsProposal">A
	 *      proposal for supporting resumable POST/PUT HTTP requests in HTTP/1.0</a>
	 */
	RESUME_INCOMPLETE(308, "Resume Incomplete", ""),

	// --- 4xx Client Error ---

	/**
	 * {@code 400 Bad Request}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.1">HTTP/1.1</a>
	 */
	BAD_REQUEST(400, "Bad Request", ""),
	/**
	 * {@code 401 Unauthorized}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.2">HTTP/1.1</a>
	 */
	UNAUTHORIZED(401, "Unauthorized", ""),
	/**
	 * {@code 402 Payment Required}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.3">HTTP/1.1</a>
	 */
	PAYMENT_REQUIRED(402, "Payment Required", ""),
	/**
	 * {@code 403 Forbidden}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.4">HTTP/1.1</a>
	 */
	FORBIDDEN(403, "Forbidden", ""),
	/**
	 * {@code 404 Not Found}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.5">HTTP/1.1</a>
	 */
	NOT_FOUND(404, "Not Found", ""),
	/**
	 * {@code 405 Method Not Allowed}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.6">HTTP/1.1</a>
	 */
	METHOD_NOT_ALLOWED(405, "Method Not Allowed", ""),
	/**
	 * {@code 406 Not Acceptable}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.7">HTTP/1.1</a>
	 */
	NOT_ACCEPTABLE(406, "Not Acceptable", ""),
	/**
	 * {@code 407 Proxy Authentication Required}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.8">HTTP/1.1</a>
	 */
	PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required", ""),
	/**
	 * {@code 408 Request Timeout}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.4.9">HTTP/1.1</a>
	 */
	REQUEST_TIMEOUT(408, "Request Timeout", ""),
	/**
	 * {@code 409 Conflict}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.10">HTTP/1.1</a>
	 */
	CONFLICT(409, "Conflict", ""),
	/**
	 * {@code 410 Gone}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.11">HTTP/1.1</a>
	 */
	GONE(410, "Gone", ""),
	/**
	 * {@code 411 Length Required}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.12">HTTP/1.1</a>
	 */
	LENGTH_REQUIRED(411, "Length Required", ""),
	/**
	 * {@code 412 Precondition failed}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.13">HTTP/1.1</a>
	 */
	PRECONDITION_FAILED(412, "Precondition Failed", ""),
	/**
	 * {@code 413 Request Entity Too Large}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.14">HTTP/1.1</a>
	 */
	REQUEST_ENTITY_TOO_LARGE(413, "Request Entity Too Large", ""),
	/**
	 * {@code 414 Request-URI Too Long}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.15">HTTP/1.1</a>
	 */
	REQUEST_URI_TOO_LONG(414, "Request-URI Too Long", ""),
	/**
	 * {@code 415 Unsupported Media Type}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.16">HTTP/1.1</a>
	 */
	UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type", ""),
	/**
	 * {@code 416 Requested Range Not Satisfiable}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.17">HTTP/1.1</a>
	 */
	REQUESTED_RANGE_NOT_SATISFIABLE(416, "Requested range not satisfiable", ""),
	/**
	 * {@code 417 Expectation Failed}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2616#section-10.4.18">HTTP/1.1</a>
	 */
	EXPECTATION_FAILED(417, "Expectation Failed", ""),
	/**
	 * {@code 418 I'm a teapot}.
	 * 
	 * @see <a href=
	 *      "http://tools.ietf.org/html/rfc2324#section-2.3.2">HTCPCP/1.0</a>
	 */
	I_AM_A_TEAPOT(418, "I'm a teapot", ""),
	/**
	 * @deprecated See <a href=
	 *             "http://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">WebDAV
	 *             Draft Changes</a>
	 */
	@Deprecated
	INSUFFICIENT_SPACE_ON_RESOURCE(419, "Insufficient Space On Resource", ""),
	/**
	 * @deprecated See <a href=
	 *             "http://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">WebDAV
	 *             Draft Changes</a>
	 */
	@Deprecated
	METHOD_FAILURE(420, "Method Failure", ""),
	/**
	 * @deprecated See <a href=
	 *             "http://tools.ietf.org/rfcdiff?difftype=--hwdiff&url2=draft-ietf-webdav-protocol-06.txt">WebDAV
	 *             Draft Changes</a>
	 */
	@Deprecated
	DESTINATION_LOCKED(421, "Destination Locked", ""),
	/**
	 * {@code 422 Unprocessable Entity}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc4918#section-11.2">WebDAV</a>
	 */
	UNPROCESSABLE_ENTITY(422, "Unprocessable Entity", ""),
	/**
	 * {@code 423 Locked}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc4918#section-11.3">WebDAV</a>
	 */
	LOCKED(423, "Locked", ""),
	/**
	 * {@code 424 Failed Dependency}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc4918#section-11.4">WebDAV</a>
	 */
	FAILED_DEPENDENCY(424, "Failed Dependency", ""),
	/**
	 * {@code 426 Upgrade Required}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2817#section-6">Upgrading to TLS
	 *      Within HTTP/1.1</a>
	 */
	UPGRADE_REQUIRED(426, "Upgrade Required", ""),
	/**
	 * {@code 428 Precondition Required}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc6585#section-3">Additional HTTP
	 *      Status Codes</a>
	 */
	PRECONDITION_REQUIRED(428, "Precondition Required", ""),
	/**
	 * {@code 429 Too Many Requests}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc6585#section-4">Additional HTTP
	 *      Status Codes</a>
	 */
	TOO_MANY_REQUESTS(429, "Too Many Requests", ""),
	/**
	 * {@code 431 Request Header Fields Too Large}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc6585#section-5">Additional HTTP
	 *      Status Codes</a>
	 */
	REQUEST_HEADER_FIELDS_TOO_LARGE(431, "Request Header Fields Too Large", ""),

	// --- 5xx Server Error ---
	/**
	 * {@code 500 Internal Server Error}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.5.1">HTTP/1.1</a>
	 */
	INTERNAL_SERVER_ERROR(500, "Internal Server Error", ""),
	/**
	 * {@code 501 Not Implemented}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.5.2">HTTP/1.1</a>
	 */
	NOT_IMPLEMENTED(501, "Not Implemented", ""),
	/**
	 * {@code 502 Bad Gateway}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.5.3">HTTP/1.1</a>
	 */
	BAD_GATEWAY(502, "Bad Gateway", ""),
	/**
	 * {@code 503 Service Unavailable}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.5.4">HTTP/1.1</a>
	 */
	SERVICE_UNAVAILABLE(503, "Service Unavailable", ""),
	/**
	 * {@code 504 Gateway Timeout}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.5.5">HTTP/1.1</a>
	 */
	GATEWAY_TIMEOUT(504, "Gateway Timeout", ""),
	/**
	 * {@code 505 HTTP Version Not Supported}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2616#section-10.5.6">HTTP/1.1</a>
	 */
	HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version not supported", ""),
	/**
	 * {@code 506 Variant Also Negotiates}
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2295#section-8.1">Transparent
	 *      Content Negotiation</a>
	 */
	VARIANT_ALSO_NEGOTIATES(506, "Variant Also Negotiates", ""),
	/**
	 * {@code 507 Insufficient Storage}
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc4918#section-11.5">WebDAV</a>
	 */
	INSUFFICIENT_STORAGE(507, "Insufficient Storage", ""),
	/**
	 * {@code 508 Loop Detected}
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc5842#section-7.2">WebDAV Binding
	 *      Extensions</a>
	 */
	LOOP_DETECTED(508, "Loop Detected", ""),
	/**
	 * {@code 509 Bandwidth Limit Exceeded}
	 */
	BANDWIDTH_LIMIT_EXCEEDED(509, "Bandwidth Limit Exceeded", ""),
	/**
	 * {@code 510 Not Extended}
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc2774#section-7">HTTP Extension
	 *      Framework</a>
	 */
	NOT_EXTENDED(510, "Not Extended", ""),
	/**
	 * {@code 511 Network Authentication Required}.
	 * 
	 * @see <a href="http://tools.ietf.org/html/rfc6585#section-6">Additional HTTP
	 *      Status Codes</a>
	 */
	NETWORK_AUTHENTICATION_REQUIRED(511, "Network Authentication Required", ""),
	
	/**
	 * {@code 10001 Remote Service Error}.
	 * 
	 * @see
	 */
	//--- 1xxxx Server Error ---
	REMOTE_SERVICE_ERROR(10001, "Remote Service Error", "远程服务错误"),
	
	
	MESSAGE_ERROR_FIELD(10002, "没有输入正确的查询字段", ""),
	MESSAGE_ERROR_VALIDATOR(10003, "查询字段验证失败", ""),
	
	MESSAGE_ERROR_SMS(10004, "忘记密码入参参数错误", ""),
	MESSAGE_ERROR_ALTER_PASSWORD(10005, "修改密码失败", ""),
	MESSAGE_ERROR_SMS_CODE(10006, "忘记密码验证码错误", ""),
	MESSAGE_ERROR_VERIFY_PASSWORD(10007, "验证密码不符合规则", ""),
	MESSAGE_ERROR_VERIFY_USERNAME(10008, "验证用户名不符合规则", ""),
	MESSAGE_ERROR_NULL(10011, "null", "参数不能为空"),
	// 物流管理V1.1追加需求（功能 #6791） --开始
	MESSAGE_ERROR_DATA_LIST_OVERSIZED(10012,"Data list is oversized.","数据超过{0}条，无法导出，请重新设置筛选条件"),
	// 物流管理V1.1追加需求（功能 #6791） --结束
	PARAMETER_CHECK_FAILED(10013, "parameter check failed", "参数校验失败"),

	MESSAGE_ERROR_VERIFY_COMPANYNAME(11001, "companyName verify false", "验证公司名不符合规则"),
	MESSAGE_ERROR_VERIFY_REALNAME(11002, "realName verify false", "验证联系人姓名不符合规则"),
	MESSAGE_ERROR_VERIFY_MOBILENUMBER(11003, "mobileNumber verify false", "验证联系人手机号码不符合规则"),
	UPDATE_MOBILE_MUST_UPLOAD_AUTHORIZATION(11004, "update mobile must upload authorization", "修改手机号必须上传授权书"),

	MESSAGE_OPERATOR_ERROR(11111, "multiple operator anomaly", "组织架构已变更，请刷新后重试"),
	MESSAGE_OPERATOR_FAIL(11112, "operator fail", "操作失败，请重试"),

	MESSAGE_ERROR_VALIDATOR_CONDITION(10009, "特殊查询条件字段验证失败", ""),
	ISNULL(10010,"该字段为必填字段",""),
	MESSAGE_ERROR_ORDERIDISNULL(10012, "没有订单ID", ""),
	
	MESSAGE_ERROR_VALIDATOR_FIELDS(121001, "INDTO FIELDS ERROR", "入参校验不正确"),


	MESSAGE_ERROR_VALIDATOR_LINESS(10601, "LINESS verify false", "营业执照号已存在"),
	MESSAGE_ERROR_VALIDATOR_LINESS2(10602, "LINESS2 verify false", "组织机构代码已存在"),
	MESSAGE_ERROR_VALIDATOR_LINESS3(10603, "LINESS3 verify false", "税务登记证号已存在"),
	MESSAGE_ERROR_VALIDATOR_UNIFIEDCODE(10604, "UNIFIEDCODE verify false", "统一社会信用证码已存在"),
	// 工银聚V1.0追加 --开始
	MESSAGE_ERROR_VALIDATOR_UNIFIEDCODE_NOT_EXIST(10605, "UNIFIEDCODE does not exist", "统一社会信用证码不存在"),
	// 工银聚V1.0追加 --结束

	// 企业三证验重返回信息，具体中文信息在java代码处理
	MESSAGE_ERROR_VALIDATOR_CERTIFICATE(10606, "Certificate verify false", ""),
	MESSAGE_ERROR_VALIDATOR_COM_NAME(10607, "COMPANY NAME verify false", "公司名称已存在"),

	// 行情数据源
	MESSAGE_ERROR_ORIGIN_NAME_IS_EXIST(10701, "ORIGINNAME is exist", "数据源名称已存在"),
	MESSAGE_ERROR_TRADE_NAME_IS_EXIST(10702, "TRADENAME  is exist", "行情品类名称已存在"),
	ORIGIN_IS_HAVE_TRADE(10703, "ORIGIN  is have trade", "该数据源下还有品类，不能删除"),
	/**
	 * {@code 20001 Verifycode Expire}.
	 * 
	 * @see
	 */
	//--- 2xxxx User Error ---
	VERIFYCODE_EXPIRE(20001, "Verifycode Expire", "验证码过期"),
	VERIFYCODE_LOGIN(20002, "", "用户名或密码不正确"),
	VERIFYPASSWORD(20003, "", "密码格式不正确"),
	VERIFYCODE_ERROE_MAIL(20004, "Mail Verifycode Error", "邮箱校验码错误"),
	USERSTATUSSUSPENSION(20005,"Account Hang Up","账号异常，请联系客服！"),
	VERIFYCODE_ERROE_SMS(20006, "SMS Verifycode Error", "短信校验码错误"),
	VERIFYCODE_EXPIRE_RN_MAIL(21101, "Mail Verifycode Expire", "邮箱校验码已失效,请重新获取"),
	VERIFY_PASSWORD_OLD(21102, "", "原密码不正确"),
	VERIFYCODE_EXPIRE_RN_SMS(21103, "SMS Verifycode Expire", "短信校验码已失效,请重新获取"),
	SUPPLIER_PURCHASE_INSERT_FAILURE(24001, "Supplier Purchase Insert Failure", "采购会员交易属性副表（供货商/客户）插入失败"),
	SUPPLIER_PURCHASE_EXIST(24002, "This Supplier Has Been Added,Please Reselect.", "此供应商（客户）已添加，请重新选择"),
	SUPPLIER_PURCHASE_UPDATE_FAILURE(24003, "Supplier Purchase Update Failure", "采购会员交易属性副表（供货商/客户）更新失败"),
	SUPPLIER_PURCHASE_DELETE_FAILURE(24004, "Supplier Purchase Delete Failure", "采购会员交易属性副表（供货商/客户）删除失败"),
	PRODUCT_PURCHASE_INSERT_FAILURE(24005, "Product Purchase Insert Failure", "采购会员交易属性副表（采购产品/供应产品）插入失败"),
	PRODUCT_PURCHASE_EXIST(24006, "This Product Has Been Added,Please Reselect.", "产品信息已有，请重新录入"),
	PRODUCT_PURCHASE_UPDATE_FAILURE(24007, "Product Purchase Update Failure", "采购会员交易属性副表（采购产品/供应产品）更新失败"),
	SETTLEMENTISEXIST(25001, "Settlement is exist", "结算方式重复，请修改后再保存"),
	USERADDRESSISDEFAULT(25002,"UserAddress not update","不可以将默认地址修改成否"),
	USER_BANK_ACCOUNT_EXISTS(26001,"The same bank account has already existed","该银行账户已存在"),
	USER_BANK_ACCOUNT_INPUT_EXISTS(26002,"The input bank account has already existed","输入的银行账户已存在"),
	USER_BANK_ACCOUNT_DEFAULT(26003,"The default account cannot be removed","不能删除默认银行账户"),
	USER_BANK_ACCOUNT_ALREADY_DEFAULT(26004,"The selected account is already setted to default","当前银行账户已被设定为默认账户"),
	USER_BANK_ACCOUNT_UPDATE_ZERO(26005,"No bank account is setted to default successfully","设定默认账户失败"),
	USER_BANK_ACCOUNT_MAX_NUM(26006,"The amount of bank account is over the max amount","银行账户数量已超过最大值"),
	USER_ADDRESS_EXIST(26007,"The address for this user has already exsited","该用户已存在此收货地址"),
	DEPARTMENT_DELETE_FAIL(22201,"department delete fail","该部门已关联员工，不可以删除"),
	UC_USER_TRADE_PROPERTY_FINANCING_EXISTS(24008,"This financial info has been added","提示：已经添加过该资方信息，如需新增该资方融资产品，编辑相应资方信息即可！"),

	// 挂单每天做多发布3次
	VERIFYMARKET(30001,"","发布已超限额"),
	// 报价管理 1.1启用
	MARKET_ERROR_NO_DATAORIGIN(30011,"MARKET_ERROR_NO_DATAORIGIN","未找到数据源"),
	MARKET_ERROR_SWITCH(30011,"MARKET_ERROR_SWITCH","数据源爬取已关闭"),

	
	// 订单业务码4xxxx
	LACKOFSTOCK(40001,"Lack of stock","库存不足,无法下单"),
	PERMISSIONDENIED(40002,"Permission denied","您没有采购商权限，请联系客服开通！"),
	CRMADOPTORDER(40003,"","审核状态已被他人更改"),
	CRMORDERCLOSE(40004,"Order is Close","此订单已经申请关闭，将不再进行审核流程"),
	DATA_TOO_LONG(40005, "Data is too long", "数据超过2万条，无法导出，请重新设置筛选条件"),
	ORDER_OPERATED(40006, "Order has been operated on by others", "订单已被他人操作，请重试"),
	CAN_NOT_CLOSE_TRADE_ORDER(40007,"contract is effect,can not close trade order","合同已生效，不可关闭销售订单"),
	CAN_NOT_CLOSE_PURCHASE_ORDER(40008,"contract is effect,can not close purchase order","合同已生效，不可关闭采购订单"),
	PURCHASE_ORDER_DATA_TOO_LONG(40009, "Purchase order data is too long", "采购单数据超过1万条，无法导出，请重新设置筛选条件"),
	ORDER_ID_DOES_NOT_EXIST(44009,"Order ID does not exist","订单ID不存在"),
	GOODS_ORDER_OPERATED(44001, "This Goods Order has been operated on by others.", "此订货单已被他人操作，请重试"),
	PURCHASE_ORDER_HAS_VALID_TRANSPORT_BILL(44002,"Purchase order has valid transport bill","自营采购订单下的物流单中存在有效的运单,请重试"),
	CAN_NOT_CLOSE_TRADE_ORDER_BY_GOODS_ORDER_CANCEL(44003,"contract is effect,can not close trade order","合同已生效，不可通过取消订货关闭销售订单"),
	CAN_NOT_TRANSFER_CLOSE_PURCHASE_ORDER(44004,"contract is effect,can not close purchase order","合同已生效，不可通过调货关闭采购订单"),
	INVOICE_IMG_CAN_NOT_MORE_THAN_THIRTY(44005,"invoice img can not more than thirty","发票凭证必须保留一张并且不能超过30张"),




	// 订货管理V1.2 --开始
	MESSAGE_ERROR_PURCHESEORDERIDISNULL(40006, "No purchase order ID.", "没有采购订单ID"),
	MESSAGE_ERROR_PURCHESE_ORDER_DETAIL_UPDATE_ZERO(40007, "No purchase order detail is updated successfully.", "采购订单详细表更新失败"),
	MESSAGE_ERROR_PURCHASE_ORDER_LOGISTICS_INFO_UPDATE_ZERO(40008, "No purchase order logistics info is updated successfully.", "采购订单物流信息表更新失败"),
	MESSAGE_ERROR_TRADE_ORDER_DETAIL_UPDATE_ZERO(40009, "No trade order detail is updated successfully.", "销售订单详细表更新失败"),
	MESSAGE_ERROR_TRADE_ORDER_LOGISTICS_INFO_UPDATE_ZERO(40010, "No trade order logistics info is updated successfully.", "销售订单物流信息表更新失败"),

	// 订货管理V1.2 --结束
	// 工银聚V1.0 --开始
	MESSAGE_ERROR_TRADE_ORDER_NOT_EXIST(40011, "No trade order is existed.", "订单不存在"),
	
	// 工银聚V1.0 --结束
	TRADE_MAIN_CANNOT_MODIFIED_DUE_TO_BOOKING_STATUS_CHANGED(40012, "Trade main cannot be modified due to the booking status changed.", "订货状态已变更，无法修改交易主体，请刷新当前页面"),
	GOODS_ORDER_MASTER_NOT_EXSIT(40013, "Goods order master does not exist.", "订货主记录不存在"),
	TRADE_MAIN_ALREADY_CHANGED(40014, "Trade main was already been changed.", "交易主体已变更，请刷新当前页面，进行确认。"),
	CAN_NOT_GOODS_ORDER(40015, "Can not ", "无法继续操作，请确认交易主体后再进行操作。"),

	//--- 5xxxx Server Error ---
	INSERT_FAILURE(50001,"Insert Failure", "插入失败"),
	DELETE_FAILURE(50002,"Delete Failure", "删除失败"),
	UPDATE_FAILURE(50003,"Update Failure", "更新失败"),
	QUERY_FAILURE(50004,"Query Failure", "检索失败"),
	REPETITIVE_OPERATION(50005,"Repetitive Operation", "该数据被他人操作，请重试"),
	DUPLICATE_ENTRY_EXCEPTION(50006,"Duplicate Key Exception", "键值重复"),

	SUCCESSS_SUBCODE(0,"success", "成功"),
	FAIL_SUBCODE(1,"fail", "失败"),
	ZERO_SUBCODE(2,"nodata", "无数据返回"),
	
	// 电子合同业务码6xxxx
	COMPANY_NOT_EXIST(64001,"The Company does not Exist in the Database", "数据库中不存在该公司"),
	COMINFO_NOT_ENOUGT(64002,"The Company CA Register Infomation is not Enough", "该公司CA注册信息不全"),
	REG_USER_FAILURE(64003,"Registered Enterprise User Failure", "注册企业用户失败"),
	CANTRACT_INFO_UPDATE_ZERO(64004,"No Cert Info is updated Successfully", "电子合同相关信息没有被成功更新"),
	SIGNATURE_ADD_FAILURE(64005,"Add Signature Failure", "添加签章失败"),
	SIGNATURE_INSERT_ZERO(64006,"No Signature is Inserted Successfully", "没有印章被成功插入"),
	CONTRACT_MAIN_INSERT_ZERO(64007,"No Contract Record is Inserted Successfully", "没有合同记录被成功插入"),
	CONTRACT_MAIN_INVALID(64008,"Contract Main Record is Invalided", "合同主表记录已作废"),
	CONTRACT_ATTACHMENT_UPDATE_ZERO(64009,"No Contract Attachment is Updated Successfully", "合同附件表更新失败"),
	SIGNER_INFO_QUERY_FAILURE(64010,"Query Signer Info Failure", "查询签署者信息失败"),
//	CONTRACT_MAIN_UPDATE_ZERO(64011,"No Contract Record is Updated Successfully", "没有合同记录被成功插入"),
	CONTRACT_ATTACHMENT_EXPIRED(64012,"Contract Attachment Record is Expired", "合同已过期，请重新上传合同附件并签署"),
	BESTSIGN_API_FAILURE(64013,"Call Bestsign API Failure", "调用上上签API返回错误"),
	TRADE_ORDER_UPDATE_ZERO(64014,"The Orders You Have Chosen is Bound to the Contract Id. Please Reselect the Orders.", "您选择的订单已绑定合同Id，请重新选择订单"),
	STATUS_APPLIED_SUCCESS(64015,"You Have Applied Successfully, No Need to Apply Again.", "您已申请成功，无需再次申请"),
	STATUS_APPLYING(64016,"Cert Applying , No Need to Apply Again.", "申请中，您无需重复申请"),
	SELECTED_SIGNER_DELETED(64017,"The Contract Signer You Selected Has Been Deleted.", "您选定的合同负责人已被删除"),
	EITHER_COMID_EMPTY(64018,"Either Company Id Is Empty.", "请确认买卖双方公司名称是否正确"),
	BUYER_COMPANY_CONTRACT_SMS_RECIEVER_IS_NOT_FOUND(64019,"The contract sms receiver of the buyer company is not found.", "未找到买方公司合同签署负责人"),
	SELLER_COMPANY_CONTRACT_SMS_RECIEVER_IS_NOT_FOUND(64020,"The contract sms receiver of the seller company is not found.", "未找到卖方公司合同签署负责人"),
	TEMPLATE_UPDATED_FAILURE(64021,"No Template is Updated Successfully.", "模板更新冲突，请刷新后重试！"),
	BOTH_COMPANY_CONTRACT_SMS_RECIEVERS_ARE_NOT_FOUND(64022,"The contract sms receivers of the byuer and seller are not found.", "未找到买卖双方公司的合同签署负责人"),
	CONTACT_OF_CA_AUTHORATION_OR_SMS_RECEIVER(64023,"The CA author or contract sms receiver cannot be deleted.", "该联系人为CA经办人或合同负责人，不能删除"),
	HAVE_SIGNED_CONTRACT(64024,"You have signed the contract.", "您已签署该合同"),
	MERCHANTNAME_IS_EXIST(64025,"MerchantName is Exist","商户名称已存在"),
	USERCONTACT_IS_EXIST(64026,"UserContact is Exist","经办人已存在"),
	DEVELOPERIDORPRIVATEKEY_IS_NOT_EXIST(64027,"DeveloperId Or PrivateKey is not Exist","商户的开发者id或开发者私钥不存在"),
	RELATED_CONTRACT_EXIST(64028,"Related contract exsited","发现当前订单已关联合同，请再次确认"),
	RELATED_CONTRACT_CHANGED(64029,"Related contract changed","发现当前订单关联的合同已变更，请再次确认"),

	UPLOAD_ATTACHMENT_FAILURE(65001,"Upload Attachment Failure", "上传合同附件失败"),
	INSERT_ATTACHMENT_FAILURE(65002,"Insert Attachment Failure", "插入合同附件记录失败"),
	CONTACTISDELETE(65003,"This contact is delete", "该联系人已被删除，请重新选择"),
	CONTRACTISCANCALLED(65004,"ContractNo is Cancalled", "合同已作废"),
    SIGNATURE_UPDATE_ZERO(66001,"No Signatrue is Inused Successfully", "没有印章被成功启用"),
	CERTID_NOT_FOUND(66002,"No CertId Found", "未找到证书编号"),
	CERT_INFO_FAILURE(66003,"Cert Info Failure", "证书信息获取失败"),
	CERT_INFOE_UPDATE_ZERO(66004,"No Cert Info is updated Successfully", "没有证书信息被成功更新"),
	SIGNATURE_UPDATE_FAILURE(66005,"Update SignatureType Failure", "修改签章方式失败"),
	CONTRACT_API_FAILURE(66006,"Contract Failure", "出错了……"),
	CONTRACTISCANFINISHED(66007,"ContractNo is Finished", "合同已完成"),
	INVALIDREASONISNOTFOUND(66008,"InvalidReason is not Found", "该合同没有作废原因"),
	CONTRACTIMAGEURLISNOTFOUND(66009,"ContractImageUrl is not Found", "合同图片路径没有找到"),
	ATTACHMENTISEXPIRE(66010,"Attachment is Expire", "合同附件已过期"),
	ATTACHMENTISNOTEXIST(66011,"Attachment is not exist", "该合同附件不存在"),
	ATTACHMENTISFINISHED(66012,"Attachment is Finished","合同附件已完成"),
	NOT_TRADITIONAL_SIGNATURE(66013,"This contract is not signed by traditional signature","此合同不是传统合同"),
	NULL_CONTRACT_SIGN_TIME(66014,"This contract sign time is null","不能将合同签署时间修改为空"),
	ATTACHMENT_CAN_NOT_INVALID(66015,"attachment can not invalid","主合同记录已作废,该附件不可以进行取消作废操作"),
	NO_RELATED_ORDER_SELECTED(66016,"no related order selected","未选择关联订单"),
	NO_FRAME_CONTRACT_FOUND(66017,"no frame contract found","未找到框架合同"),
	CONTRACT_TYPE_NOT_EMPTY(66018,"contract type should not be empty","合同类型不能为空"),
	SIGN_TYPE_NOT_EMPTY(66019,"sign type should not be empty","签章类型不能为空"),
	CONTRACT_NUMBER_NOT_EMPTY(66020,"contract number should not be empty","合同编号不能为空"),
	ORDER_CREATE_TIME_NOT_IN_FRAME_CONTRACT_VALID_TIME_PERIOD(66021,"order create time not in select contract valid time period","订单下单时间不在选定框架合同有效期内"),
	CONTRACT_VALID_TIME_NOT_EMPTY(66022,"contract valid time should not be empty","合同有效期不能为空"),
	CONTRACT_CANNNOT_VALID_DUE_TO_BOUNDED_ORDERS(66023,"contract cannot valid due to bounded orders","不能作废已绑定订单的合同"),


	//银承库业务码67xxx
	YINCHENGKU_API_FAILURE(67001,"Call Yinchengku API Failure","调用银承库API返回错误"),
	BILL_INFO_ERR(67002,"Please Enter the Correct Bill Information.","请输入正确的票据信息"),
	APP_OPERATED(67003,"The Application Has Been Operated.", "该申请已被操作过"),
	YINCHENGKU_COM_NOT_APPLY(67004,"The company did not apply for a bill account","该公司未申请票据账户"),
	YINCHENGKU_COMID_INVALID(67601,"comId invalid","无效的公司"),
	YINCHENGKU_BANKID_INVALID(67602,"bankId invalid","无效的银行账号"),
	YINCHENGKU_BILLACCOUNTDETAIL_INVALID(67603,"bill account detail invalid","账户未开通成功，请联系客服重新开通4001865151"),
	YINCHENGKU_DATA_INVALID(67604,"data invalid","封装数据失败"),
	YINCHENGKU_CHECKSTAND_INVALID(67605,"checkstand invalid","调用收银台失败"),
	YINCHENGKU_ADD_USER_FAIL(67801,"add user fail","创建余额账户失败"),
	YINCHENGKU_ADD_USER_UPDATE_FAIL(67802,"add user update fail","票据账号申请已提交，请勿重复操作!"),
	//工银聚业务码68XXX
	GYJ_FINANCING_RECORD_UPDATE_FAILURE(68001,"gyj_financing_record update Failure","融资记录表更新失败"),
	GYJ_TRANSCODE_E0008_ZERO(68002,"The size of loan list is 0","融资记录查询结果为0条"),
	GYJ_TRANSCODE_E0001_FAILED(68003,"E0001 called failed","融资申请提交失败，请重试"),
	GYJ_FINANCE_CATEGORY_CYCLE_EXISTS(68004,"This finance category cycle has been added","“{0}”已存在，请选择其他品类进行设置！"),
	GYJ_FINANCE_CATEGORY_CYCLE_NOT_EXISTS(68005,"This Current category has no financing cycle","当前品类“{0}-{1}”暂不支持使用“工银e贷”进行融资支付！"),
	
	// 物流业务码679xx
	LOGISTICS_ADD_FEE_FAIL(67900,"add logistics fee fail","物流明细费用添加失败，请重试!"),
	LOGISTICS_UPDATE_FEE_FAIL(67901,"update logistics fee fail","物流明细费用修改失败，请重试!"),
	LOGISTICS_ADD_DRIVER_FAIL(67902,"add logistics driver fail","司机和车辆已存在，不可重复添加"),
	LOGISTICS_UPDATE_TRANSPORT_FAIL(67903,"update logistics transport bill info fail","该运单已被其他人操作"),
	LOGISTICS_UPDATE_MASTER_FAIL(67904,"update logistics info master fail","该物流单已被其他人操作"),
	LOGISTICS_FIND_TRANSPORT_FAIL(67905,"logistics transport bill was not found","未找到该运单"),
	TRANSPORT_BILL_HAS_ESTIMATED_DELIVER_TIME_GREATER_THAN_ESTIMATED_ARRIVE_TIME(67906,"transport bill has estimated deliver time greater than estimated arrive time","添加的运单中包含预计发货时间大于预计到达时间的运单"),
	LOGISTICS_ORDER_CHANGE_SAME_ORDER_ID(67906,"chosen order is the same to the current.","调货订单与当前运单关联订单相同，请重新选择"),
	LOGISTICS_UPLOAD_TRANSPORT_BILL_DELIVER_IMG_FAIL(67907,"upload or edit deliver image for transport bill info failed.","上传或编辑运单的发货单图片失败"),
	LOGISTICS_UPLOAD_LOGISTICS_DELIVER_IMG_FAIL(67908,"upload or edit deliver image for logistics master failed.","上传或编辑物流单的发货单图片失败"),

	// CRM相关业务码7xxxx
	CPNTRACT_CONTACT_MASTER_EDIT(76001,"Contract master cannot be edited","该联系人是合同负责人，不可以编辑"),
	CPNTRACT_CONTACT_MASTER_DELETE(76002,"Contract master cannot be deleted","该联系人是合同负责人，不可以进行删除"),
	DEFAULT_CONTACT_CANNOT_BE_DELETE(76003,"Default contract cannot be deleted","该联系人是默认联系人，不可以进行删除"),
	REGISTER_CONTACT_MASTER_EDIT(76004,"Register Contract master cannot be edited","该联系人是注册联系人，不可以编辑"),
	REGISTER_CONTACT_CANNOT_BE_DELETE(76005,"Register contract cannot be deleted","该联系人是注册联系人，不可以进行删除"),

	// 收付款相关业务代码8xxxx
	CLEAR_ACCOUNTS_IN_APPROVAL (80001,"Clearing Accounts in Approval","订单包含“审批中”的付款记录"),
	CLEAR_ACCOUNTS_PAYMENT_SUCCESSS(80002,"Clearing Accounts Payment Success is not exist","订单不包含“支付成功”的付款记录"),
	UPLOAD_PAYMENT_LIMIT(80003, "upload payment limit", "上传付款凭证已超限"),
	CLEAR_ACCOUNTS_OUT_APPROVAL(80004,"Clearing Accounts out Approval","订单包含“审批通过”的付款记录"),
	NO_AUTHORITY_AT_PRESENT(80005,"No authority at present","暂无申请权限，请联系管理员开通"),
	CLEAR_ACCOUNTS_IN_PROCESS(80006,"Clearing Accounts in process","含有处理中的支付申请，不可结清账款"),
	PURCHASE_ORDER_HAS_REVIEW_RECORD(80007,"Purchase order has review record","订单包含审批通过或审批中的付款审批记录,请重试"),
	PURCHASE_ORDER_HAS_NO_REVIEW_RECORD(80008,"Purchase order has no review record","订单不包含审批通过或审批中的付款审批记录,请重试"),
	UPDATE_PAYMENT_APPLICATION_MASTER_FAIL(80009,"update PaymentApplicationMaster fail","更新付款申请表失败"),
	PAYMENT_APPLICATION_HAS_BANK_PAYMENT_RECORD(80010,"Payment application has bank payment record","该笔付款已经有银行支付记录，不可以线下支付"),
	PAYMENT_APPLICATION_HAS_OFFLINE_PAY(80011,"Payment application has offline pay","该笔付款已经有线下支付记录，不可以提交银行付款"),

	// 发票相关业务代码9xxxx
	INVOICE_ALREADY_EXISTS(90001,"Invoice already exists","发票已存在，请检查发票代码或发票号码输入是否有误"),
	COMMODITY_TAX_ITEM_ALREADY_EXISTS(90002,"CommodityTaxItem already exists","商品税目已存在,请勿重复添加"),
	USER_INVOICE_EXIST(90003,"User Invoice Exist", "该公司的开票资料已存在，请刷新后查看"),
	INVOICE_CANNOT_INVALIDATED(90004,"The invoice cannot be invalidated,Please cancel the order first", "无法作废该发票，请先取消订单的关联"),
	SUBTRACT_ITEM_NAME_NOT_NULL(90005,"The Subtract item name is not allowed to be empty", "核减项名称不允许为空"),
	SUBTRACT_ITEM_NAME_ALREADY_EXISTS(90006,"Subtract item name already exists", "核减项名称已存在"),
	COMMODITY_TAX_ITEM_NAME_ALREADY_EXISTS(90007,"Commodity tax item name already exists", "商品税目名称已存在"),
	COMMODITY_TAX_ITEM_CODE_ALREADY_EXISTS(90008,"Commodity tax item code already exists", "商品编码已存在"),
	COMMODITY_TAX_ITEM_CANNOT_BE_DELETED(90009,"Commodity tax item can not be deleted", "不能删除商品税目，请解除与类目的关联关系重新尝试！"),
	INVOICE_AFTER_ARRIVAL_AND_INVOICE_AFTER_PAYMENT_CAN_NOT_ALL_FALSE(900010,"invoice after arrival and invoice after payment can not all false","到货开具和款到开具不能均为否"),
	MANAGER_IS_ALREADY_INVOICE_APPROVAL_INITIATOR(900011,"manager is invoice approval initiator","该用户已经是审批发起人,不能重复添加"),
	FAILED_TO_CANCEL_DINGTALK_APPROVAL(900012,"Failed to cancel dingTalk approval","撤销钉钉审批失败，请重试"),
	FAILED_TO_GET_DINGTALK_ACCESSTOKEN(900013,"Failed to get dingTalk accesstoken","获取钉钉AccessToken失败"),

	// 发票管理 V1.3
	INVOICE_CHECK_RECEIVABLE_OF_FUND_ACCOUNT (900012,"invoice receivable of fund account check Failure","该用户账户余额不足，请调整开票订单"),
	NO_PERMISSION_TO_INITIATE_INVOICE_APPLICATION(900013,"No permission to initiate invoice application","没有权限发起开票申请"),
	ORDER_INVOICE_AMOUNT_OR_QUANTITY_MUST_BIG_OF_ZERO(900014,"Order invoice amount or quantity must big of zero","订单可开票金额或者可开票数量必须大于0"),
	THE_ORDER_DOES_NOT_MEET_THE_BILLING_CONDITIONS(900015,"The order does not meet the billing conditions","订单不符合开票条件"),
	NO_BILLING_DETAILS_SELECTED(900016,"No billing details selected","没有选择开票详情"),
	INVOICED_WAYBILL_DATA_EXISTS(900017,"Invoiced waybill data exists","不能选择已开票运单数据"),
	REDUCED_ORDER_HAS_BEEN_REDUCED(900018,"Reduced order has been reduced","核减项订单已被核减"),
	THERE_IS_NO_BILL_RECEIVABLE(900019,"There is no bill receivable","没有可开票的运单应收"),
	ORDER_HAS_BEEN_SUBTRACTED(900020,"The Order has been subtracted","当前订单超开（或少开）的金额已经被其他订单核减，不允许编辑（或取消完成）"),
	INVOICE_APPLICATION_NUMBER_ALREADY_EXISTS (900013,"Invoice application number already exists","发票申请编号已存在"),

	//亨通电子签证相关业务码
	COMPANY_NAME_OR_UNIFIED_CODE_ALREADY_EXIST(64028,"CompanyName or unifiedCode already exist","公司名称或者统一社会信用证号（营业执照号）已存在"),
	COMPANY_CONSISTENCY_CHECK_FAILED (64029,"Company consistency check failed","企业一致性校验失败，请核对公司名称、统一社会信用证、法人姓名是否一致"),

	//缆360小程序相关业务码
	STOCK_NAME_ALREADY_EXIST(70001,"Stock Name already exist","该仓库名已存在"),
	STOCK_INVENTORY_ALREADY_EXIST(70002,"Stock Inventory already exist","库存中存在该商品，不可重复添加"),
	STOCK_DELETE_FAIL(70003,"Delete stock fail","该仓库有入库记录，不允许删除"),
	ITEM_ALREADY_OPERATED(70004, "This item has been operated on by others.","此挂单已被他人操作，请重试"),

	//类目相关业务码
	PROP_VALUE_NAME_EXIST(100001,"Prop value name already exist","属性值已存在"),
	
	// 资金账户相关业务代码81xxx
	FUND_ACCOUNTS_INSUFFICIENT_BALANCE (81001,"Fund Account Insufficient Balance","可用余额不足"),
	FUND_ACCOUNTS_UNFREEZE_FAILURE (81002,"Fund Account Unfreeze Failure","解冻失败"),
	FUND_ACCOUNTS_INCOME_ONLINE_FAILURE (81003,"Fund Account Income Online Failure","收款已被添加,不可重复添加"),

	FUND_ACCOUNTS_OPEN_FAILURE (81004,"Fund Account Open Failure","账户已开通，不可重复开通"),

	ACCOUNT_NOT_OPENED(81005,"Account not opened, please open it first","当前账户未开通资金账户，请先开通资金账户！"),
	
	// 应收相关业务代码82xxx
	CHECK_RECEIVABLE_OF_FUND_ACCOUNT (82001,"receivable of fund account check Failure","账户余额不足，不可结清"),
	CHECK_LOGISTICS_TRANSPORT_BILL (82002,"logistics transport bill check Failure","有未签收运单，不可结清"),
	CHECK_OVERDUE_RECORD (82003,"overdue record check Failure","有未处理完成的逾期，请处理后再结清"),
	CHECK_RECEIVABLE_AMOUNT_SUM_CHANGE (82004,"receivable amount sum check Failure","应收金额已发生变更，请重新确认后再结清"),
	CHECK_RECEIVABLE_OVERDUE (82005,"receivable & overdue check Failure","不能编辑结算方式，需在对账管理中作废所有应收和逾期后再编辑，编辑后重新生成应收"),
	CHECK_REFUNDABLE_AMOUNT (82006,"The refundable amount shall not be greater than the sum of the receivables of the current order","应退金额不得大于当前订单的有效应收的应收金额之和"),
	CHECK_ORDER_SETTLED (82007,"The order has been settled","该订单已结清账款，不允许此操作"),
	CHECK_RECEIVABLE_OF_ZERO (82008,"receivable of zero check Failure","应收合计金额不能为0"),
	CHECK_MAINBODY_RECEIVABLE_OVERDUE (82009,"The order has receivable and overdue","不能编辑交易主体，需在对账管理中作废所有应收和逾期后再编辑"),
	CHECK_OBSOLETE_AMOUNT (82010,"The obsolete refundable amount shall not be greater than the sum of the receivables of the current order","作废的应收金额不得大于当前订单的有效应收的应收金额之和"),
	UPDATE_OVERDUE_RECORD_FAIL (82011,"update overdue record fail","作废应收逾期记录失败"),
	
	// 应付相关业务代码82xxx
	CHECK_REFUNDABLE_PAYABLES_AMOUNT (82012,"The refundable amount shall not be greater than the sum of the payables of the current order","应退金额不得大于当前订单的有效应付的应付金额之和"),
	CHECK_OBSOLETE_PAYABLES_AMOUNT (82013,"The obsolete refundable amount shall not be greater than the sum of the payables of the current order","作废的应付金额不得大于当前订单的有效应付的应付金额之和"),
	CHECK_PAYABLE (82014,"receivable check Failure","不能编辑结算方式，需在对账管理中作废所有应付后再编辑，编辑后重新生成应付"),
	
	// 报价相关
	CHECK_PRICE_TEMPLATE_EXIST (83001,"price template check Failure","已有价格模板配置当前价格组成，不允许删除！"),
	CHECK_PRICE_TEMPLATE_NAME_EXIST (83002,"price template name check Failure","模板名称已存在，请重新输入"),
	CHECK_PRICE_NAME_EXIST (83003,"price name check Failure","价格名称已存在，请重新输入"),
	CARRIER_ROUTE_EXIST (83004,"carrier route exist","以下路线已存在,请勿重复添加"),
	CARRIER_MANAGER_EXIST (83005,"CarrierManagement exist","该承运商已存在,请勿重复添加"),
	BATCH_OPERATION_FAILED(83006,"batch operation failed","承运路线批量操作失败"),
	PRICE_ID_REQUIED(83007,"price id required","价格组成id必须"),
	CURRENT_PRICE_BASE_PROCESS_NODE_RELATION_DELETE_FAILED(83008,"current price base process node relation delete failed","当前业务节点设定删除失败"),
	PRICE_BASE_PROCESS_NODE_RELATION_CREATE_FAILED(83009,"current price base process node relation create failed","业务节点设定失败"),
	CURRENT_PRICE_BASE_QUOTE_PRICE_ORIGIN_RELATION_DELETE_FAILED(83010,"current price base quote price origin relation delete failed","当前价格来源删除失败"),
	PRICE_BASE_QUOTE_PRICE_ORIGIN_RELATION_CREATE_FAILED(83011,"price base quote price origin relation create failed","当前价格来源设定失败"),
	PROPERTIES_EXIST(83012, "properties exist","销售属性已存在"),
	PRICE_TEMPLATE_CAN_NOT_UPDATE(83013, "price template can not update","该价格模板已被现货报价使用,不可修改或删除"),
	PRICE_TEMPLATE_HAS_BEEN_UPDATE_OR_REMOVED(83015,"price template has been removed","所选择的价格模板已被修改或删除,请重试"),
	CAN_NOT_EDIT_HAS_BEEN_ON_QUOTE_DETAIL(83016,"can not edit has been on quote detail","编辑的报价信息中含有已上架的数据,请重试"),
	PRICE_MUST_GREATER_THAN_ZERO(83017,"price must greater than zero","综合单价必须大于0"),
	CONTRACT_PRICE_NOT_INCLUDE_FREIGHT_MUST_GREATER_THAN_ZERO(83018,"contract price not include freight must greater than zero","合同单价（不包含运费）必须大于0"),
	PRICE_MUST_WEIGHT_ZERO(83019,"price must weight zero","现货数量为0，不能再次上架"),
	DATA_OLD(83020,"price must weight zero","该数据已被其他人操作"),
	PRICE_CAN_NOT_NULL(83021,"price can not null","价格不能为空"),
	STOCK_WEIGHT_MUST_GREATER_THAN_ZERO(83022,"stock weight must greater than zero","下单时现货数量必须大于0"),
	QTUOE_IS_NOT_FOUND_OR_OFF(83023,"quote is not found or is off","未找到报价或该报价已下架"),
	QUOTE_DETAIL_CAN_NOT_NULL(83024,"quote detail can not null","报价商品不能为空"),
	QUOTE_ALREADY_EXIST(83025,"quote already exist","已存在报价商品"),

	// 对账相关
	THIS_TRANSACTION_ENTITY_IS_TO_CREATE_A_BILL_TEMPLATE(84001,"This transaction entity is to create a bill template, please create it first","此交易主体为创建账单模板，请先创建");


	private final int value;
	private final String enMessage;
	private final String cnMessage;
	
	private HttpStatusEnum(int value, String enMessage, String cnMessage) {
		this.value = value;
		this.enMessage = enMessage;
		this.cnMessage = cnMessage;
	}

	/**
	 * Return the integer value of this status code.
	 */
	public int value() {
		return this.value;
	}

	/**
	 * Return the en message of this status code.
	 */
	public String getEnMessage() {
		return enMessage;
	}
	
	/**
	 * Return the cn message of this status code.
	 */
	public String getCnMessage() {
		return cnMessage;
	}

	/**
	 * Whether this status code is in the HTTP series
	 * {@link org.springframework.http.HttpStatus.Series#INFORMATIONAL}. This is a
	 * shortcut for checking the value of {@link #series()}.
	 */
	public boolean is1xxInformational() {
		return (Series.INFORMATIONAL.equals(series()));
	}

	/**
	 * Whether this status code is in the HTTP series
	 * {@link org.springframework.http.HttpStatus.Series#SUCCESSFUL}. This is a
	 * shortcut for checking the value of {@link #series()}.
	 */
	public boolean is2xxSuccessful() {
		return (Series.SUCCESSFUL.equals(series()));
	}

	/**
	 * Whether this status code is in the HTTP series
	 * {@link org.springframework.http.HttpStatus.Series#REDIRECTION}. This is a
	 * shortcut for checking the value of {@link #series()}.
	 */
	public boolean is3xxRedirection() {
		return (Series.REDIRECTION.equals(series()));
	}

	/**
	 * Whether this status code is in the HTTP series
	 * {@link org.springframework.http.HttpStatus.Series#CLIENT_ERROR}. This is a
	 * shortcut for checking the value of {@link #series()}.
	 */
	public boolean is4xxClientError() {
		return (Series.CLIENT_ERROR.equals(series()));
	}

	/**
	 * Whether this status code is in the HTTP series
	 * {@link org.springframework.http.HttpStatus.Series#SERVER_ERROR}. This is a
	 * shortcut for checking the value of {@link #series()}.
	 */
	public boolean is5xxServerError() {
		return (Series.SERVER_ERROR.equals(series()));
	}
	
	/**
	 * Whether this status code is in the HTTP series
	 * {@link com.jht.common.core.web.HttpStatusEnum.Series#SYSTEM_ERROR}. This is a
	 * shortcut for checking the value of {@link #series()}.
	 */
	public boolean is1xxxxServerError() {
		return (Series.SYSTEM_ERROR.equals(series()));
	}
	
	/**
	 * Whether this status code is in the HTTP series
	 * {@link com.jht.common.core.web.HttpStatusEnum.Series#APPLICATION_ERROR}. This is a
	 * shortcut for checking the value of {@link #series()}.
	 */
	public boolean is2xxxxServerError() {
		return (Series.APPLICATION_ERROR.equals(series()));
	}

	/**
	 * Returns the HTTP status series of this status code.
	 * 
	 * @see HttpStatus.Series
	 */
	public Series series() {
		return Series.valueOf(this);
	}

	/**
	 * Return a string representation of this status code.
	 */
	@Override
	public String toString() {
		return Integer.toString(value);
	}

	/**
	 * Return the enum constant of this type with the specified numeric value.
	 * 
	 * @param statusCode
	 *            the numeric value of the enum to be returned
	 * @return the enum constant with the specified numeric value
	 * @throws IllegalArgumentException
	 *             if this enum has no constant for the specified numeric value
	 */
	public static HttpStatusEnum valueOf(int statusCode) {
		for (HttpStatusEnum status : values()) {
			if (status.value == statusCode) {
				return status;
			}
		}
		throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
	}

	/**
	 * Java 5 enumeration of HTTP status series.
	 * <p>
	 * Retrievable via {@link HttpStatus#series()}.
	 */
	public static enum Series {
		INFORMATIONAL(1), 
		SUCCESSFUL(2), 
		REDIRECTION(3), 
		CLIENT_ERROR(4), 
		SERVER_ERROR(5),
		SYSTEM_ERROR(6),
		APPLICATION_ERROR(7);

		private final int value;

		private Series(int value) {
			this.value = value;
		}

		/**
		 * Return the integer value of this status series. Ranges from 1 to 5.
		 */
		public int value() {
			return this.value;
		}

		public static Series valueOf(int status) {
			int seriesCode = status / 100;
			for (Series series : values()) {
				if (series.value == seriesCode) {
					return series;
				}
			}
			throw new IllegalArgumentException("No matching constant for [" + status + "]");
		}

		public static Series valueOf(HttpStatusEnum status) {
			return valueOf(status.value);
		}

	}
}
