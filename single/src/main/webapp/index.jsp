<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="framework/bootstrap/css/bootstrap.min.css" />
    </head>
    <body>
    	
    				<nav class="navbar navbar-default">
    					<div class="container-fluid">
    						<div class="navbar-header"><a href="#" class="navbar-brand">按用户名搜索</a></div>
    						<div>
    							<form action="init.do" method="post" class="navbar-form navbar-left">
    								<div class="form-group"><input type="text" name="conds" placeholder="请输入姓名" class="form-control" /></div>
    								<input type="hidden" name="currentPage" value="1" />
    								<button type="submit" class="btn btn-default">搜索</button>
    							</form>
    						</div>
    						<ul class="nav navbar-nva navbar-right">
    							<li><a href="#regModal" data-toggle="modal"><span class="glyphicon glyphicon-user"></span>注册新用户</a></li>
    						</ul>
    					</div>
    				</nav>
    				
    	<div class="container">
    		<div class="row">
    			<div class="col-xs-offset-1 col-xs-10">
    				<table class="table-striped table-hover table-condensed table-bordered text-center">
    					<tr>
    						<th class="text-center">用户编号</th>
    						<th class="text-center">用户头像</th>
    						<th class="text-center">用户姓名</th>
    						<th class="text-center">用户生日</th>
    						<th class="text-center">存款总额</th>
    						<th class="text-center">删除用户</th>
    					</tr>
    					<tr>
    						<td>1</td>
    						<td>2</td>
    						<td>3</td>
    						<td>4</td>
    						<td>5</td>
    						<td><button class="btn btn-xs btn-danger" href="del.do">删除用户</button></td>
    					</tr>
    				</table>
    			</div>
    		</div>
    		<div class="row">
    			<div class="col-xs-offset-4 col-xs-4">
    				<ul class="pagination">
    					<li><a href="#" lang="1">首页</a></li>
    					<li><a href="#" lang="${pb.prev}">上一页</a></li>
    					<li><a href="#" lang="${pb.next}">下一页</a></li>
    					<li><a href="#" lang="${pb.countPage}">尾页</a></li>
    				</ul>
    			</div>
    		</div>
    		
    		
    		
    	</div>
    	
    	<div class="modal fade" aria-hidden="true" id="regModal">
    		<div class="modal-dialog">
    			<div class="modal-content">
    				<div class="modal-header">
    					<button type="button" data-dismiss="modal" aria-hidden="true" class="close">&times;</button>
    					<h4 class="modal-title">新用户注册</h4>
    				</div>
    				<div class="modal-body">
    					<form action="" role="form" enctype="multipart/form-data" class="form-horizontal">
    						<div class="form-group">
    							<label for="" class="control-label clo-xs-3">用户姓名</label>
    							<div class="col-xs-9"><input type="text" name="username" placeholder="请输入信息" class="form-control" /></div>
    						</div>
    						<div class="form-group">
    							<label for="" class="control-label clo-xs-3">用户生日</label>
    							<div class="col-xs-9"><input type="date" name="birthday" placeholder="请输入信息" class="form-control" /></div>
    						</div>
    						<div class="form-group">
    							<label for="" class="control-label clo-xs-3">存入金额</label>
    							<div class="col-xs-9"><input type="number" min="1" name="balance" placeholder="请输入信息" class="form-control" /></div>
    						</div>
    						<div class="form-group">
    							<label for="" class="control-label clo-xs-3">用户头像</label>
    							<div class="col-xs-9"><input type="file" name="file" placeholder="请输入信息" class="form-control" /></div>
    						</div>
    					</form>
    				</div>
    				<div class="modal-footer"><button type="button" id="btnSub" class="btn btn-primary">提交用户数据</button></div>
    			</div>
    		</div>
    	</div>
    	
    	
    	<script type="text/javascript" src="framework/jquery/jquery-3.2.1.min.js" ></script>
    	<script type="text/javascript" src="framework/bootstrap/js/bootstrap.min.js" ></script>
    	<script type="text/javascript" src="js/index.js" ></script>
 	</body>
</html>