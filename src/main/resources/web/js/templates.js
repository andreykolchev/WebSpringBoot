$(function(){
    var includes = $('[data-include]');
    $.each(includes, function(){
        var file = '/web/templates/'+$(this).data('include') + '.html';
        $(this).load(file);
    });
});