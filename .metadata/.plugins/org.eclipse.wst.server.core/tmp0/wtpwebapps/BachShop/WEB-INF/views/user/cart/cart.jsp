<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Gio hang</title>

<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>
					Check Out <small class="pull-right"> 2 Items are in the
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
							<th>Avail.</th>
							<th>Unit price</th>
							<th>Qty</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><img width="100" src="assets/img/e.jpg" alt=""></td>
							<td>Items name here<br>Carate : 22<br>Model : n/a
							</td>
							<td>-</td>

							<td><span class="shopBtn"><span class="icon-ok"></span></span>
							</td>
							<td>$50.00</td>
							<td><input class="span1" style="max-width: 34px"
								placeholder="1" id="appendedInputButtons" size="16" type="text"
								value="2">
								<div class="input-append">
									<button class="btn btn-mini" type="button">-</button>
									<button class="btn btn-mini" type="button">+</button>
									<button class="btn btn-mini btn-danger" type="button">
										<span class="icon-remove"></span>
									</button>
								</div></td>
							<td>$100.00</td>
						</tr>
						<tr>
							<td><img width="100" src="assets/img/f.jpg" alt=""></td>
							<td>Item names and brief details<br>Carate:24 <br>Model:HBK24
							</td>
							<td>-</td>
							<td><span class="shopBtn"><span class="icon-ok"></span></span>
							</td>
							<td>$348.42</td>
							<td><input class="span1" style="max-width: 34px"
								placeholder="1" size="16" type="text">
								<div class="input-append">
									<button class="btn btn-mini" type="button">-</button>
									<button class="btn btn-mini" type="button">+</button>
									<button class="btn btn-mini btn-danger" type="button">
										<span class="icon-remove"></span>
									</button>
								</div></td>
							<td>$348.42</td>
						</tr>
						<tr>
							<td colspan="6" class="alignR">Total products:</td>
							<td>$448.42</td>
						</tr>
						<tr>
							<td colspan="6" class="alignR">Total products:</td>
							<td>$448.42</td>
						</tr>
						<tr>
							<td colspan="6" class="alignR">Total products:</td>
							<td>$448.42</td>
						</tr>
						<tr>
							<td colspan="6" class="alignR">Total products:</td>
							<td class="label label-primary">$448.42</td>
						</tr>
					</tbody>
				</table>
				<br />


				<table class="table table-bordered">
					<tbody>
						<tr>
							<td>
								<form class="form-inline">
									<label style="min-width: 159px"> VOUCHERS Code: </label> <input
										type="text" class="input-medium" placeholder="CODE">
									<button type="submit" class="shopBtn">ADD</button>
								</form>
							</td>
						</tr>

					</tbody>
				</table>
				<table class="table table-bordered">
					<tbody>
						<tr>
							<td>ESTIMATE YOUR SHIPPING & TAXES</td>
						</tr>
						<tr>
							<td>
								<form class="form-horizontal">
									<div class="control-group">
										<label class="span2 control-label" for="inputEmail">Country</label>
										<div class="controls">
											<input type="text" placeholder="Country">
										</div>
									</div>
									<div class="control-group">
										<label class="span2 control-label" for="inputPassword">Post
											Code/ Zipcode</label>
										<div class="controls">
											<input type="password" placeholder="Password">
										</div>
									</div>
									<div class="control-group">
										<div class="controls">
											<button type="submit" class="shopBtn">Click to check
												the price</button>
										</div>
									</div>
								</form>
							</td>
						</tr>
					</tbody>
				</table>
				<a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
</body>