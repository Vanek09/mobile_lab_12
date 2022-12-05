package com.chisw.lab12

enum class Weekday(val num: Int) {
    MONDAY(1) {
        override fun nextDay() = TUESDAY
    },
    TUESDAY(2) {
        override fun nextDay() = WEDNESDAY
    },
    WEDNESDAY(3) {
        override fun nextDay() = THURSDAY
    },
    THURSDAY(4) {
        override fun nextDay() = FRIDAY
    },
    FRIDAY(5) {
        override fun nextDay() = SATURDAY
    },
    SATURDAY(6) {
        override fun nextDay() = SUNDAY
    },
    SUNDAY(7) {
        override fun nextDay() = MONDAY
    };

    abstract fun nextDay(): Weekday
}