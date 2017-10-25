package com.example.administrator.yintaidemo.entity;

import java.util.List;

/**
 * Created by Mr Chen on 2017/10/25.
 */

public class GeneraProductBean {

    /**
     * isSuccessful : true
     * statusCode : 200
     * description :
     * userId :
     * data : {"announcement":null,"product_list":[{"brandid":4709,"longname":"【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T1","finalprice":1650,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO<\/h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><tr><td><span>肩宽：<\/span><b>35CM<\/b><\/td><td><span>裙长：<\/span><b>91cm<\/b><\/td><\/tr><tr><td><span>上市时间：<\/span><b>2017-Q3<\/b><\/td><td><span>胸围：<\/span><b>90CM<\/b><\/td><\/tr><tr><td><span>袖长：<\/span><b>60CM<\/b><\/td><td><span>裙长范围：<\/span><b>中裙<\/b><\/td><\/tr><tr><td><span>尺码：<\/span><b>M<\/b><\/td><td><span>色系：<\/span><b>黑色<\/b><\/td><\/tr><tr><td><span>尺码类型：<\/span><b>法国码<\/b><\/td><td><span>领型：<\/span><b>高领<\/b><\/td><\/tr><tr><td><span>袖型：<\/span><b>常规袖<\/b><\/td><td><span>袖长范围：<\/span><b>长袖<\/b><\/td><\/tr><tr><td><span>风格：<\/span><b>欧美<\/b><\/td><td><span>商品细节说明：<\/span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维<\/b><\/td><\/tr><tr><td><span>图案：<\/span><b>纯色<\/b><\/td><td><span>厚度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>销售季节：<\/span><b>春秋<\/b><\/td><td><span>品牌所属国：<\/span><b>法国<\/b><\/td><\/tr><tr><td><span>产地：<\/span><b>中国<\/b><\/td><td><span>是否名品：<\/span><b>是<\/b><\/td><\/tr><tr><td><span>品类：<\/span><b>奢品<\/b><\/td><td><span>面料柔软度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>商品规格：<\/span><b>条<\/b><\/td><td><span><\/span><b><\/b><\/td><\/tr><\/table><div class='pro-info-title'><h4>尺寸说明<\/h4><a href='#' onclick=\"window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')\"  target='_blank'><span><\/span>查看大图片<\/a><\/div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /><\/div><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/4709/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-467-4411","name":"【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙","price":2200,"yt_price":1650,"score":0,"producttype":"5","instock":true,"promotions":[],"brand":"SUNCOO","small_img_urls":["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"1"}],"property_detail":{"properties":[{"icon":"","name":"肩宽","value":"35CM"},{"icon":"","name":"裙长","value":"91cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"90CM"},{"icon":"","name":"袖长","value":"60CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"M"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4411","isfavorite":false,"remain":-2147483648,"endtime":null,"leftcount":7,"leftsecond":"-63644537567.4001","isshowfitting":0,"discount":7.5,"imageitemcode":"21-467-4412","notice":null},{"brandid":4709,"longname":"【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T0","finalprice":1650,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO<\/h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><tr><td><span>肩宽：<\/span><b>34CM<\/b><\/td><td><span>裙长：<\/span><b>90cm<\/b><\/td><\/tr><tr><td><span>上市时间：<\/span><b>2017-Q3<\/b><\/td><td><span>胸围：<\/span><b>86CM<\/b><\/td><\/tr><tr><td><span>袖长：<\/span><b>59CM<\/b><\/td><td><span>裙长范围：<\/span><b>中裙<\/b><\/td><\/tr><tr><td><span>尺码：<\/span><b>S<\/b><\/td><td><span>色系：<\/span><b>黑色<\/b><\/td><\/tr><tr><td><span>尺码类型：<\/span><b>法国码<\/b><\/td><td><span>领型：<\/span><b>高领<\/b><\/td><\/tr><tr><td><span>袖型：<\/span><b>常规袖<\/b><\/td><td><span>袖长范围：<\/span><b>长袖<\/b><\/td><\/tr><tr><td><span>风格：<\/span><b>欧美<\/b><\/td><td><span>商品细节说明：<\/span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维<\/b><\/td><\/tr><tr><td><span>图案：<\/span><b>纯色<\/b><\/td><td><span>厚度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>销售季节：<\/span><b>春秋<\/b><\/td><td><span>品牌所属国：<\/span><b>法国<\/b><\/td><\/tr><tr><td><span>产地：<\/span><b>中国<\/b><\/td><td><span>是否名品：<\/span><b>是<\/b><\/td><\/tr><tr><td><span>品类：<\/span><b>奢品<\/b><\/td><td><span>面料柔软度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>商品规格：<\/span><b>条<\/b><\/td><td><span><\/span><b><\/b><\/td><\/tr><\/table><div class='pro-info-title'><h4>尺寸说明<\/h4><a href='#' onclick=\"window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')\"  target='_blank'><span><\/span>查看大图片<\/a><\/div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /><\/div><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/4709/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-467-4412","name":"【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙","price":2200,"yt_price":1650,"score":0,"producttype":"5","instock":true,"promotions":[],"brand":"SUNCOO","small_img_urls":["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"0"}],"property_detail":{"properties":[{"icon":"","name":"肩宽","value":"34CM"},{"icon":"","name":"裙长","value":"90cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"86CM"},{"icon":"","name":"袖长","value":"59CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"S"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4412","isfavorite":false,"remain":-2147483648,"endtime":null,"leftcount":4,"leftsecond":"-63644537567.4001","isshowfitting":0,"discount":7.5,"imageitemcode":"21-467-4412","notice":null}],"current":{"brandid":4709,"longname":"【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T2","finalprice":1650,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO<\/h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><tr><td><span>肩宽：<\/span><b>36CM<\/b><\/td><td><span>裙长：<\/span><b>92cm<\/b><\/td><\/tr><tr><td><span>上市时间：<\/span><b>2017-Q3<\/b><\/td><td><span>胸围：<\/span><b>94CM<\/b><\/td><\/tr><tr><td><span>袖长：<\/span><b>61CM<\/b><\/td><td><span>裙长范围：<\/span><b>中裙<\/b><\/td><\/tr><tr><td><span>尺码：<\/span><b>L<\/b><\/td><td><span>色系：<\/span><b>黑色<\/b><\/td><\/tr><tr><td><span>尺码类型：<\/span><b>法国码<\/b><\/td><td><span>领型：<\/span><b>高领<\/b><\/td><\/tr><tr><td><span>袖型：<\/span><b>常规袖<\/b><\/td><td><span>袖长范围：<\/span><b>长袖<\/b><\/td><\/tr><tr><td><span>风格：<\/span><b>欧美<\/b><\/td><td><span>商品细节说明：<\/span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维<\/b><\/td><\/tr><tr><td><span>图案：<\/span><b>纯色<\/b><\/td><td><span>厚度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>销售季节：<\/span><b>春秋<\/b><\/td><td><span>品牌所属国：<\/span><b>法国<\/b><\/td><\/tr><tr><td><span>产地：<\/span><b>中国<\/b><\/td><td><span>是否名品：<\/span><b>是<\/b><\/td><\/tr><tr><td><span>品类：<\/span><b>奢品<\/b><\/td><td><span>面料柔软度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>商品规格：<\/span><b>条<\/b><\/td><td><span><\/span><b><\/b><\/td><\/tr><\/table><div class='pro-info-title'><h4>尺寸说明<\/h4><a href='#' onclick=\"window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')\"  target='_blank'><span><\/span>查看大图片<\/a><\/div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /><\/div><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/4709/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-467-4410","name":"【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙","price":2200,"yt_price":1650,"score":0,"producttype":"5","instock":true,"promotions":[],"brand":"SUNCOO","small_img_urls":["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"2"}],"property_detail":{"properties":[{"icon":"","name":"肩宽","value":"36CM"},{"icon":"","name":"裙长","value":"92cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"94CM"},{"icon":"","name":"袖长","value":"61CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"L"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4410","isfavorite":false,"remain":-2147483648,"endtime":null,"leftcount":3,"leftsecond":"-63644537567.4001","isshowfitting":0,"discount":7.5,"imageitemcode":"21-467-4412","notice":null},"commendlist":[],"brandrecommand":[]}
     */

    private boolean isSuccessful;
    private int statusCode;
    private String description;
    private String userId;
    private DataBean data;

    public boolean isIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * announcement : null
         * product_list : [{"brandid":4709,"longname":"【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T1","finalprice":1650,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO<\/h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><tr><td><span>肩宽：<\/span><b>35CM<\/b><\/td><td><span>裙长：<\/span><b>91cm<\/b><\/td><\/tr><tr><td><span>上市时间：<\/span><b>2017-Q3<\/b><\/td><td><span>胸围：<\/span><b>90CM<\/b><\/td><\/tr><tr><td><span>袖长：<\/span><b>60CM<\/b><\/td><td><span>裙长范围：<\/span><b>中裙<\/b><\/td><\/tr><tr><td><span>尺码：<\/span><b>M<\/b><\/td><td><span>色系：<\/span><b>黑色<\/b><\/td><\/tr><tr><td><span>尺码类型：<\/span><b>法国码<\/b><\/td><td><span>领型：<\/span><b>高领<\/b><\/td><\/tr><tr><td><span>袖型：<\/span><b>常规袖<\/b><\/td><td><span>袖长范围：<\/span><b>长袖<\/b><\/td><\/tr><tr><td><span>风格：<\/span><b>欧美<\/b><\/td><td><span>商品细节说明：<\/span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维<\/b><\/td><\/tr><tr><td><span>图案：<\/span><b>纯色<\/b><\/td><td><span>厚度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>销售季节：<\/span><b>春秋<\/b><\/td><td><span>品牌所属国：<\/span><b>法国<\/b><\/td><\/tr><tr><td><span>产地：<\/span><b>中国<\/b><\/td><td><span>是否名品：<\/span><b>是<\/b><\/td><\/tr><tr><td><span>品类：<\/span><b>奢品<\/b><\/td><td><span>面料柔软度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>商品规格：<\/span><b>条<\/b><\/td><td><span><\/span><b><\/b><\/td><\/tr><\/table><div class='pro-info-title'><h4>尺寸说明<\/h4><a href='#' onclick=\"window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')\"  target='_blank'><span><\/span>查看大图片<\/a><\/div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /><\/div><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/4709/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-467-4411","name":"【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙","price":2200,"yt_price":1650,"score":0,"producttype":"5","instock":true,"promotions":[],"brand":"SUNCOO","small_img_urls":["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"1"}],"property_detail":{"properties":[{"icon":"","name":"肩宽","value":"35CM"},{"icon":"","name":"裙长","value":"91cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"90CM"},{"icon":"","name":"袖长","value":"60CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"M"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4411","isfavorite":false,"remain":-2147483648,"endtime":null,"leftcount":7,"leftsecond":"-63644537567.4001","isshowfitting":0,"discount":7.5,"imageitemcode":"21-467-4412","notice":null},{"brandid":4709,"longname":"【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T0","finalprice":1650,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO<\/h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><tr><td><span>肩宽：<\/span><b>34CM<\/b><\/td><td><span>裙长：<\/span><b>90cm<\/b><\/td><\/tr><tr><td><span>上市时间：<\/span><b>2017-Q3<\/b><\/td><td><span>胸围：<\/span><b>86CM<\/b><\/td><\/tr><tr><td><span>袖长：<\/span><b>59CM<\/b><\/td><td><span>裙长范围：<\/span><b>中裙<\/b><\/td><\/tr><tr><td><span>尺码：<\/span><b>S<\/b><\/td><td><span>色系：<\/span><b>黑色<\/b><\/td><\/tr><tr><td><span>尺码类型：<\/span><b>法国码<\/b><\/td><td><span>领型：<\/span><b>高领<\/b><\/td><\/tr><tr><td><span>袖型：<\/span><b>常规袖<\/b><\/td><td><span>袖长范围：<\/span><b>长袖<\/b><\/td><\/tr><tr><td><span>风格：<\/span><b>欧美<\/b><\/td><td><span>商品细节说明：<\/span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维<\/b><\/td><\/tr><tr><td><span>图案：<\/span><b>纯色<\/b><\/td><td><span>厚度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>销售季节：<\/span><b>春秋<\/b><\/td><td><span>品牌所属国：<\/span><b>法国<\/b><\/td><\/tr><tr><td><span>产地：<\/span><b>中国<\/b><\/td><td><span>是否名品：<\/span><b>是<\/b><\/td><\/tr><tr><td><span>品类：<\/span><b>奢品<\/b><\/td><td><span>面料柔软度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>商品规格：<\/span><b>条<\/b><\/td><td><span><\/span><b><\/b><\/td><\/tr><\/table><div class='pro-info-title'><h4>尺寸说明<\/h4><a href='#' onclick=\"window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')\"  target='_blank'><span><\/span>查看大图片<\/a><\/div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /><\/div><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/4709/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-467-4412","name":"【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙","price":2200,"yt_price":1650,"score":0,"producttype":"5","instock":true,"promotions":[],"brand":"SUNCOO","small_img_urls":["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"0"}],"property_detail":{"properties":[{"icon":"","name":"肩宽","value":"34CM"},{"icon":"","name":"裙长","value":"90cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"86CM"},{"icon":"","name":"袖长","value":"59CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"S"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4412","isfavorite":false,"remain":-2147483648,"endtime":null,"leftcount":4,"leftsecond":"-63644537567.4001","isshowfitting":0,"discount":7.5,"imageitemcode":"21-467-4412","notice":null}]
         * current : {"brandid":4709,"longname":"【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T2","finalprice":1650,"airrate":0,"ppatr":"0%","ppata":0,"description":"","isshowdetail":0,"productdetailhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事<\/h4><\/div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO<\/h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /><\/span><\/div><\/div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。<\/p><\/div><\/div><div class='pro-info-title'><h4>商品细节<\/h4><\/div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /><\/td><\/tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /><\/td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /><\/td><\/tr><\/table><\/div><\/body><\/html>","productparameterhtml":"<!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站<\/title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}<\/style><\/head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性<\/h4><\/div><table class='pro-info-size'><tr><td><span>肩宽：<\/span><b>36CM<\/b><\/td><td><span>裙长：<\/span><b>92cm<\/b><\/td><\/tr><tr><td><span>上市时间：<\/span><b>2017-Q3<\/b><\/td><td><span>胸围：<\/span><b>94CM<\/b><\/td><\/tr><tr><td><span>袖长：<\/span><b>61CM<\/b><\/td><td><span>裙长范围：<\/span><b>中裙<\/b><\/td><\/tr><tr><td><span>尺码：<\/span><b>L<\/b><\/td><td><span>色系：<\/span><b>黑色<\/b><\/td><\/tr><tr><td><span>尺码类型：<\/span><b>法国码<\/b><\/td><td><span>领型：<\/span><b>高领<\/b><\/td><\/tr><tr><td><span>袖型：<\/span><b>常规袖<\/b><\/td><td><span>袖长范围：<\/span><b>长袖<\/b><\/td><\/tr><tr><td><span>风格：<\/span><b>欧美<\/b><\/td><td><span>商品细节说明：<\/span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维<\/b><\/td><\/tr><tr><td><span>图案：<\/span><b>纯色<\/b><\/td><td><span>厚度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>销售季节：<\/span><b>春秋<\/b><\/td><td><span>品牌所属国：<\/span><b>法国<\/b><\/td><\/tr><tr><td><span>产地：<\/span><b>中国<\/b><\/td><td><span>是否名品：<\/span><b>是<\/b><\/td><\/tr><tr><td><span>品类：<\/span><b>奢品<\/b><\/td><td><span>面料柔软度：<\/span><b>适中<\/b><\/td><\/tr><tr><td><span>商品规格：<\/span><b>条<\/b><\/td><td><span><\/span><b><\/b><\/td><\/tr><\/table><div class='pro-info-title'><h4>尺寸说明<\/h4><a href='#' onclick=\"window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')\"  target='_blank'><span><\/span>查看大图片<\/a><\/div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /><\/div><\/body><\/html>","brandlogo":"https://p10.ytrss.com/Brand/4709/logo.jpg","seckillid":0,"ismiaowgoods":false,"isowntake":false,"miaowdescription":"","itemcode":"21-467-4410","name":"【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙","price":2200,"yt_price":1650,"score":0,"producttype":"5","instock":true,"promotions":[],"brand":"SUNCOO","small_img_urls":["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"],"large_img_urls":["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"],"sku_property":[{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"2"}],"property_detail":{"properties":[{"icon":"","name":"肩宽","value":"36CM"},{"icon":"","name":"裙长","value":"92cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"94CM"},{"icon":"","name":"袖长","value":"61CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"L"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]},"imageurllist":[],"gift":null,"weburl":"https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4410","isfavorite":false,"remain":-2147483648,"endtime":null,"leftcount":3,"leftsecond":"-63644537567.4001","isshowfitting":0,"discount":7.5,"imageitemcode":"21-467-4412","notice":null}
         * commendlist : []
         * brandrecommand : []
         */

        private Object announcement;
        private CurrentBean current;
        private List<ProductListBean> product_list;
        private List<?> commendlist;
        private List<?> brandrecommand;

        public Object getAnnouncement() {
            return announcement;
        }

        public void setAnnouncement(Object announcement) {
            this.announcement = announcement;
        }

        public CurrentBean getCurrent() {
            return current;
        }

        public void setCurrent(CurrentBean current) {
            this.current = current;
        }

        public List<ProductListBean> getProduct_list() {
            return product_list;
        }

        public void setProduct_list(List<ProductListBean> product_list) {
            this.product_list = product_list;
        }

        public List<?> getCommendlist() {
            return commendlist;
        }

        public void setCommendlist(List<?> commendlist) {
            this.commendlist = commendlist;
        }

        public List<?> getBrandrecommand() {
            return brandrecommand;
        }

        public void setBrandrecommand(List<?> brandrecommand) {
            this.brandrecommand = brandrecommand;
        }

        public static class CurrentBean {
            /**
             * brandid : 4709
             * longname : 【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T2
             * finalprice : 1650
             * airrate : 0
             * ppatr : 0%
             * ppata : 0
             * description :
             * isshowdetail : 0
             * productdetailhtml : <!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站</title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}</style></head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事</h4></div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO</h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /></span></div></div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。</p></div></div><div class='pro-info-title'><h4>商品细节</h4></div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /></td></tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /></td></tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /></td></tr></table></div></body></html>
             * productparameterhtml : <!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站</title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}</style></head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性</h4></div><table class='pro-info-size'><tr><td><span>肩宽：</span><b>36CM</b></td><td><span>裙长：</span><b>92cm</b></td></tr><tr><td><span>上市时间：</span><b>2017-Q3</b></td><td><span>胸围：</span><b>94CM</b></td></tr><tr><td><span>袖长：</span><b>61CM</b></td><td><span>裙长范围：</span><b>中裙</b></td></tr><tr><td><span>尺码：</span><b>L</b></td><td><span>色系：</span><b>黑色</b></td></tr><tr><td><span>尺码类型：</span><b>法国码</b></td><td><span>领型：</span><b>高领</b></td></tr><tr><td><span>袖型：</span><b>常规袖</b></td><td><span>袖长范围：</span><b>长袖</b></td></tr><tr><td><span>风格：</span><b>欧美</b></td><td><span>商品细节说明：</span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维</b></td></tr><tr><td><span>图案：</span><b>纯色</b></td><td><span>厚度：</span><b>适中</b></td></tr><tr><td><span>销售季节：</span><b>春秋</b></td><td><span>品牌所属国：</span><b>法国</b></td></tr><tr><td><span>产地：</span><b>中国</b></td><td><span>是否名品：</span><b>是</b></td></tr><tr><td><span>品类：</span><b>奢品</b></td><td><span>面料柔软度：</span><b>适中</b></td></tr><tr><td><span>商品规格：</span><b>条</b></td><td><span></span><b></b></td></tr></table><div class='pro-info-title'><h4>尺寸说明</h4><a href='#' onclick="window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')"  target='_blank'><span></span>查看大图片</a></div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /></div></body></html>
             * brandlogo : https://p10.ytrss.com/Brand/4709/logo.jpg
             * seckillid : 0
             * ismiaowgoods : false
             * isowntake : false
             * miaowdescription :
             * itemcode : 21-467-4410
             * name : 【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙
             * price : 2200
             * yt_price : 1650
             * score : 0
             * producttype : 5
             * instock : true
             * promotions : []
             * brand : SUNCOO
             * small_img_urls : ["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"]
             * large_img_urls : ["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"]
             * sku_property : [{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"2"}]
             * property_detail : {"properties":[{"icon":"","name":"肩宽","value":"36CM"},{"icon":"","name":"裙长","value":"92cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"94CM"},{"icon":"","name":"袖长","value":"61CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"L"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]}
             * imageurllist : []
             * gift : null
             * weburl : https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4410
             * isfavorite : false
             * remain : -2147483648
             * endtime : null
             * leftcount : 3
             * leftsecond : -63644537567.4001
             * isshowfitting : 0
             * discount : 7.5
             * imageitemcode : 21-467-4412
             * notice : null
             */

            private int brandid;
            private String longname;
            private int finalprice;
            private int airrate;
            private String ppatr;
            private int ppata;
            private String description;
            private int isshowdetail;
            private String productdetailhtml;
            private String productparameterhtml;
            private String brandlogo;
            private int seckillid;
            private boolean ismiaowgoods;
            private boolean isowntake;
            private String miaowdescription;
            private String itemcode;
            private String name;
            private int price;
            private int yt_price;
            private int score;
            private String producttype;
            private boolean instock;
            private String brand;
            private PropertyDetailBean property_detail;
            private Object gift;
            private String weburl;
            private boolean isfavorite;
            private int remain;
            private Object endtime;
            private int leftcount;
            private String leftsecond;
            private int isshowfitting;
            private double discount;
            private String imageitemcode;
            private Object notice;
            private List<?> promotions;
            private List<String> small_img_urls;
            private List<String> large_img_urls;
            private List<SkuPropertyBean> sku_property;
            private List<?> imageurllist;

            public int getBrandid() {
                return brandid;
            }

            public void setBrandid(int brandid) {
                this.brandid = brandid;
            }

            public String getLongname() {
                return longname;
            }

            public void setLongname(String longname) {
                this.longname = longname;
            }

            public int getFinalprice() {
                return finalprice;
            }

            public void setFinalprice(int finalprice) {
                this.finalprice = finalprice;
            }

            public int getAirrate() {
                return airrate;
            }

            public void setAirrate(int airrate) {
                this.airrate = airrate;
            }

            public String getPpatr() {
                return ppatr;
            }

            public void setPpatr(String ppatr) {
                this.ppatr = ppatr;
            }

            public int getPpata() {
                return ppata;
            }

            public void setPpata(int ppata) {
                this.ppata = ppata;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getIsshowdetail() {
                return isshowdetail;
            }

            public void setIsshowdetail(int isshowdetail) {
                this.isshowdetail = isshowdetail;
            }

            public String getProductdetailhtml() {
                return productdetailhtml;
            }

            public void setProductdetailhtml(String productdetailhtml) {
                this.productdetailhtml = productdetailhtml;
            }

            public String getProductparameterhtml() {
                return productparameterhtml;
            }

            public void setProductparameterhtml(String productparameterhtml) {
                this.productparameterhtml = productparameterhtml;
            }

            public String getBrandlogo() {
                return brandlogo;
            }

            public void setBrandlogo(String brandlogo) {
                this.brandlogo = brandlogo;
            }

            public int getSeckillid() {
                return seckillid;
            }

            public void setSeckillid(int seckillid) {
                this.seckillid = seckillid;
            }

            public boolean isIsmiaowgoods() {
                return ismiaowgoods;
            }

            public void setIsmiaowgoods(boolean ismiaowgoods) {
                this.ismiaowgoods = ismiaowgoods;
            }

            public boolean isIsowntake() {
                return isowntake;
            }

            public void setIsowntake(boolean isowntake) {
                this.isowntake = isowntake;
            }

            public String getMiaowdescription() {
                return miaowdescription;
            }

            public void setMiaowdescription(String miaowdescription) {
                this.miaowdescription = miaowdescription;
            }

            public String getItemcode() {
                return itemcode;
            }

            public void setItemcode(String itemcode) {
                this.itemcode = itemcode;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getYt_price() {
                return yt_price;
            }

            public void setYt_price(int yt_price) {
                this.yt_price = yt_price;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getProducttype() {
                return producttype;
            }

            public void setProducttype(String producttype) {
                this.producttype = producttype;
            }

            public boolean isInstock() {
                return instock;
            }

            public void setInstock(boolean instock) {
                this.instock = instock;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public PropertyDetailBean getProperty_detail() {
                return property_detail;
            }

            public void setProperty_detail(PropertyDetailBean property_detail) {
                this.property_detail = property_detail;
            }

            public Object getGift() {
                return gift;
            }

            public void setGift(Object gift) {
                this.gift = gift;
            }

            public String getWeburl() {
                return weburl;
            }

            public void setWeburl(String weburl) {
                this.weburl = weburl;
            }

            public boolean isIsfavorite() {
                return isfavorite;
            }

            public void setIsfavorite(boolean isfavorite) {
                this.isfavorite = isfavorite;
            }

            public int getRemain() {
                return remain;
            }

            public void setRemain(int remain) {
                this.remain = remain;
            }

            public Object getEndtime() {
                return endtime;
            }

            public void setEndtime(Object endtime) {
                this.endtime = endtime;
            }

            public int getLeftcount() {
                return leftcount;
            }

            public void setLeftcount(int leftcount) {
                this.leftcount = leftcount;
            }

            public String getLeftsecond() {
                return leftsecond;
            }

            public void setLeftsecond(String leftsecond) {
                this.leftsecond = leftsecond;
            }

            public int getIsshowfitting() {
                return isshowfitting;
            }

            public void setIsshowfitting(int isshowfitting) {
                this.isshowfitting = isshowfitting;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public String getImageitemcode() {
                return imageitemcode;
            }

            public void setImageitemcode(String imageitemcode) {
                this.imageitemcode = imageitemcode;
            }

            public Object getNotice() {
                return notice;
            }

            public void setNotice(Object notice) {
                this.notice = notice;
            }

            public List<?> getPromotions() {
                return promotions;
            }

            public void setPromotions(List<?> promotions) {
                this.promotions = promotions;
            }

            public List<String> getSmall_img_urls() {
                return small_img_urls;
            }

            public void setSmall_img_urls(List<String> small_img_urls) {
                this.small_img_urls = small_img_urls;
            }

            public List<String> getLarge_img_urls() {
                return large_img_urls;
            }

            public void setLarge_img_urls(List<String> large_img_urls) {
                this.large_img_urls = large_img_urls;
            }

            public List<SkuPropertyBean> getSku_property() {
                return sku_property;
            }

            public void setSku_property(List<SkuPropertyBean> sku_property) {
                this.sku_property = sku_property;
            }

            public List<?> getImageurllist() {
                return imageurllist;
            }

            public void setImageurllist(List<?> imageurllist) {
                this.imageurllist = imageurllist;
            }

            public static class PropertyDetailBean {
                private List<PropertiesBean> properties;
                private List<PropertyDescriptionsBean> property_descriptions;

                public List<PropertiesBean> getProperties() {
                    return properties;
                }

                public void setProperties(List<PropertiesBean> properties) {
                    this.properties = properties;
                }

                public List<PropertyDescriptionsBean> getProperty_descriptions() {
                    return property_descriptions;
                }

                public void setProperty_descriptions(List<PropertyDescriptionsBean> property_descriptions) {
                    this.property_descriptions = property_descriptions;
                }

                public static class PropertiesBean {
                    /**
                     * icon :
                     * name : 肩宽
                     * value : 36CM
                     */

                    private String icon;
                    private String name;
                    private String value;

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class PropertyDescriptionsBean {
                    /**
                     * name : 尺寸说明
                     * description : <!--#NewSize#-->
                     <div class="info-win info-size">
                     <a id="Y_CloWin_infosize" class="clo-x" href="javascript:void(0);"></a>
                     <h3 class="info-tit">尺码说明</h3>
                     <div class="info-content">
                     <img src="https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg" alt="" />
                     <p>
                     <!--尺码说明文字内容-->
                     <p ></p>
                     </div>
                     </div>
                     <!--#End NewSize#-->
                     <input type="hidden" id="J_PageModeHidden" value="NewSize" />
                     */

                    private String name;
                    private String description;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }
            }

            public static class SkuPropertyBean {
                /**
                 * url : https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg
                 * name : 颜色分类
                 * value : 黑色
                 */

                private String url;
                private String name;
                private String value;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class ProductListBean {
            /**
             * brandid : 4709
             * longname : 【新品】【自营】SUNCOO黑色混合材质蕾丝装饰女士针织连衣裙, H17M03487 02-NOIR WOMEN ROBE CORINNE T1
             * finalprice : 1650
             * airrate : 0
             * ppatr : 0%
             * ppata : 0
             * description :
             * isshowdetail : 0
             * productdetailhtml : <!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站</title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}</style></head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>品牌故事</h4></div><div class='pro-info-text'><div class='pro-ui-title'><h5>SUNCOO</h5><div><span><img src='https://p10.ytrss.com/Brand/4709/logo.jpg' width='100%' /></span></div></div><div class='pro-ui-text'><p>巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。</p></div></div><div class='pro-info-title'><h4>商品细节</h4></div><div class='pro-info-text'><table class='pro-dobule-images'><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg' width='100%' /></td></tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg' width='100%' /></td></tr><tr><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg' width='100%' /></td><td><img alt='Cottonshop' title='' src='https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg' width='100%' /></td></tr></table></div></body></html>
             * productparameterhtml : <!DOCTYPE html><html><head><title>银泰网 - 银泰百货连锁在线购物中心，银泰商业集团官方购物网站</title><meta charset='utf-8' /><meta name='viewport' content='initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, user-scalable=no' /><meta content='yes' name='apple-mobile-web-app-capable' /><meta content='black' name='apple-mobile-web-app-status-bar-style' /><meta content='telephone=no' name='format-detection' /><meta name='keywords' content='银泰网' /><meta name='description' content='银泰网（www.yintai.com）作为银泰商业集团官方购物网站,专注经营精品时尚百货类，包括女装，男装，鞋靴，化妆品，运动系列，时尚配饰，名品箱包等万种百货商品，100%正品，15天免费退换货。银泰网作为银泰百货连锁在线购物中心，致力打造成为中国最卓越的百货购物网站！' /><link href='https://r.ytrss.com/mobile/css/style.css' rel='stylesheet'  type='text/css'><style type='text/css'>.pro-info-size{width:100%;border:1px solid #ddd;border-collapse:collapse;border-spacing:0;font-size:14px;margin-bottom:15px}.pro-info-size td{width:50%;border:1px solid #ddd;padding:10px 5px;color:#666}.pro-info-size td b{color:#333}.pro-info-title{margin:0 auto 6px;height:26px}.pro-info-title h4{float:left;width:90px;height:26px;line-height:26px;text-indent:10px;font-size:14px;font-weight:700;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJ4AAAAyCAMAAACahZLcAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyBpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMC1jMDYwIDYxLjEzNDc3NywgMjAxMC8wMi8xMi0xNzozMjowMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNSBXaW5kb3dzIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjYxNTAwM0I0MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4IiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOjYxNTAwM0I1MEY1OTExRTU4M0MxOEI5QjQ4MzlEMDM4Ij4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6NjE1MDAzQjIwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6NjE1MDAzQjMwRjU5MTFFNTgzQzE4QjlCNDgzOUQwMzgiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz7mwj00AAAARVBMVEXq6ur////c3Nz+/v7s7Ozu7u7r6+v29vb9/f34+Pj19fX7+/v5+fnt7e339/fv7+/w8PDy8vL8/Pzz8/Px8fH09PT6+vp3BjvhAAAAyklEQVR42szXSRKCQBBFwUJoRAUBQe9/VAUHwHBv1gkyevNfx26+bLr4392y3xcGr7N5cbJ5o82Li83rbV5UNm+weWVF8+Jq88qc5sXR5hU5zYu9zWtsXpxtXrJ5cbB5yeZFbfM6m/dV9RxvtHnb5/N4vc3bfIpA3mDz1lUP8tZVL/JWVS/yVlVP8paqJ3lL1Zu8wuZ9qh7lNTbvXfUqL9m8V9WzvDanec/pcHnzdLi8eTpgXmHzpumQeY3Ne0wHzUs2L2qb194FGAA6iQfypDiKsQAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%;color:#333}.pro-info-title a{float:right;line-height:26px;font-weight:700;color:#333}.pro-info-title a span{display:inline-block;width:20px;height:20px;margin-right:5px;vertical-align:middle;background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAnCAYAAAB5XdqFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDoyRTlBMjNFRkQ0MDhFNDExODc1MEYzQ0JFQURFQ0VCNyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDoyQjc0QjE4NkZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDoyQjc0QjE4NUZERkQxMUU0QTREQ0YxNzY5Q0UyRjA4MyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6MDU4MDExNzQwNzIwNjgxMTgyMkFGNjg2RTEzQzA3MjkiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MkU5QTIzRUZENDA4RTQxMTg3NTBGM0NCRUFERUNFQjciLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz4aEoG4AAAEUUlEQVR42sSYd2gUURDG77zYY8GSs8YaOwrmFAtYEKxYsBfsmKCgsYuKGFQIKoIF/4goothFFBUTREEUCxas2IiKDY1iSTQqJl78Br6Fcb3d2727JAM/2Ld3b/fbefPmzXvelJQUT4RWCbQGjUB1EAQF4BV4Cn55orDMzMx/2nEu+4uwCWAI6ATKW/yvCNwE2eAghUdl5Rz+ryc4Dx6B1SBgI9JwQDeQDh6DLLYjtnAeTQBbwPgQv8lQ54Bn4Cs/Oh60Ai2UE7xgIBgADoA08CmWQnuBI8Cv7hWCkxzOs+CbRd+aoB+YCIYDHwVPAn3BWHA5FkMvDzynRBaDPSAJjAbHbER66GH5zyh6+CCfIdaAzx4VrdBhFGXE4DvQH0wDLyMIr+f07GCQqzKGhMHQSIUm8+t9bN8HXemBaC2bz3rEdgW+q4NbofH8yipsP2acvfHEzl4xRnPYrgoOgYpuhK5kPBkxJsPy0RN7y+Wz89luz3c7EtoYLFD356uvLgmT0Vqs2otM2cVSaJpy/xWw18VLJe1sZ+zNcNFvJ7jFawm3eeGEyuyequ6tUanEiTUEc0CbcC8zmbxjrWrPVJM4pFCZMHXYfsFEHmmKK+ey72nwltd+LtW2Qg075tKb0dofrnSG9bcTGlDti57StwvqOmAnNEm175eB0HvquoVdUaLTwmubB1ZgiZdkul9FXSeykNGWB9bZLL9vTBPTUqhRQf1kzFjZILAijHdqgDEh7ku1P9eiz3d1XdlJmVeZoRC0+O9VxlNiiGcY936HWHJle3I4zJbGo5xlKVSWybqqUH5v8d8PXKfNlqiG9Qno6DJG/aby0HIy6dhpWwaTqbW6zrETelu1u5WBUJ3k79oJ1XlsRBkIHWaRU/8TmsVJINYFtCtFkS1BbWaFAhbXlkK/gOOqElru8mXvVBWU5bKvTOKjHPL9FGubnjaDcbyW/c02cN3hywo5EjXsZq2Fk6Qu3cGMcty2llRHOie4tRV7yJf/KKEh95qKH7/a+IUt0eapLXA77kR9JSByFngANoBqFP0hXCdfcnKyXpNlrR+pxDZlzRiMkch4HjwkMC0Jp5yMnLnQ3ccvNWwKJ4g/BiLrgTOmd8ppzA0n+Vt71LDz/OIubDcHk8Fnzk63hbVM2OmcA20sjn+mcsZfc3NSUsw90Eo15OLRXawdZzP3OUk9cxmPspGrpar6JayyjCwh+7ZNDIPa4WZ9KJMiZDdoYrpfxCG7wyObfOUdGYHOPHUxO+IZd6rGTqIZ69eAqSaWs69LboQa5d8ybqlrRhifsqhsZL42l3LizfU8S/AqR6zifAk63TXKg9NZzs3hrP3joF8R1+5U9s2wqDdlwVjIOuOTiusMTuS6Tj1qVcl3Z1nYiGnHwzz8lrF8y+VKZdS2cnDWw7RE94mLcCjzWEBkx3gxkEO03txjLWUo1AcDvcXFpbONT01NddtFjtK3ck814q8AAwBmN+66rcnZ9gAAAABJRU5ErkJggg==) 0 0 no-repeat;background-size:100%}.pro-info-text{overflow:hidden;line-height:20px;color:#666;margin-bottom:15px}.pro-info-text p{margin-bottom:5px}.pro-info-text img {vertical-align:top;width:100%}.pro-info-text .pro-ui-title{height:62px;margin-bottom:5px}.pro-info-text .pro-ui-title h5{float:left;width:40%;height:62px;line-height:62px;overflow:hidden;font-size:20px;font-weight:700;color:#333}.pro-info-text .pro-ui-title div{float:right;width:60%;overflow:hidden;border-bottom:2px solid #999}.pro-info-text .pro-ui-title div span{float:right;display:block;width:90px;height:60px}.pro-info-text .pro-dobule-images td{padding:1px}</style></head><body style='padding:10px;background:#fff'> <!-- <- 左侧body的style样式只为了此原型服务 --><br /><div class='pro-info-title'><h4>商品属性</h4></div><table class='pro-info-size'><tr><td><span>肩宽：</span><b>35CM</b></td><td><span>裙长：</span><b>91cm</b></td></tr><tr><td><span>上市时间：</span><b>2017-Q3</b></td><td><span>胸围：</span><b>90CM</b></td></tr><tr><td><span>袖长：</span><b>60CM</b></td><td><span>裙长范围：</span><b>中裙</b></td></tr><tr><td><span>尺码：</span><b>M</b></td><td><span>色系：</span><b>黑色</b></td></tr><tr><td><span>尺码类型：</span><b>法国码</b></td><td><span>领型：</span><b>高领</b></td></tr><tr><td><span>袖型：</span><b>常规袖</b></td><td><span>袖长范围：</span><b>长袖</b></td></tr><tr><td><span>风格：</span><b>欧美</b></td><td><span>商品细节说明：</span><b>面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维</b></td></tr><tr><td><span>图案：</span><b>纯色</b></td><td><span>厚度：</span><b>适中</b></td></tr><tr><td><span>销售季节：</span><b>春秋</b></td><td><span>品牌所属国：</span><b>法国</b></td></tr><tr><td><span>产地：</span><b>中国</b></td><td><span>是否名品：</span><b>是</b></td></tr><tr><td><span>品类：</span><b>奢品</b></td><td><span>面料柔软度：</span><b>适中</b></td></tr><tr><td><span>商品规格：</span><b>条</b></td><td><span></span><b></b></td></tr></table><div class='pro-info-title'><h4>尺寸说明</h4><a href='#' onclick="window.callYintaiMobileMethod.viewBigPicture('https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg')"  target='_blank'><span></span>查看大图片</a></div><div class='pro-info-text'><img src='https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg' width='100%' /></div></body></html>
             * brandlogo : https://p10.ytrss.com/Brand/4709/logo.jpg
             * seckillid : 0
             * ismiaowgoods : false
             * isowntake : false
             * miaowdescription :
             * itemcode : 21-467-4411
             * name : 【新品】【自营】SUNCOO混合材质蕾丝装饰女士针织连衣裙
             * price : 2200
             * yt_price : 1650
             * score : 0
             * producttype : 5
             * instock : true
             * promotions : []
             * brand : SUNCOO
             * small_img_urls : ["https://p10.ytrss.com/product/21/467/4412/LargeImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/LargeImage/30711.jpg"]
             * large_img_urls : ["https://p10.ytrss.com/product/21/467/4412/ZoomImage/48956.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/51149.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/6136.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/8688.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/19295.jpg","https://p10.ytrss.com/product/21/467/4412/ZoomImage/30711.jpg"]
             * sku_property : [{"url":"https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg","name":"颜色分类","value":"黑色"},{"url":null,"name":"尺码","value":"1"}]
             * property_detail : {"properties":[{"icon":"","name":"肩宽","value":"35CM"},{"icon":"","name":"裙长","value":"91cm"},{"icon":"","name":"上市时间","value":"2017-Q3"},{"icon":"","name":"胸围","value":"90CM"},{"icon":"","name":"袖长","value":"60CM"},{"icon":"","name":"裙长范围","value":"中裙"},{"icon":"","name":"尺码","value":"M"},{"icon":"","name":"色系","value":"黑色"},{"icon":"","name":"尺码类型","value":"法国码"},{"icon":"","name":"领型","value":"高领"},{"icon":"","name":"袖型","value":"常规袖"},{"icon":"","name":"袖长范围","value":"长袖"},{"icon":"","name":"风格","value":"欧美"},{"icon":"","name":"商品细节说明","value":"面料1：50%粘纤50%锦纶 面料2：100%聚酯纤维"},{"icon":"","name":"图案","value":"纯色"},{"icon":"","name":"厚度","value":"适中"},{"icon":"","name":"销售季节","value":"春秋"},{"icon":"","name":"品牌所属国","value":"法国"},{"icon":"","name":"产地","value":"中国"},{"icon":"","name":"是否名品","value":"是"},{"icon":"","name":"品类","value":"奢品"},{"icon":"","name":"面料柔软度","value":"适中"},{"icon":"","name":"商品规格","value":"条"}],"property_descriptions":[{"name":"尺寸说明","description":"<!--#NewSize#-->\n<div class=\"info-win info-size\">\n    <a id=\"Y_CloWin_infosize\" class=\"clo-x\" href=\"javascript:void(0);\"><\/a>\n    <h3 class=\"info-tit\">尺码说明<\/h3>\n    <div class=\"info-content\">\n        <img src=\"https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg\" alt=\"\" />\n        <p>\n            <!--尺码说明文字内容-->\n        <p ><\/p>\n    <\/div>\n<\/div>\n<!--#End NewSize#-->\n<input type=\"hidden\" id=\"J_PageModeHidden\" value=\"NewSize\" />"},{"name":"品牌故事","description":"巴黎设计师品牌SUNCOO由Thomas和Stella创立，设计师STELLA通过独特的现代时尚语言诠释并引领着巴黎新浪漫风，以自由的表达，游刃有余的方式延续和创造着经典的法式时尚，在复古；混搭；简约风中自由转换，多样化的设计语言使SUNCOO迅速成为一个引领前沿时尚女性品牌，为追求轻奢时尚个性的女性量身打造，2014年SUNCOO被评为巴黎5个本土最具潜力的品牌之一。"}]}
             * imageurllist : []
             * gift : null
             * weburl : https://m.yintai.com/Sales/ProductDetail?itemCode=21-467-4411
             * isfavorite : false
             * remain : -2147483648
             * endtime : null
             * leftcount : 7
             * leftsecond : -63644537567.4001
             * isshowfitting : 0
             * discount : 7.5
             * imageitemcode : 21-467-4412
             * notice : null
             */

            private int brandid;
            private String longname;
            private int finalprice;
            private int airrate;
            private String ppatr;
            private int ppata;
            private String description;
            private int isshowdetail;
            private String productdetailhtml;
            private String productparameterhtml;
            private String brandlogo;
            private int seckillid;
            private boolean ismiaowgoods;
            private boolean isowntake;
            private String miaowdescription;
            private String itemcode;
            private String name;
            private int price;
            private int yt_price;
            private int score;
            private String producttype;
            private boolean instock;
            private String brand;
            private PropertyDetailBeanX property_detail;
            private Object gift;
            private String weburl;
            private boolean isfavorite;
            private int remain;
            private Object endtime;
            private int leftcount;
            private String leftsecond;
            private int isshowfitting;
            private double discount;
            private String imageitemcode;
            private Object notice;
            private List<?> promotions;
            private List<String> small_img_urls;
            private List<String> large_img_urls;
            private List<SkuPropertyBeanX> sku_property;
            private List<?> imageurllist;

            public int getBrandid() {
                return brandid;
            }

            public void setBrandid(int brandid) {
                this.brandid = brandid;
            }

            public String getLongname() {
                return longname;
            }

            public void setLongname(String longname) {
                this.longname = longname;
            }

            public int getFinalprice() {
                return finalprice;
            }

            public void setFinalprice(int finalprice) {
                this.finalprice = finalprice;
            }

            public int getAirrate() {
                return airrate;
            }

            public void setAirrate(int airrate) {
                this.airrate = airrate;
            }

            public String getPpatr() {
                return ppatr;
            }

            public void setPpatr(String ppatr) {
                this.ppatr = ppatr;
            }

            public int getPpata() {
                return ppata;
            }

            public void setPpata(int ppata) {
                this.ppata = ppata;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getIsshowdetail() {
                return isshowdetail;
            }

            public void setIsshowdetail(int isshowdetail) {
                this.isshowdetail = isshowdetail;
            }

            public String getProductdetailhtml() {
                return productdetailhtml;
            }

            public void setProductdetailhtml(String productdetailhtml) {
                this.productdetailhtml = productdetailhtml;
            }

            public String getProductparameterhtml() {
                return productparameterhtml;
            }

            public void setProductparameterhtml(String productparameterhtml) {
                this.productparameterhtml = productparameterhtml;
            }

            public String getBrandlogo() {
                return brandlogo;
            }

            public void setBrandlogo(String brandlogo) {
                this.brandlogo = brandlogo;
            }

            public int getSeckillid() {
                return seckillid;
            }

            public void setSeckillid(int seckillid) {
                this.seckillid = seckillid;
            }

            public boolean isIsmiaowgoods() {
                return ismiaowgoods;
            }

            public void setIsmiaowgoods(boolean ismiaowgoods) {
                this.ismiaowgoods = ismiaowgoods;
            }

            public boolean isIsowntake() {
                return isowntake;
            }

            public void setIsowntake(boolean isowntake) {
                this.isowntake = isowntake;
            }

            public String getMiaowdescription() {
                return miaowdescription;
            }

            public void setMiaowdescription(String miaowdescription) {
                this.miaowdescription = miaowdescription;
            }

            public String getItemcode() {
                return itemcode;
            }

            public void setItemcode(String itemcode) {
                this.itemcode = itemcode;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getYt_price() {
                return yt_price;
            }

            public void setYt_price(int yt_price) {
                this.yt_price = yt_price;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getProducttype() {
                return producttype;
            }

            public void setProducttype(String producttype) {
                this.producttype = producttype;
            }

            public boolean isInstock() {
                return instock;
            }

            public void setInstock(boolean instock) {
                this.instock = instock;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public PropertyDetailBeanX getProperty_detail() {
                return property_detail;
            }

            public void setProperty_detail(PropertyDetailBeanX property_detail) {
                this.property_detail = property_detail;
            }

            public Object getGift() {
                return gift;
            }

            public void setGift(Object gift) {
                this.gift = gift;
            }

            public String getWeburl() {
                return weburl;
            }

            public void setWeburl(String weburl) {
                this.weburl = weburl;
            }

            public boolean isIsfavorite() {
                return isfavorite;
            }

            public void setIsfavorite(boolean isfavorite) {
                this.isfavorite = isfavorite;
            }

            public int getRemain() {
                return remain;
            }

            public void setRemain(int remain) {
                this.remain = remain;
            }

            public Object getEndtime() {
                return endtime;
            }

            public void setEndtime(Object endtime) {
                this.endtime = endtime;
            }

            public int getLeftcount() {
                return leftcount;
            }

            public void setLeftcount(int leftcount) {
                this.leftcount = leftcount;
            }

            public String getLeftsecond() {
                return leftsecond;
            }

            public void setLeftsecond(String leftsecond) {
                this.leftsecond = leftsecond;
            }

            public int getIsshowfitting() {
                return isshowfitting;
            }

            public void setIsshowfitting(int isshowfitting) {
                this.isshowfitting = isshowfitting;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public String getImageitemcode() {
                return imageitemcode;
            }

            public void setImageitemcode(String imageitemcode) {
                this.imageitemcode = imageitemcode;
            }

            public Object getNotice() {
                return notice;
            }

            public void setNotice(Object notice) {
                this.notice = notice;
            }

            public List<?> getPromotions() {
                return promotions;
            }

            public void setPromotions(List<?> promotions) {
                this.promotions = promotions;
            }

            public List<String> getSmall_img_urls() {
                return small_img_urls;
            }

            public void setSmall_img_urls(List<String> small_img_urls) {
                this.small_img_urls = small_img_urls;
            }

            public List<String> getLarge_img_urls() {
                return large_img_urls;
            }

            public void setLarge_img_urls(List<String> large_img_urls) {
                this.large_img_urls = large_img_urls;
            }

            public List<SkuPropertyBeanX> getSku_property() {
                return sku_property;
            }

            public void setSku_property(List<SkuPropertyBeanX> sku_property) {
                this.sku_property = sku_property;
            }

            public List<?> getImageurllist() {
                return imageurllist;
            }

            public void setImageurllist(List<?> imageurllist) {
                this.imageurllist = imageurllist;
            }

            public static class PropertyDetailBeanX {
                private List<PropertiesBeanX> properties;
                private List<PropertyDescriptionsBeanX> property_descriptions;

                public List<PropertiesBeanX> getProperties() {
                    return properties;
                }

                public void setProperties(List<PropertiesBeanX> properties) {
                    this.properties = properties;
                }

                public List<PropertyDescriptionsBeanX> getProperty_descriptions() {
                    return property_descriptions;
                }

                public void setProperty_descriptions(List<PropertyDescriptionsBeanX> property_descriptions) {
                    this.property_descriptions = property_descriptions;
                }

                public static class PropertiesBeanX {
                    /**
                     * icon :
                     * name : 肩宽
                     * value : 35CM
                     */

                    private String icon;
                    private String name;
                    private String value;

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public static class PropertyDescriptionsBeanX {
                    /**
                     * name : 尺寸说明
                     * description : <!--#NewSize#-->
                     <div class="info-win info-size">
                     <a id="Y_CloWin_infosize" class="clo-x" href="javascript:void(0);"></a>
                     <h3 class="info-tit">尺码说明</h3>
                     <div class="info-content">
                     <img src="https://p10.ytrss.com/ProductDetail//guide/21-467-4412.jpg" alt="" />
                     <p>
                     <!--尺码说明文字内容-->
                     <p ></p>
                     </div>
                     </div>
                     <!--#End NewSize#-->
                     <input type="hidden" id="J_PageModeHidden" value="NewSize" />
                     */

                    private String name;
                    private String description;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }
                }
            }

            public static class SkuPropertyBeanX {
                /**
                 * url : https://p10.ytrss.com/product/21/467/4412/ViewImage/48956.jpg
                 * name : 颜色分类
                 * value : 黑色
                 */

                private String url;
                private String name;
                private String value;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
