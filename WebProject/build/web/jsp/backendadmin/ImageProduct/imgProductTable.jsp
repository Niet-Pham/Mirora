<%-- 
    Document   : index
    Created on : Jan 5, 2019, 3:58:48 PM
    Author     : Đức Huy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title>Tables - Ace Admin</title>

        <meta name="description" content="Static &amp; Dynamic Tables" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="/WebProject/jsp/backendadmin/assets/css/bootstrap.min.css" />
        <link rel="stylesheet" href="/WebProject/jsp/backendadmin/assets/font-awesome/4.2.0/css/font-awesome.min.css" />

        <!-- page specific plugin styles -->

        <!-- text fonts -->
        <link rel="stylesheet" href="/WebProject/jsp/backendadmin/assets/fonts/fonts.googleapis.com.css" />

        <!-- ace styles -->
        <link rel="stylesheet" href="/WebProject/jsp/backendadmin/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />

        <!--[if lte IE 9]>
                <link rel="stylesheet" href="/WebProject/jsp/backendadmin/assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
        <![endif]-->

        <!--[if lte IE 9]>
          <link rel="stylesheet" href="/WebProject/jsp/backendadmin/assets/css/ace-ie.min.css" />
        <![endif]-->

        <!-- inline styles related to this page -->

        <!-- ace settings handler -->
        <script src="/WebProject/jsp/backendadmin/assets/js/ace-extra.min.js"></script>

        <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

        <!--[if lte IE 8]>
        <script src="/WebProject/jsp/backendadmin/assets/js/html5shiv.min.js"></script>
        <script src="/WebProject/jsp/backendadmin/assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="no-skin">
        <jsp:include page="../dungchung/header.jsp"></jsp:include>
            <div class="main-container" id="main-container">
                <script type="text/javascript">
                    try {
                        ace.settings.check('main-container', 'fixed')
                    } catch (e) {
                    }
                </script>
            <jsp:include page="../dungchung/menu.jsp"></jsp:include>
                <div class="main-content">
                    <div class="main-content-inner">
                        <div class="breadcrumbs" id="breadcrumbs">
                            <script type="text/javascript">
                                try {
                                    ace.settings.check('breadcrumbs', 'fixed')
                                } catch (e) {
                                }
                            </script>

                            <ul class="breadcrumb">
                                <li>
                                    <i class="ace-icon fa fa-home home-icon"></i>
                                    <a href="#">Trang chủ</a>
                                </li>

                                <li>
                                    <a href="#">Quản lý ảnh sản phẩm</a>
                                </li>
                                <li class="active">Danh sách</li>
                            </ul><!-- /.breadcrumb -->

                            <div class="nav-search" id="nav-search">
                                <form class="form-search">
                                    <span class="input-icon">
                                        <input type="text" placeholder="Search /WebProject/jsp/backendadmin." class="nav-search-input" id="nav-search-input" autocomplete="off" />
                                        <i class="ace-icon fa fa-search nav-search-icon"></i>
                                    </span>
                                </form>
                            </div><!-- /.nav-search -->
                        </div>

                        <div class="page-content">
                            <div class="ace-settings-container" id="ace-settings-container">
                                <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
                                    <i class="ace-icon fa fa-cog bigger-130"></i>
                                </div>

                                <div class="ace-settings-box clearfix" id="ace-settings-box">
                                    <div class="pull-left width-50">
                                        <div class="ace-settings-item">
                                            <div class="pull-left">
                                                <select id="skin-colorpicker" class="hide">
                                                    <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                                                    <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                                                    <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                                                    <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                                                </select>
                                            </div>
                                            <span>&nbsp; Choose Skin</span>
                                        </div>

                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
                                            <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
                                        </div>

                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
                                            <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
                                        </div>

                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
                                            <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
                                        </div>

                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
                                            <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
                                        </div>

                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
                                            <label class="lbl" for="ace-settings-add-container">
                                                Inside
                                                <b>.container</b>
                                            </label>
                                        </div>
                                    </div><!-- /.pull-left -->

                                    <div class="pull-left width-50">
                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" />
                                            <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
                                        </div>

                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" />
                                            <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
                                        </div>

                                        <div class="ace-settings-item">
                                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" />
                                            <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
                                        </div>
                                    </div><!-- /.pull-left -->
                                </div><!-- /.ace-settings-box -->
                            </div><!-- /.ace-settings-container -->

                 

                            <div class="row">
                                <div class="col-xs-12">
                                    <!-- PAGE CONTENT BEGINS -->

                                    <div class="row">
                                        <div class="col-xs-12">
                                     

                                            <!-- div.table-responsive -->

                                            <!-- div.dataTables_borderWrap -->
                                            <div>
                                                <table id="dynamic-table" class="table table-striped table-bordered table-hover">
                                                    <thead>
                                                        <tr>
                                                            <th class="center">
                                                                <label class="pos-rel">
                                                                    <input type="checkbox" class="ace" />
                                                                    <span class="lbl"></span>
                                                                </label>
                                                            </th>
                                                            <th>ID</th>
                                                            <th>Mã sản phẩm</th>
                                                            

                                                           
                                                            <th class="hidden-480">Trạng thái</th>
                                                            <th class="hidden-480">URL</th>
                                                            <th></th>
                                                        </tr>
                                                    </thead>

                                                    <tbody>
                   
                                                    <c:forEach items="${listImg}" var="img">
                                                        <tr>
                                                            <td class="center">
                                                                <label class="pos-rel">
                                                                    <input type="checkbox" class="ace" />
                                                                    <span class="lbl"></span>
                                                                </label>
                                                            </td>

                                                            <td>
                                                                <a href="#">${img.imageId}</a>
                                                            </td>
                                                            <td>${img.productId}</td>
                                                            
                                                            
                                                            <td><c:if test="${img.isActive==true}">Kích hoạt</c:if>
                                                                <c:if test="${img.isActive==false}">Không kích hoạt</c:if>
                                                            </td>
                                                              <td>${img.url}</td>

                                                            <td>
                                                                <div class="hidden-sm hidden-xs action-buttons">
                                                                

                                                                    <a class="green" href="<%=request.getContextPath()%>/initUpdateImgAdmin.htm?imgId=${img.imageId}">
                                                                        <i class="ace-icon fa fa-pencil bigger-130"></i>
                                                                    </a>
                                                                    <c:if test="${img.isActive==false}">
                                                                    <a class="red" href="<%=request.getContextPath()%>/removeImgAdmin.htm?imgId=${img.imageId}">
                                                                        <i class="ace-icon fa fa-trash-o bigger-130"></i>
                                                                    </a></c:if>
                                                                </div>

                                                                <div class="hidden-md hidden-lg">
                                                                    <div class="inline pos-rel">
                                                                        <button class="btn btn-minier btn-yellow dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                                            <i class="ace-icon fa fa-caret-down icon-only bigger-120"></i>
                                                                        </button>

                                                                        <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                                            <li>
                                                                                <a href="<%=request.getContextPath()%>/deletePrdCategory.htm?prdCategoryId=${catalog.prdCategoryID}" class="tooltip-info" data-rel="tooltip" title="View">
                                                                                    <span class="blue">
                                                                                        <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                                                                    </span>
                                                                                </a>
                                                                            </li>

                                                                            <li>
                                                                                <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
                                                                                    <span class="green">
                                                                                        <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                                                    </span>
                                                                                </a>
                                                                            </li>

                                                                            <li>
                                                                                
                                                                                <a href="<%=request.getContextPath()%>/deletePrdCategory.htm?prdCategoryId=${catalog.prdCategoryID}" class="tooltip-error" data-rel="tooltip" title="Delete">
                                                                                    <span class="red">
                                                                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                                                    </span>
                                                                                </a>
                                                                            
                                                                            </li>
                                                                        </ul>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                        </tr>
                                                        </c:forEach>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>

                                </div><!-- /.col -->
                            </div><!-- /.row -->
                        </div><!-- /.page-content -->
                    </div>
                </div><!-- /.main-content -->
            <jsp:include page="../dungchung/footer.jsp"></jsp:include>

            <!--[if !IE]> -->
            <script src="/WebProject/jsp/backendadmin/assets/js/jquery.2.1.1.min.js"></script>

            <!-- <![endif]-->

            <!--[if IE]>
<script src="/WebProject/jsp/backendadmin/assets/js/jquery.1.11.1.min.js"></script>
<![endif]-->

            <!--[if !IE]> -->
            <script type="text/javascript">
                                                window.jQuery || document.write("<script src='/WebProject/jsp/backendadmin/assets/js/jquery.min.js'>" + "<" + "/script>");
            </script>

            <!-- <![endif]-->

            <!--[if IE]>
<script type="text/javascript">
window.jQuery || document.write("<script src='/WebProject/jsp/backendadmin/assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
            <script type="text/javascript">
                if ('ontouchstart' in document.documentElement)
                    document.write("<script src='/WebProject/jsp/backendadmin/assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
            </script>
            <script src="/WebProject/jsp/backendadmin/assets/js/bootstrap.min.js"></script>

            <!-- page specific plugin scripts -->
            <script src="/WebProject/jsp/backendadmin/assets/js/jquery.dataTables.min.js"></script>
            <script src="/WebProject/jsp/backendadmin/assets/js/jquery.dataTables.bootstrap.min.js"></script>
            <script src="/WebProject/jsp/backendadmin/assets/js/dataTables.tableTools.min.js"></script>
            <script src="/WebProject/jsp/backendadmin/assets/js/dataTables.colVis.min.js"></script>

            <!-- ace scripts -->
            <script src="/WebProject/jsp/backendadmin/assets/js/ace-elements.min.js"></script>
            <script src="/WebProject/jsp/backendadmin/assets/js/ace.min.js"></script>

            <!-- inline scripts related to this page -->
            <script type="text/javascript">
                jQuery(function ($) {
                    //initiate dataTables plugin
                    var oTable1 =
                            $('#dynamic-table')
                            //.wrap("<div class='dataTables_borderWrap' />")   //if you are applying horizontal scrolling (sScrollX)
                            .dataTable({
                                bAutoWidth: false,
                                "aoColumns": [
                                    {"bSortable": false},
                                    null, null, null, null, null,
                                    {"bSortable": false}
                                ],
                                "aaSorting": [],
                                //,
                                //"sScrollY": "200px",
                                //"bPaginate": false,

                                //"sScrollX": "100%",
                                //"sScrollXInner": "120%",
                                //"bScrollCollapse": true,
                                //Note: if you are applying horizontal scrolling (sScrollX) on a ".table-bordered"
                                //you may want to wrap the table inside a "div.dataTables_borderWrap" element

                                //"iDisplayLength": 50
                            });
                    //oTable1.fnAdjustColumnSizing();


                    //TableTools settings
                    TableTools.classes.container = "btn-group btn-overlap";
                    TableTools.classes.print = {
                        "body": "DTTT_Print",
                        "info": "tableTools-alert gritter-item-wrapper gritter-info gritter-center white",
                        "message": "tableTools-print-navbar"
                    }

                    //initiate TableTools extension
                    var tableTools_obj = new $.fn.dataTable.TableTools(oTable1, {
                        "sSwfPath": "/WebProject/jsp/backendadmin/assets/swf/copy_csv_xls_pdf.swf",
                        "sRowSelector": "td:not(:last-child)",
                        "sRowSelect": "multi",
                        "fnRowSelected": function (row) {
                            //check checkbox when row is selected
                            try {
                                $(row).find('input[type=checkbox]').get(0).checked = true
                            }
                            catch (e) {
                            }
                        },
                        "fnRowDeselected": function (row) {
                            //uncheck checkbox
                            try {
                                $(row).find('input[type=checkbox]').get(0).checked = false
                            }
                            catch (e) {
                            }
                        },
                        "sSelectedClass": "success",
                        "aButtons": [
                            {
                                "sExtends": "copy",
                                "sToolTip": "Copy to clipboard",
                                "sButtonClass": "btn btn-white btn-primary btn-bold",
                                "sButtonText": "<i class='fa fa-copy bigger-110 pink'></i>",
                                "fnComplete": function () {
                                    this.fnInfo('<h3 class="no-margin-top smaller">Table copied</h3>\
                                                                    <p>Copied ' + (oTable1.fnSettings().fnRecordsTotal()) + ' row(s) to the clipboard.</p>',
                                            1500
                                            );
                                }
                            },
                            {
                                "sExtends": "csv",
                                "sToolTip": "Export to CSV",
                                "sButtonClass": "btn btn-white btn-primary  btn-bold",
                                "sButtonText": "<i class='fa fa-file-excel-o bigger-110 green'></i>"
                            },
                            {
                                "sExtends": "pdf",
                                "sToolTip": "Export to PDF",
                                "sButtonClass": "btn btn-white btn-primary  btn-bold",
                                "sButtonText": "<i class='fa fa-file-pdf-o bigger-110 red'></i>"
                            },
                            {
                                "sExtends": "print",
                                "sToolTip": "Print view",
                                "sButtonClass": "btn btn-white btn-primary  btn-bold",
                                "sButtonText": "<i class='fa fa-print bigger-110 grey'></i>",
                                "sMessage": "<div class='navbar navbar-default'><div class='navbar-header pull-left'><a class='navbar-brand' href='#'><small>Optional Navbar &amp; Text</small></a></div></div>",
                                "sInfo": "<h3 class='no-margin-top'>Print view</h3>\
                                                                      <p>Please use your browser's print function to\
                                                                      print this table.\
                                                                      <br />Press <b>escape</b> when finished.</p>",
                            }
                        ]
                    });
                    //we put a container before our table and append TableTools element to it
                    $(tableTools_obj.fnContainer()).appendTo($('.tableTools-container'));

                    //also add tooltips to table tools buttons
                    //addding tooltips directly to "A" buttons results in buttons disappearing (weired! don't know why!)
                    //so we add tooltips to the "DIV" child after it becomes inserted
                    //flash objects inside table tools buttons are inserted with some delay (100ms) (for some reason)
                    setTimeout(function () {
                        $(tableTools_obj.fnContainer()).find('a.DTTT_button').each(function () {
                            var div = $(this).find('> div');
                            if (div.length > 0)
                                div.tooltip({container: 'body'});
                            else
                                $(this).tooltip({container: 'body'});
                        });
                    }, 200);



                    //ColVis extension
                    var colvis = new $.fn.dataTable.ColVis(oTable1, {
                        "buttonText": "<i class='fa fa-search'></i>",
                        "aiExclude": [0, 6],
                        "bShowAll": true,
                        //"bRestore": true,
                        "sAlign": "right",
                        "fnLabel": function (i, title, th) {
                            return $(th).text();//remove icons, etc
                        }

                    });

                    //style it
                    $(colvis.button()).addClass('btn-group').find('button').addClass('btn btn-white btn-info btn-bold')

                    //and append it to our table tools btn-group, also add tooltip
                    $(colvis.button())
                            .prependTo('.tableTools-container .btn-group')
                            .attr('title', 'Show/hide columns').tooltip({container: 'body'});

                    //and make the list, buttons and checkboxed Ace-like
                    $(colvis.dom.collection)
                            .addClass('dropdown-menu dropdown-light dropdown-caret dropdown-caret-right')
                            .find('li').wrapInner('<a href="javascript:void(0)" />') //'A' tag is required for better styling
                            .find('input[type=checkbox]').addClass('ace').next().addClass('lbl padding-8');



                    /////////////////////////////////
                    //table checkboxes
                    $('th input[type=checkbox], td input[type=checkbox]').prop('checked', false);

                    //select/deselect all rows according to table header checkbox
                    $('#dynamic-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function () {
                        var th_checked = this.checked;//checkbox inside "TH" table header

                        $(this).closest('table').find('tbody > tr').each(function () {
                            var row = this;
                            if (th_checked)
                                tableTools_obj.fnSelect(row);
                            else
                                tableTools_obj.fnDeselect(row);
                        });
                    });

                    //select/deselect a row when the checkbox is checked/unchecked
                    $('#dynamic-table').on('click', 'td input[type=checkbox]', function () {
                        var row = $(this).closest('tr').get(0);
                        if (!this.checked)
                            tableTools_obj.fnSelect(row);
                        else
                            tableTools_obj.fnDeselect($(this).closest('tr').get(0));
                    });




                    $(document).on('click', '#dynamic-table .dropdown-toggle', function (e) {
                        e.stopImmediatePropagation();
                        e.stopPropagation();
                        e.preventDefault();
                    });


                    //And for the first simple table, which doesn't have TableTools or dataTables
                    //select/deselect all rows according to table header checkbox
                    var active_class = 'active';
                    $('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function () {
                        var th_checked = this.checked;//checkbox inside "TH" table header

                        $(this).closest('table').find('tbody > tr').each(function () {
                            var row = this;
                            if (th_checked)
                                $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
                            else
                                $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
                        });
                    });

                    //select/deselect a row when the checkbox is checked/unchecked
                    $('#simple-table').on('click', 'td input[type=checkbox]', function () {
                        var $row = $(this).closest('tr');
                        if (this.checked)
                            $row.addClass(active_class);
                        else
                            $row.removeClass(active_class);
                    });



                    /********************************/
                    //add tooltip for small view action buttons in dropdown menu
                    $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});

                    //tooltip placement on right or left
                    function tooltip_placement(context, source) {
                        var $source = $(source);
                        var $parent = $source.closest('table')
                        var off1 = $parent.offset();
                        var w1 = $parent.width();

                        var off2 = $source.offset();
                        //var w2 = $source.width();

                        if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2))
                            return 'right';
                        return 'left';
                    }

                })
            </script>
    </body>
</html>
