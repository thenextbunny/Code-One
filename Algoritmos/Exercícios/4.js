function age(birthdayYear, birthdayMonth, birthdayDay) {
    let d = new Date
    
    currentYear = d.getFullYear()
    currentMonth = d.getMonth() + 1
    currentDay = d.getDate()

    birthdayYear = +birthdayYear
    birthdayMonth = +birthdayMonth
    birthdayDay = +birthdayDay

    howManyYears = currentYear - birthdayYear

    if (currentMonth < birthdayMonth || currentMonth == birthdayMonth && currentDay < birthdayDay) {
        howManyYears--;
    }

    return howManyYears < 0 ? 0 : howManyYears;
}



console.log(age(1980, 12, 11)); 

console.log(age(2011, 2, 15));  

console.log(age(2003, 4, 15));  