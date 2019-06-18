
$(document).ready(function() {
    var target = $("#calendar");

    function buildCalendar() {
        const DATE = new Date();
        let YEAR = DATE.getFullYear();
        let MONTH = DATE.getMonth()+1;
        let DAY = DATE.getDate();
        let FULLDATE = YEAR + "-" + (MONTH<10?"0"+MONTH:MONTH) + "-" + (DAY<10?"0"+DAY:DAY);
        let last_day = new Date(YEAR, MONTH, 0).getDate();
        let grid = "";

        console.log(new Date(YEAR, MONTH, 0));

        grid += "<div class='calendar-title'><label>◀︎</label>";
        grid += FULLDATE;
        grid += "<label>▶︎</label></div>";

        grid += "<table class='calendar-grid'>";

        grid += "<tr class='calendar-week'>" +
            "<td style='color: crimson;'>일</td><td>월</td><td>화</td><td>수</td><td>목</td><td>금</td><td style='color: dodgerblue;'>토</td>" +
            "</tr>";


        const day = new Date(YEAR, MONTH-1, 1).getDay();    // 현재 월 1일의 요일
        var n = 0;
        const t = day + last_day;   // 달력 최대 크기 세로*가로(42)
        const w = (t<=30?5:6);
        for (var i = 0 ; i < w ; i++) {
            grid += "<tr class='calendar-days'>";
            for (var j = 0 ; j < 7 ; j++) {
                grid += "<div class='calendar-cell'><td>";

                if(day > n) {
                    grid += "<div class='calendar-cell calendar-cell-before'>";
                    grid += "</div>";
                }

                if(day <= n && n < t) {
                    if( (n-day)+1 == DAY ) {
                        grid += "<div class='calendar-cell calendar-cell-now'>";
                    } else if( (n-day)+1 < DAY ) {
                        grid += "<div class='calendar-cell calendar-cell-before'>";
                    } else {
                        grid += "<div class='calendar-cell'>";
                    }
                    grid += "<div class='calendar-cell-days'>";
                    grid += (n-day)+1;
                    grid += "</div>";
                    grid += "<div class='calendar-cell-contents'>";
                    grid += "</div>";
                }
                n++;

                grid += "</td></div>";
            }
            grid += "</tr>";
        }

        grid += "</table>";

        target.append(grid);
    }

    buildCalendar();

});