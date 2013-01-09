def jqgridVer = "4.4.1"
def dataTablesVer = "1.9.4"

modules = {
    'easygrid-jqgrid-theme' {
        resource id: 'theme',
                url: [plugin: 'easygrid', dir: "jquery.jqGrid-${jqgridVer}/css",
                        file: 'ui.jqgrid.css'],
                attrs: [media: 'screen, projection']
    }

    'easygrid-jqgrid' {
        dependsOn 'jquery-ui', 'easygrid-jqgrid-theme'

        resource id: 'js-jqgrid-dev', url: [plugin: 'easygrid', dir: "jquery.jqGrid-${jqgridVer}/js", file: "jquery.jqGrid.min.js"],
                nominify: true, disposition: 'head'
        //todo multilanguage
        resource id: 'js-locale-jqgrid-dev', url: [plugin: 'easygrid', dir: "jquery.jqGrid-${jqgridVer}/js/i18n", file: "grid.locale-en.js"],
                nominify: true, disposition: 'head'
    }

    'easygrid-datatables' {
        dependsOn 'jquery-ui'

        resource id: 'js-datatable', url: [plugin: 'easygrid', dir: "DataTables-${dataTablesVer}/media/js", file: "jquery.dataTables.min.js"],
                nominify: true, disposition: 'head'
    }


    'easygrid-jqgrid-dev' {
        dependsOn 'jquery-ui-dev', 'easygrid-jqgrid-theme'

        //JQGRID
        resource id: 'js-jqgrid', url: [plugin: 'easygrid', dir: "jquery.jqGrid-${jqgridVer}/js", file: "jquery.jqGrid.src.js"],
                nominify: true, disposition: 'head'
        //todo multilanguage
        resource id: 'js-locale-jqgrid', url: [plugin: 'easygrid', dir: "jquery.jqGrid-${jqgridVer}/src/i18n", file: "grid.locale-en.js"],
                nominify: true, disposition: 'head'
    }

    'easygrid-datatables-dev' {
        dependsOn 'jquery-ui'

        resource id: 'js-datatable', url: [plugin: 'easygrid', dir: "DataTables-${dataTablesVer}/media/js", file: "jquery.dataTables.js"],
                nominify: true, disposition: 'head'
    }

    'easygrid-visualization-dev' {
//        dependsOn 'jquery-ui', 'easygrid-theme'

        resource id: 'js-visualization-api', url: [plugin: 'easygrid', dir: "visualization", file: "jsapi.js"],
                nominify: true, disposition: 'head'
        resource id: 'js-visualization-util', url: [plugin: 'easygrid', dir: "visualization", file: "visualizationUtils.js"],
                nominify: true, disposition: 'head'
    }

    'easygrid-selection' {
        dependsOn 'easygrid-jqgrid'

        resource id: 'js-selection', url: [plugin: 'easygrid', dir: "js/selection", file: "selectionWidget.js"],
                nominify: true, disposition: 'head'
    }

    'easygrid-selection-dev' {
        dependsOn 'easygrid-jqgrid-dev'

        resource id: 'js-selection-dev', url: [plugin: 'easygrid', dir: "js/selection", file: "selectionWidget.js"],
                nominify: true, disposition: 'head'
    }


}