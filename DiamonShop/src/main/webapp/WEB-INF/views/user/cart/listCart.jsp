<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>List Cart</title>
</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>
					Check Out <small class="pull-right"> ${totalQty } Items are in the
						cart </small>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Product</th>
							<th>Description</th>
							<th>Ref.</th>
							<th>Color</th>
							<th>Qty</th>
							<th>Avail.</th>
							<th>Unit price</th>
							<th>Edit</th>
							<th>Delete</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						
						<c:forEach var="item" items="${ ShoppingCart }">
							<tr>
								<td><img width="100" src="<c:url value="/assets/user/img/${item.value.product.img }"/>" alt=""></td>
								<td>
									${item.value.product.details }
								</td>
								<td>-</td>
								<td>
									<span class="shopBtn" style="background-color:${item.value.product.id_color}"></span>
								</td>
								<td>
									<input type="number" min="1" max="100" class="span1" style="max-width:32px" placeholder="1" id="qty-cart-${item.key }" size="16" type="text" value="${item.value.qty}">
								</td>
								<td><span class="shopBtn"><span class="icon-ok"></span></span>
								</td>
								<td>
									<fmt:formatNumber type="number" groupingUsed="true" value="${item.value.product.price }" /> ₫
								</td>
								<td> 
									<button onclick="editQty(this);" data-id="${item.key }" class="btn btn-mini btn-danger">
										<span class="icon-edit"></span>
									</button>
								</td>
								<td> 
									<a href="<c:url value="/deleteCart/${item.key }"/>" class="btn btn-mini btn-danger">
										<span class="icon-remove"></span>
									</a>
								</td>
								<td>
									<fmt:formatNumber type="number" groupingUsed="true" value="${item.value.totalPrice }" /> ₫
								</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
				<br />
				<a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="<c:url value="/checkout"/>" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
	
	
	<script>
		function editQty(button){
			var id = $(button).data("id");
			var qty = $("#qty-cart-"+id).val();
			window.location = "editCart/"+id+"/"+qty;
		}
	</script>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
