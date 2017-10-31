<%@page import="com.xsis.training125.model.SesiKelas"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Xsis Course</title>

<!-- Bootstrap Core CSS -->
<link href="/assets/app_course/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="/assets/app_course/vendor/metisMenu/metisMenu.min.css"
	rel="stylesheet">

<!-- DataTables CSS -->
<link
	href="/assets/app_course/vendor/datatables-plugins/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link
	href="/assets/app_course/vendor/datatables-responsive/dataTables.responsive.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="/assets/app_course/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="/assets/app_course/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Xsis Course</a>
		</div>
		<!-- /.navbar-header -->

		<ul class="nav navbar-top-links navbar-right">

			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="#"><i class="fa fa-user fa-fw"></i> User
							Profile</a></li>
					<li class="divider"></li>
					<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
							Logout</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
		</ul>
		<!-- /.navbar-top-links -->

		<div class="navbar-default sidebar" role="navigation">
			<div class="sidebar-nav navbar-collapse">
				<ul class="nav" id="side-menu">
					<li class="sidebar-search">
						<div class="input-group custom-search-form">
							<input type="text" class="form-control" placeholder="Search...">
							<span class="input-group-btn">
								<button class="btn btn-default" type="button">
									<i class="fa fa-search"></i>
								</button>
							</span>
						</div> <!-- /input-group -->
					</li>
					<li><a href="/assets/app_course/index.html"> Feedback</a></li>
					<li><a href="index.html"> Jadwal</a></li>
					<li><a href="index.html"> Paket Kursus</a></li>
					<li><a href="index.html"> Pembayaran</a></li>
					<li><a href="index.html"> Pengajar</a></li>
					<li><a href="index.html"> Peserta</a></li>
					<li><a href="index.html"> Ruang</a></li>
					<li><a href="index.html"> Ujian</a></li>
					<li><a href="index.html"> User</a></li>
				</ul>
			</div>
			<!-- /.sidebar-collapse -->
		</div>
		<!-- /.navbar-static-side --> </nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-2">
								<i class="fa fa-group fa-5x"></i>
							</div>
							<div class="col-xs-5">
								<h1>Sesi Kelas</h1>
							</div>
							<div class="col-xs-5 text-right">
								<button type="button"
									class="btn btn-default btn-circle btn-lg btnNambahData">
									<i class="fa fa-plus"></i>
								</button>
							</div>
						</div>
					</div>
					<!-- /.heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataKelas">
							<thead>
								<tr>
									<th>id</th>
									<th>Nama</th>
									<th>Tanggal Mulai</th>
									<th>Tanggal Selesai</th>
									<th>Aksi</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="sesiKelas" items="${sesiKelas }">

									<tr>
										<td>${sesiKelas.idSesiKelas }</td>
										<td>${sesiKelas.namaKelas }</td>
										<td>${sesiKelas.tanggalMulai }</td>
										<td>${sesiKelas.tanggalSelesai }</td>
										<td>
											<button type="button"
												class="btn btn-danger btn-circle btn-xs">
												<i class="fa fa-trash"></i>
											</button>
											<button type="button"
												class="btn btn-success btn-circle btn-xs UpdateBtn">
												<i class="fa fa-edit"></i>
											</button>

										</td>
									</tr>

								</c:forEach>
							</tbody>
						</table>
						<!-- /.table-responsive -->
					</div>

				</div>
			</div>
			<!-- /.row -->
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<script type="text/javascript" src="/assets/js/jquery-3.2.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
		integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
		crossorigin="anonymous"></script>
	<script type="text/javascript"
		src="/assets/bootstrap-4.0.0-beta.2/dist/js/bootstrap.min.js"></script>

<!-- membuat modal untuk save -->
	<script type="text/javascript">
		$(document).ready(function() {
			var id = 0;
			$('.btnNambahData').on('click', function() {
				$('#ModalTambah').modal();

				$('#submitSimpan').click(function() {

					//Object ala js
					var SesiKelas = {
						namaKelas : $('#textNamaKelas').val(),
						tanggalMulai : $('#textTanggalMulai').val(),
						tanggalSelesai : $('#textTanggalSelesai').val(),
					};
					//ajax simpan
					$.ajax({
						type : 'POST',
						url : 'sesi/simpan',
						contentType : "application/json",
						data : JSON.stringify(SesiKelas),
						success : function(data) {
							window.location = "/sesi";
						}
					});
				});

			});
 
			$('.UpdateBtn').on('click', function() {
				//ambil data dari server => ajax
 				id = $(this).attr('idSesiKelas');
 				
 				$.ajax({
 					type: 'POST',
 					url : 'sesi/seuid/'+id,
 					success : function(data){
 						//console.log(JSON.stringify(data));
 						_setFieldUpdateModal(data);
 					},
 					dataType: 'json'
 				});
 				
				$('#ModalTambah').modal();
				
				function _setFieldUpdateModal(data){
	 				$('#textName').val(data.namaKelas);
					$('#textAddress').val(data.tangalMulai);
					$('#textEmail').val(data.tanggalSelesai);
	 			}
			});

		});
	</script>
<!-- #membuat modal untuk save -->


	<!--modal save-->
	<div class="modal fade" id="ModalTambah" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-1">
								<i class="fa fa-caret-down fa-4x"></i>
							</div>
							<div class="col-xs-5">
								<h3>Masukan Data Kelas</h3>
							</div>
							<div class="col-xs-6 text-right">
								<button type="button" class="btn btn-default btn-circle btn-lg"
									data-dismiss="modal">
									<i class="fa fa-times"></i>
								</button>
							</div>
						</div>
					</div>
					<div class="panel-body">
						<form>
							<div class="form-group">
								<label for="textName">Nama Kelas</label> <input type="text"
									class="form-control" id="textNamaKelas" name="namaKelas"
									placeholder="Masukan Nama Kelas"> <small id="nameHelp"
									class="form-text text-muted">Silahkan anda mengisi nama
									dengan benar</small>
							</div>
							<div class="form-group">
								<label for="textAddress">Tanggal Mulai</label> <input
									type="text" class="form-control" id="textTanggalMulai"
									name="tanggalMulai" placeholder="2017 - 10 - 03">
								<small id="emailHelp" class="form-text text-muted">Silahkan
									anda mengisi Email dengan benar</small>
							</div>
							<div class="form-group">
								<label for="textAddress">Tanggal Selesai</label> <input
									type="text" class="form-control" id="textTanggalSelesai"
									name="tanggalSelesai" placeholder="2017 - 12 - 11">
								<small id="emailHelp" class="form-text text-muted">Silahkan
									anda mengisi Email dengan benar</small>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-success" id="submitSimpan">Update</button>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!--selesai Modal-->
	<!--#modal save-->






	<!-- jQuery -->
	<script src="./assets/app_course/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="./assets/app_course/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="./assets/app_course/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script
		src="./assets/app_course/vendor/datatables/js/jquery.dataTables.min.js"></script>
	<script
		src="./assets/app_course/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
	<script
		src="./assets/app_course/vendor/datatables-responsive/dataTables.responsive.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="./assets/app_course/dist/js/sb-admin-2.js"></script>

	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
		$(document).ready(function() {
			$('#dataKelas').DataTable({
				responsive : true
			});
		});
	</script>

</body>

</html>