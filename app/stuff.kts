val day = 1..24
val workingHours = day.filter { it in 9..17 }

val workingHours = day.filter((9..17)::contains)
