<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>公告基础设定</title>
    <#include "/common/top.ftl" />
    <#assign fum_ctx=request.getContextPath+"/fum" />
    <link rel="stylesheet" href="${ctx}/static/js/layui/css/layui.css">
    <link href="${ctx}/static/css/base.css" rel="stylesheet" type="text/css">
    <link href="${ctx}/static/css/notice-base.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div class="main">
        <div class="step">
            <div class="s-list">
                <i class="past">1</i>
                <span>选择模板</span>
                <div class="line"></div>
            </div>
            <div class="s-list">
                <i class="past">2</i>
                <span>公告基础设定</span>
                <div class="line"></div>
            </div>
            <div class="s-list">
                <i>3</i>
                <span>填写参数</span>
                <div class="line"></div>
            </div>
            <div class="s-list">
                <i>4</i>
                <span>公告生成</span>
            </div>
        </div>
        <div class="content">
            <form class="layui-form" action="">
                <div class="form-wrap">
                    <div class="layui-form-item">
                        <label class="layui-form-label">企业全称</label>
                        <div class="layui-input-block">
                            <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">选择事件类型</label>
                        <div class="layui-input-block">
                            <select name="type" lay-verify="required">
                                <option value="">全部</option>
                                <option value="0">名称变更</option>
                                <option value="1">生产经营状况发生重大变化</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="line"></div>
                <div class="form-wrap">
                    <div class="layui-form-item">
                        <label class="layui-form-label">输入框</label>
                        <div class="layui-input-block">
                            <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">下拉菜单</label>
                        <div class="layui-input-block">
                            <select name="city" lay-verify="required">
                                <option value="">全部</option>
                                <option value="0">名称变更</option>
                                <option value="1">生产经营状况发生重大变化</option>
                            </select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label p-t">单选框</label>
                        <div class="layui-input-block">
                            <input type="radio" name="sex" value="发行人相关公告" title="发行人相关公告">
                            <input type="radio" name="sex" value="发行人子公司相关公告" title="发行人子公司相关公告" checked>
                            <input type="radio" name="sex" value="发行人子公司相关公告" title="发行人子公司相关公告" checked>
                        </div>
                    </div>
                    <div class="layui-form-item" pane="">
                        <label class="layui-form-label">复选框</label>
                        <div class="layui-input-block">
                            <input type="checkbox" name="like1[write]" lay-skin="primary" title="写作" checked="">
                            <input type="checkbox" name="like1[read]" lay-skin="primary" title="阅读">
                            <input type="checkbox" name="like1[game]" lay-skin="primary" title="游戏" disabled="">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <a href="${fum_ctx}/english/test">下一步</a>
                        </div>
                    </div>

                </div>

            </form>

        </div>
    </div>
    <script src="${ctx}/static/js/layui/layui.js"></script>
    <script>
        layui.use(['form'], function(){
            var layer = layui.layer
                ,form = layui.form;
        });


    </script>
</body>
</html>