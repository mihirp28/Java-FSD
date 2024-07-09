import { AbstractControl, ValidationErrors, ValidatorFn } from '@angular/forms';

export function startDateTimeValidator(): ValidatorFn
{
    return (control: AbstractControl) :ValidationErrors | null => {

        let date1 = new Date();

        console.log("Form control");
        console.log(control);
        
        let date2 = new Date(control.value);

        if(date2>=date1)
        {
            return null;
        }
        else
        {
            return {date: control.value};
        }
    };
    
}