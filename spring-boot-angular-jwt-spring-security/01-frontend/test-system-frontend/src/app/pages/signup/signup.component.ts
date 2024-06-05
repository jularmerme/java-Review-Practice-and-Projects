import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import {
  MatSnackBar,
  MatSnackBarHorizontalPosition,
  MatSnackBarVerticalPosition,
} from '@angular/material/snack-bar';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
  providers: [MatSnackBar],
})
export class SignupComponent implements OnInit {
  public user = {
    userName: ' ',
    password: ' ',
    firstName: ' ',
    lastName: ' ',
    email: ' ',
    phone: ' ',
  };

  horizontalPosition: MatSnackBarHorizontalPosition = 'start';
  verticalPosition: MatSnackBarVerticalPosition = 'bottom';

  constructor(private userService: UserService, private snack: MatSnackBar) {}

  ngOnInit(): void {}

  formSubmit() {
    console.log(this.user);
    if (this.user.userName == ' ' || this.user.userName == null) {
      this.snack.open(`Username is required ! ! !`, 'Acept', {
        duration: 3000,
        horizontalPosition: this.horizontalPosition,
        verticalPosition: this.verticalPosition,
      });
      return;
    }

    this.userService.addUser(this.user).subscribe(
      (data) => {
        console.log(data);
        Swal.fire(
          `User created Successfully!!!!`,
          'User saved in db',
          'success'
        );
      },
      (error) => {
        console.log(error);
        this.snack.open(`There was an error`, 'Acept', {
          duration: 3000,
        });
      }
    );
  }
}
