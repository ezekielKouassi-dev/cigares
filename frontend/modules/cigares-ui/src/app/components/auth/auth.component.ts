import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {faUser} from "@fortawesome/free-solid-svg-icons";

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.scss']
})
export class AuthComponent implements OnInit {
  auth!: FormGroup;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit() {
    this.buildReactiveForm();
  }

  buildReactiveForm() {
    this.auth = this.fb.group({
      "email" : new FormControl('', [Validators.required, Validators.email]),
      "mot_de_passe" : new FormControl('', [Validators.required])
    });
  }

  signIn() {
    if(this.isValidAuthForm()) {
      this.displayFormData();
    }
  }

  isValidAuthForm(): boolean {
    return this.auth.valid;
  }

  displayFormData() {
    console.log(this.auth.value);
  }

  protected readonly faUser = faUser;
}
