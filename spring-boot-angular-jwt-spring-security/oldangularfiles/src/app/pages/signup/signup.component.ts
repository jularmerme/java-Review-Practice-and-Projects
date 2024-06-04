import { Component, OnInit } from '@angular/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { UserService } from '../../services/user.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatCard } from '@angular/material/card';

@Component({
  selector: 'app-signup',
  standalone: true,
  imports: [MatFormFieldModule, MatInputModule, MatButtonModule, MatCard],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css',
})
export class SignupComponent implements OnInit {
  public user = {
    username: '',
    password: '',
    firstname: '',
    lastname: '',
    email: '',
    phone: '',
  };

  constructor(private userService: UserService, private snack: MatSnackBar) {}
  ngOnInit(): void {
    // throw new Error('Method not implemented.');
  }

  formSubmit() {
    console.log(this.user);
    if (this.user.username == '' || this.user.username == null) {
      alert(`Username is required!!!`);
      return;
    }

    this.userService.addUser(this.user).subscribe(
      (data) => {
        console.log(data);
        alert(`User saved successfully!!!!`);
      },
      (error) => {
        console.log(error);
        alert(`Error`);
      }
    );
  }
}
