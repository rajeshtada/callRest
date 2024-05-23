
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- ===== Left-Sidebar ===== -->

<aside class="sidebar">
	<div class="scroll-sidebar">
		<div class="user-profile">
			<div class="dropdown user-pro-body">
				<div class="profile-image">
					<img
						src="${pageContext.request.contextPath}/resources/images/getepay.png"
						alt="user-img"> <a href="javascript:void(0);"
						class="dropdown-toggle u-dropdown text-blue"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false"> </a>
				</div>
			</div>
		</div>

		<nav class="sidebar-nav">
			<ul id="side-menu">
				<li id="home"><a class="active waves-effect"
					href="${pageContext.request.contextPath}/" aria-expanded="false"
					class=""><i class="fa fa-file"></i> &nbsp; &nbsp; <span
						class="hide-menu"> Home </span></a></li>


				<c:if
					test="${userPermissions.hasPermissionByMap('ADD_MERCHANT')	or userPermissions.hasPermissionByMap('MERCHANT_LIST')	or 
							userPermissions.hasPermissionByMap('MERCHANT_WITH_VPA')	or	
							or userPermissions.hasPermissionByMap('DIGITAL_MERCHANT_ONBOARDING')}">

					<li id="merchant"><a class="waves-effect"
						href="javascript:void(0);" aria-expanded="false"><i
							class="fa fa-user-circle-o fa-lg" style="color: #0283cc;"></i>
							&nbsp; &nbsp; <span class="hide-menu"> Merchant </span></a>
						<ul aria-expanded="false" class="collapse">

							<c:if
								test="${userPermissions.hasPermissionByMap('CHANGE_PASSWORD')}">
								<li><a
									href="${pageContext.request.contextPath}/changePassword">Change
										Password</a></li>
							</c:if>

							<c:if
								test="${userPermissions.hasPermissionByMap('PAYMENT/CURRENCY')}">
								<li><a
									href="${pageContext.request.contextPath}/getEnabledPage">Paymode/Currency</a>
								</li>
							</c:if>

							<c:if
								test="${userPermissions.hasPermissionByMap('RISK_PARAMETER')}">
								<li><a
									href="${pageContext.request.contextPath}/getPaymodeLimit">Risk
										Parameter </a></li>
							</c:if>

						</ul></li>

				</c:if>

				<c:if
					test="${userPermissions.hasPermissionByMap('MERCHANT_SETTINGS')	or userPermissions.hasPermissionByMap('UPLOAD_BULK_SETTING')	or	
							userPermissions.hasPermissionByMap('CREDIT_CARD_RUPAY_CHARGES') or userPermissions.hasPermissionByMap('CONVENIENCE_CHARGES') }">

					<li id="mSetting"><a class="waves-effect"
						href="javascript:void(0);" aria-expanded="false"><i
							class="fa fa-cog" style="color: #0283cc;"></i>&nbsp; &nbsp; <span
							class="hide-menu">Settings </span></a>
						<ul aria-expanded="false" class="collapse">

							<c:if
								test="${userPermissions.hasPermissionByMap('MERCHANT_SETTINGS')}">
								<li><a
									href="${pageContext.request.contextPath}/getSettingPage">Merchant
										Settings</a></li>
							</c:if>

							<c:if
								test="${userPermissions.hasPermissionByMap('UPLOAD_BULK_SETTING')}">
								<li><a
									href="${pageContext.request.contextPath}/uploadMerchantSetting">Upload
										Bulk Settings</a></li>
							</c:if>

						</ul></li>

				</c:if>














			

				

			
			

				


				


			</ul>
		</nav>
	</div>
</aside>
<!-- ===== Left-Sidebar-End ===== -->
