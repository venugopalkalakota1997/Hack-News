function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"], {
  /***/
  "./$$_lazy_route_resource lazy recursive":
  /*!******************************************************!*\
    !*** ./$$_lazy_route_resource lazy namespace object ***!
    \******************************************************/

  /*! no static exports found */

  /***/
  function $$_lazy_route_resourceLazyRecursive(module, exports) {
    function webpackEmptyAsyncContext(req) {
      // Here Promise.resolve().then() is used instead of new Promise() to prevent
      // uncaught exception popping up in devtools
      return Promise.resolve().then(function () {
        var e = new Error("Cannot find module '" + req + "'");
        e.code = 'MODULE_NOT_FOUND';
        throw e;
      });
    }

    webpackEmptyAsyncContext.keys = function () {
      return [];
    };

    webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
    module.exports = webpackEmptyAsyncContext;
    webpackEmptyAsyncContext.id = "./$$_lazy_route_resource lazy recursive";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/app.component.html":
  /*!**************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/app.component.html ***!
    \**************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppAppComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<nav class=\"navbar navbar-expand-sm navbar-dark navbar_top \">\n  <h2>\n    <a class=\"nav-link text-light\" routerLink=\"home\" (click)=\"home()\">\n      <i class=\"material-icons \">\n        school\n      </i> HACK_NEWS </a>\n  </h2>\n  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent1\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>\n  <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent1\">\n    <ul class=\"navbar-nav  ml-auto bg-dark\">\n      <li class=\"nav-item active text-light\" *ngIf=\"this.authService.loggedIn\">\n        <i class=\"material-icons other_icon \">person </i> {{this.authService.username}}\n      </li>\n      <li class=\"nav-item active\">\n        <a class=\"nav-link\" routerLink=\"login\" *ngIf=\"this.authService.loggedIn\" (click)=\"logout()\">Logout</a>\n      </li>\n\n      <li class=\"nav-item active\">\n        <a class=\"nav-link\" routerLink=\"login\" *ngIf=\"!this.authService.loggedIn\">Login</a>\n      </li>\n      <li class=\"nav-item active\">\n        <a class=\"nav-link\" routerLink=\"signup\" *ngIf=\"!this.authService.loggedIn\">Signup</a>\n      </li>\n    </ul>\n  </div>\n</nav>\n<router-outlet></router-outlet>";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/createchallenge/createchallenge.component.html":
  /*!******************************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/createchallenge/createchallenge.component.html ***!
    \******************************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppCreatechallengeCreatechallengeComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div class=\"row pb-5 px-0 py-0 mx-0\">\n\n    <div class=\"col-lg-6 col-sm-12 mt-5 ml-5 mr-5 mb-5 \">\n        <div class=\"mt-5 shadow\">\n            <div class=\"alert-danger col-12 px-auto py-5\" *ngIf=\"createErrorMessage\">\n                Challengename already exists!!\n            </div>\n        </div>\n\n        <div class=\"mt-5 shadow\" *ngIf=\"newChallengeAdded\">\n            <div class=\"alert-success col-12 px-auto py-5\">\n                Challengename sucessfully added!!\n            </div>\n        </div>\n<h5>Create Challenge</h5>\n\n        <div class=\" mt-5 \" *ngIf=\"!newChallengeAdded\">\n            <form [formGroup]=\"createChallengeForm\" (submit)=\"createChallenge(createChallengeForm.value)\">\n                <div class=\"row mt-5 ml-5 mr-5\">\n                    <div class=\"col\">\n                        <label for=\"challengename\" class=\"mr-2\">ChallengeName </label>\n                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter your challenge name\"\n                            formControlName=\"challengename\" id=\"challengename\"\n                            [class.is-invalid]=\"challengename.invalid && challengename.touched\">\n                        <div *ngIf=\"challengename.errors\">\n                            <small class=\"text text-danger\"\n                                *ngIf=\"challengename.invalid && challengename.errors.required && challengename.touched\">\n                                Challenge name required</small>\n                        </div>\n                    </div>\n                </div>\n                <div class=\"row mt-5 ml-5 mr-5\">\n                    <div class=\"col-12 \">\n                        <label for=\"descrption\" class=\"mr-2\">Descrption </label>\n                        <textarea class=\"form-control\" placeholder=\"Enter your descrption\" formControlName=\"descrption\"\n                            id=\"descrption\" [class.is-invalid]=\"descrption.invalid && descrption.touched\"></textarea>\n                        <div *ngIf=\"descrption.errors\">\n                            <small class=\"text text-danger\"\n                                *ngIf=\"descrption.invalid && descrption.errors.required && descrption.touched\">\n                                Descrption is required</small>\n                        </div>\n\n                    </div>\n                </div>\n                <div class=\"row mt-5 ml-5 mr-5\">\n                    <div class=\"col-12 \">\n                        <label for=\"tags\" class=\"mr-2\">Tags </label>\n                        <select class=\"custom-select\" formControlName=\"tags\">\n                            <option *ngFor=\"let option of tagslist\" [ngValue]=\"option\">{{option.name}}</option>\n                        </select>\n                    </div>\n                </div>\n                <div class=\"row mt-5 ml-5 mr-5 mb-5\">\n                    <div class=\"col-6\">\n                        <button type=\"submit\" class=\"btn buttonColor text-light\"\n                            [disabled]=\"!createChallengeForm.valid\">Submit</button>\n                    </div>\n                </div>\n            </form>\n        </div>\n    </div>\n</div>";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/home/home.component.html":
  /*!********************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/home/home.component.html ***!
    \********************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppHomeHomeComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div class=\"container py-5\">\n\n  <h5 class=\" my-5\">Challenges</h5>\n  <button type=\"button\" class=\"btn float-right\" style=\"background-color: #1100ff\" id=\"white\" (click)=\"sortbydate()\">Sort\n    By Date\n  </button>\n\n  <label for=\"tags\" class=\"float-right ml-5 mr-2\">\n    <select class=\"custom-select\" (change)=\"filterSelected($event.target.value)\">\n      <option>choose </option>\n      <option *ngFor=\"let option of tagslist\" [ngValue]=\"option\">{{option.name}}</option>\n    </select>\n  </label>\n\n  <button type=\"button\" class=\"btn float-right ml-5\" style=\"background-color: #1100ff\" id=\"white\"\n    (click)=\"myChallenge()\" *ngIf=\"auth.loggedIn\"> MyContributions </button>\n\n  <button type=\"button\" class=\"btn float-right\" style=\"background-color: #1100ff\" id=\"white\" (click)=\"creatChallenge()\">\n    <i class=\"material-icons other_icon\"> create </i> <span> Create challenges</span>\n  </button>\n\n  <button type=\"button\" class=\"btn float-right mr-5\" style=\"background-color: #1100ff\" id=\"white\"\n  (click)=\"challenges()\" > Challenges </button>\n</div>\n<div class=\"alert-danger container mt-5\" *ngIf=\"ErrorMessage\">Already Contributed</div>\n<div class=\"alert-danger container  \" *ngIf=\"!loggedIn\">Login before Creating challenge</div>\n<div class=\"alert-danger container \" *ngIf=\"!loggedforcontribute\">Login before Contributing</div>\n<div class=\"alert-danger container \" *ngIf=\"!loggedforvoting\">Login before Upvoting</div>\n<div *ngIf=\"!mychallenge\">\n  <div class=\"alert-success container\" *ngIf=\"contributed\">Contributed Successfully</div>\n  <div class=\"container card mt-5\" *ngFor=\"let challenge of challengelist\">\n    <div class=\"row mt-3\">\n      <div class=\"col\">\n       \n        <div class=\"card-title \">\n          {{challenge.title}}\n        </div>\n        <div class=\"card-body \">\n          {{challenge.description}}\n          <div>\n            Tags: {{challenge.tags.name}}\n          </div>\n        </div>\n        <div class=\"row my-3 ml-5 \" *ngIf=\"this.auth.name!=challenge.user.id\">\n          <div class=\"mr-5\">\n            {{challenge.upvote}} <label (click)=\"upvote(challenge.id)\"><i class=\"material-icons other_icon\">\n                thumb_up_alt </i>\n              <span> UpVote</span></label>\n\n          </div>\n\n          <div>\n            <label (click)=\"contribute(challenge.id)\"><i class=\"material-icons other_icon\"> send </i> <span>\n                Contribute</span>\n            </label>\n\n\n\n          </div>\n        </div>\n      </div>\n    </div>\n  </div>\n\n</div>\n<div *ngIf=\"mychallenge\">\n\n  <div class=\"container card mt-5\" *ngFor=\"let contribute of contributelist;let i=index\">\n    <div class=\"row mt-3\">\n      <div class=\"col\">\n        <div class=\"card-title \">\n          {{contribute.challenge.title}}\n        </div>\n        <div class=\"card-body \">\n          {{contribute.challenge.description}}\n        </div>\n        <div>\n          Tags: {{contribute.challenge.tags.name}}\n        </div>\n\n      </div>\n    </div>\n  </div>\n</div>";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/login/login.component.html":
  /*!**********************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/login/login.component.html ***!
    \**********************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppLoginLoginComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div class=\"row pb-5\">\n    <div class=\"col-xs-11 mt-5 ml-5 mr-5 mb-5 mx-auto\">\n        <div class=\"card mt-5 shadow\">\n            <h1 class=\"mt-5 ml-5\">Login</h1>\n            <div class=\"alert alert-danger ml-5 mr-5\" *ngIf=\"this.authService.isLoggedInValid\">Invalid Username /\n                Password</div>\n\n            <form [formGroup]=\"loginForm\" (submit)=\"this.authService.authenticateUser(loginForm.value)\">\n                <div class=\"row mt-5 ml-5 mr-5\">\n                    <div class=\"col-12\">\n                        <label for=\"empid\">Employee Id</label>\n                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter employee id\" formControlName=\"empid\"\n                            id=\"empid\" required>\n                        <div class=\"text-danger\" *ngIf=\"empid.touched && empid.invalid && empid.errors.required\">\n                            Employee id is\n                            required</div>\n                        <div class=\"validation-error text-danger\"\n                            *ngIf=\"loginForm.get('empid').touched && loginForm.get('empid').hasError('pattern')\">\n                            Employee id should be a number\n                            \n                        </div>\n                    </div>\n                </div>\n                <div class=\"row ml-5 mr-5\">\n                    <div class=\"col-12 mt-5\">\n                        <label for=\"password\">Password</label>\n                        <input type=\"password\" class=\"form-control\" placeholder=\"Enter Password\"\n                            formControlName=\"password\" id=\"password\" required>\n                        <div class=\"text-danger\"\n                            *ngIf=\"password.touched && password.invalid && password.errors.required\">Password is\n                            required</div>\n                    </div>\n                </div>\n\n\n\n\n                <div class=\"row mt-5 ml-5 mr-5 mb-5\">\n                    <div class=\"col-6\">\n                        <button type=\"submit\" class=\"btn buttonColor text-light\"\n                            [disabled]=\"!loginForm.valid\">Login</button>\n                    </div>\n                    <div class=\"col\">\n                        <div>\n                            New Here? <a class=\"text-primary \" (click)=\"toSignup()\">Signup</a>\n                        </div>\n                    </div>\n                </div>\n\n\n\n            </form>\n        </div>\n    </div>\n</div>";
    /***/
  },

  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/signup/signup.component.html":
  /*!************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/signup/signup.component.html ***!
    \************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppSignupSignupComponentHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<div class=\"row pb-5 px-0 py-0 mx-0\">\n    <div class=\"col-xs-11 mt-5 ml-5 mr-5 mb-5 mx-auto\">\n\n        <div class=\"card mt-5 shadow\" *ngIf=\"!newUserAdded\">\n            <div class=\"alert-success col-12 px-auto py-3\" *ngIf=\"userAdded\">\n                User added Sucessfully!!\n            </div>\n        </div>\n        <div class=\"card mt-5 shadow\" >\n            <div class=\"alert-danger col-12 px-auto py-5\" *ngIf=\"signupErrorMessage\">\n                UserName already exists!!\n            </div>\n        </div>\n\n\n        <div class=\"card mt-5 shadow\" *ngIf=\"newUserAdded\">\n            <form [formGroup]=\"signUpForm\" (submit)=\"addUser(signUpForm.value)\">\n                <div class=\"row mt-1 ml-5 mr-5\">\n\n                       <div class=\"col-md-6 col-xs-12 mt-1\">\n                            <label for=\"empid\">Employee Id</label>\n                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter employee id\"\n                                formControlName=\"empid\" id=\"empid\" \n                                [class.is-invalid]=\"empid.invalid && empid.touched\">\n                            <div class=\"text-danger\" *ngIf=\"empid.touched && empid.invalid && empid.errors.required\">\n                                Employee id is required\n                            </div>\n                            <div class=\"validation-error text-danger\"\n                                *ngIf=\"signUpForm.get('empid').touched && signUpForm.get('empid').hasError('pattern')\">\n                                Employee id should be a number\n\n                            </div>\n\n                        </div>\n                        <div class=\"col-md-6 col-xs-12 mt-1\">\n                            <label for=\"useremail\">Employee Email</label>\n                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter your email\"\n                                formControlName=\"useremail\" id=\"useremail\"\n                                [class.is-invalid]=\"useremail.invalid && useremail.touched\">\n                            <div *ngIf=\"useremail.errors\">\n                                <small class=\"text text-danger\"\n                                    *ngIf=\"useremail.errors.required && useremail.touched\">User\n                                    Email Id is required</small>\n                            </div>\n                            <div class=\"validation-error text-danger\"\n                                *ngIf=\"signUpForm.get('useremail').touched && signUpForm.get('useremail').hasError('pattern')\">\n                                Email Format should be followed\n                            </div>\n\n                        </div>\n                    \n                </div>\n                <div class=\"row ml-5 mr-5\">\n                    <div class=\"col-md-6 col-xs-12 mt-1\">\n                        <label for=\"firstname\">First Name</label>\n                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter First Name\"\n                            formControlName=\"firstname\" id=\"firstname\"\n                            [class.is-invalid]=\"firstname.invalid && firstname.touched\">\n                        <div *ngIf=\"firstname.errors\">\n                            <small class=\"text text-danger\"\n                                *ngIf=\"firstname.errors.required && firstname.touched\">Firstname\n                                is required</small>\n                        </div>\n                    </div>\n                    <div class=\"col-md-6 col-xs-12  mt-1\">\n                        <label for=\"lastname\">Last Name</label>\n                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Last Name\" formControlName=\"lastname\"\n                            id=\"lastname\" [class.is-invalid]=\"lastname.invalid && lastname.touched\">\n                        <div *ngIf=\"lastname.errors\">\n                            <small class=\"text text-danger\"\n                                *ngIf=\"lastname.errors.required && lastname.touched\">Lastname is\n                                required</small>\n                        </div>\n                    </div>\n                </div>\n\n                <div class=\"row ml-5 mr-5\">\n                    <div class=\"col-md-6 col-xs-12 mt-1\">\n                        <label for=\"password\">Password</label>\n                        <input type=\"password\" class=\"form-control\" placeholder=\"Enter Password\"\n                            formControlName=\"password\" id=\"password\"\n                            [class.is-invalid]=\"password.invalid && password.touched\">\n                        <div *ngIf=\"password.errors\">\n                            <small class=\"text text-danger\"\n                                *ngIf=\"password.errors.required && password.touched\">Password is required</small>\n                            <small class=\"text text-danger\" *ngIf=\"password.errors.maxlength\">Password too long</small>\n                        </div>\n\n                    </div>\n                    <div class=\"col-md-6 col-xs-12 mt-1\">\n                        <label for=\"confirmPassword\">Confirm Password</label>\n                        <input type=\"password\" class=\"form-control\" placeholder=\"Enter Password\"\n                            formControlName=\"confirmPassword\" id=\"confirmPassword\"\n                            [class.is-invalid]=\"confirmPassword.invalid && confirmPassword.touched\">\n                        <div class=\"text-danger\"\n                            *ngIf=\"confirmPassword.invalid && confirmPassword.errors.required && confirmPassword.touched\">\n                            Confirm the Password</div>\n                        <div class=\"text-danger\" *ngIf=\"signUpForm.get('confirmPassword').hasError('nomatch')\">Password\n                            and Confirm Password do not match</div>\n                    </div>\n                </div>\n\n\n                <div class=\"row mt-5 ml-5 mr-5 mb-5\">\n                    <div class=\"col-12\">\n                        <button type=\"submit\" class=\"btn buttonColor text-light\"\n                            [disabled]=\"!signUpForm.valid\">Signup</button>\n                    </div>\n                </div>\n            </form>\n        </div>\n\n\n    </div>\n</div>";
    /***/
  },

  /***/
  "./node_modules/tslib/tslib.es6.js":
  /*!*****************************************!*\
    !*** ./node_modules/tslib/tslib.es6.js ***!
    \*****************************************/

  /*! exports provided: __extends, __assign, __rest, __decorate, __param, __metadata, __awaiter, __generator, __createBinding, __exportStar, __values, __read, __spread, __spreadArrays, __await, __asyncGenerator, __asyncDelegator, __asyncValues, __makeTemplateObject, __importStar, __importDefault, __classPrivateFieldGet, __classPrivateFieldSet */

  /***/
  function node_modulesTslibTslibEs6Js(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__extends", function () {
      return __extends;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__assign", function () {
      return _assign;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__rest", function () {
      return __rest;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__decorate", function () {
      return __decorate;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__param", function () {
      return __param;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__metadata", function () {
      return __metadata;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__awaiter", function () {
      return __awaiter;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__generator", function () {
      return __generator;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__createBinding", function () {
      return __createBinding;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__exportStar", function () {
      return __exportStar;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__values", function () {
      return __values;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__read", function () {
      return __read;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__spread", function () {
      return __spread;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__spreadArrays", function () {
      return __spreadArrays;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__await", function () {
      return __await;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__asyncGenerator", function () {
      return __asyncGenerator;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__asyncDelegator", function () {
      return __asyncDelegator;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__asyncValues", function () {
      return __asyncValues;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__makeTemplateObject", function () {
      return __makeTemplateObject;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__importStar", function () {
      return __importStar;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__importDefault", function () {
      return __importDefault;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__classPrivateFieldGet", function () {
      return __classPrivateFieldGet;
    });
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "__classPrivateFieldSet", function () {
      return __classPrivateFieldSet;
    });
    /*! *****************************************************************************
    Copyright (c) Microsoft Corporation.
    
    Permission to use, copy, modify, and/or distribute this software for any
    purpose with or without fee is hereby granted.
    
    THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
    REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY
    AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
    INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM
    LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR
    OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
    PERFORMANCE OF THIS SOFTWARE.
    ***************************************************************************** */

    /* global Reflect, Promise */


    var _extendStatics = function extendStatics(d, b) {
      _extendStatics = Object.setPrototypeOf || {
        __proto__: []
      } instanceof Array && function (d, b) {
        d.__proto__ = b;
      } || function (d, b) {
        for (var p in b) {
          if (b.hasOwnProperty(p)) d[p] = b[p];
        }
      };

      return _extendStatics(d, b);
    };

    function __extends(d, b) {
      _extendStatics(d, b);

      function __() {
        this.constructor = d;
      }

      d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    }

    var _assign = function __assign() {
      _assign = Object.assign || function __assign(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
          s = arguments[i];

          for (var p in s) {
            if (Object.prototype.hasOwnProperty.call(s, p)) t[p] = s[p];
          }
        }

        return t;
      };

      return _assign.apply(this, arguments);
    };

    function __rest(s, e) {
      var t = {};

      for (var p in s) {
        if (Object.prototype.hasOwnProperty.call(s, p) && e.indexOf(p) < 0) t[p] = s[p];
      }

      if (s != null && typeof Object.getOwnPropertySymbols === "function") for (var i = 0, p = Object.getOwnPropertySymbols(s); i < p.length; i++) {
        if (e.indexOf(p[i]) < 0 && Object.prototype.propertyIsEnumerable.call(s, p[i])) t[p[i]] = s[p[i]];
      }
      return t;
    }

    function __decorate(decorators, target, key, desc) {
      var c = arguments.length,
          r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc,
          d;
      if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);else for (var i = decorators.length - 1; i >= 0; i--) {
        if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
      }
      return c > 3 && r && Object.defineProperty(target, key, r), r;
    }

    function __param(paramIndex, decorator) {
      return function (target, key) {
        decorator(target, key, paramIndex);
      };
    }

    function __metadata(metadataKey, metadataValue) {
      if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(metadataKey, metadataValue);
    }

    function __awaiter(thisArg, _arguments, P, generator) {
      function adopt(value) {
        return value instanceof P ? value : new P(function (resolve) {
          resolve(value);
        });
      }

      return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) {
          try {
            step(generator.next(value));
          } catch (e) {
            reject(e);
          }
        }

        function rejected(value) {
          try {
            step(generator["throw"](value));
          } catch (e) {
            reject(e);
          }
        }

        function step(result) {
          result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected);
        }

        step((generator = generator.apply(thisArg, _arguments || [])).next());
      });
    }

    function __generator(thisArg, body) {
      var _ = {
        label: 0,
        sent: function sent() {
          if (t[0] & 1) throw t[1];
          return t[1];
        },
        trys: [],
        ops: []
      },
          f,
          y,
          t,
          g;
      return g = {
        next: verb(0),
        "throw": verb(1),
        "return": verb(2)
      }, typeof Symbol === "function" && (g[Symbol.iterator] = function () {
        return this;
      }), g;

      function verb(n) {
        return function (v) {
          return step([n, v]);
        };
      }

      function step(op) {
        if (f) throw new TypeError("Generator is already executing.");

        while (_) {
          try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];

            switch (op[0]) {
              case 0:
              case 1:
                t = op;
                break;

              case 4:
                _.label++;
                return {
                  value: op[1],
                  done: false
                };

              case 5:
                _.label++;
                y = op[1];
                op = [0];
                continue;

              case 7:
                op = _.ops.pop();

                _.trys.pop();

                continue;

              default:
                if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) {
                  _ = 0;
                  continue;
                }

                if (op[0] === 3 && (!t || op[1] > t[0] && op[1] < t[3])) {
                  _.label = op[1];
                  break;
                }

                if (op[0] === 6 && _.label < t[1]) {
                  _.label = t[1];
                  t = op;
                  break;
                }

                if (t && _.label < t[2]) {
                  _.label = t[2];

                  _.ops.push(op);

                  break;
                }

                if (t[2]) _.ops.pop();

                _.trys.pop();

                continue;
            }

            op = body.call(thisArg, _);
          } catch (e) {
            op = [6, e];
            y = 0;
          } finally {
            f = t = 0;
          }
        }

        if (op[0] & 5) throw op[1];
        return {
          value: op[0] ? op[1] : void 0,
          done: true
        };
      }
    }

    function __createBinding(o, m, k, k2) {
      if (k2 === undefined) k2 = k;
      o[k2] = m[k];
    }

    function __exportStar(m, exports) {
      for (var p in m) {
        if (p !== "default" && !exports.hasOwnProperty(p)) exports[p] = m[p];
      }
    }

    function __values(o) {
      var s = typeof Symbol === "function" && Symbol.iterator,
          m = s && o[s],
          i = 0;
      if (m) return m.call(o);
      if (o && typeof o.length === "number") return {
        next: function next() {
          if (o && i >= o.length) o = void 0;
          return {
            value: o && o[i++],
            done: !o
          };
        }
      };
      throw new TypeError(s ? "Object is not iterable." : "Symbol.iterator is not defined.");
    }

    function __read(o, n) {
      var m = typeof Symbol === "function" && o[Symbol.iterator];
      if (!m) return o;
      var i = m.call(o),
          r,
          ar = [],
          e;

      try {
        while ((n === void 0 || n-- > 0) && !(r = i.next()).done) {
          ar.push(r.value);
        }
      } catch (error) {
        e = {
          error: error
        };
      } finally {
        try {
          if (r && !r.done && (m = i["return"])) m.call(i);
        } finally {
          if (e) throw e.error;
        }
      }

      return ar;
    }

    function __spread() {
      for (var ar = [], i = 0; i < arguments.length; i++) {
        ar = ar.concat(__read(arguments[i]));
      }

      return ar;
    }

    function __spreadArrays() {
      for (var s = 0, i = 0, il = arguments.length; i < il; i++) {
        s += arguments[i].length;
      }

      for (var r = Array(s), k = 0, i = 0; i < il; i++) {
        for (var a = arguments[i], j = 0, jl = a.length; j < jl; j++, k++) {
          r[k] = a[j];
        }
      }

      return r;
    }

    ;

    function __await(v) {
      return this instanceof __await ? (this.v = v, this) : new __await(v);
    }

    function __asyncGenerator(thisArg, _arguments, generator) {
      if (!Symbol.asyncIterator) throw new TypeError("Symbol.asyncIterator is not defined.");
      var g = generator.apply(thisArg, _arguments || []),
          i,
          q = [];
      return i = {}, verb("next"), verb("throw"), verb("return"), i[Symbol.asyncIterator] = function () {
        return this;
      }, i;

      function verb(n) {
        if (g[n]) i[n] = function (v) {
          return new Promise(function (a, b) {
            q.push([n, v, a, b]) > 1 || resume(n, v);
          });
        };
      }

      function resume(n, v) {
        try {
          step(g[n](v));
        } catch (e) {
          settle(q[0][3], e);
        }
      }

      function step(r) {
        r.value instanceof __await ? Promise.resolve(r.value.v).then(fulfill, reject) : settle(q[0][2], r);
      }

      function fulfill(value) {
        resume("next", value);
      }

      function reject(value) {
        resume("throw", value);
      }

      function settle(f, v) {
        if (f(v), q.shift(), q.length) resume(q[0][0], q[0][1]);
      }
    }

    function __asyncDelegator(o) {
      var i, p;
      return i = {}, verb("next"), verb("throw", function (e) {
        throw e;
      }), verb("return"), i[Symbol.iterator] = function () {
        return this;
      }, i;

      function verb(n, f) {
        i[n] = o[n] ? function (v) {
          return (p = !p) ? {
            value: __await(o[n](v)),
            done: n === "return"
          } : f ? f(v) : v;
        } : f;
      }
    }

    function __asyncValues(o) {
      if (!Symbol.asyncIterator) throw new TypeError("Symbol.asyncIterator is not defined.");
      var m = o[Symbol.asyncIterator],
          i;
      return m ? m.call(o) : (o = typeof __values === "function" ? __values(o) : o[Symbol.iterator](), i = {}, verb("next"), verb("throw"), verb("return"), i[Symbol.asyncIterator] = function () {
        return this;
      }, i);

      function verb(n) {
        i[n] = o[n] && function (v) {
          return new Promise(function (resolve, reject) {
            v = o[n](v), settle(resolve, reject, v.done, v.value);
          });
        };
      }

      function settle(resolve, reject, d, v) {
        Promise.resolve(v).then(function (v) {
          resolve({
            value: v,
            done: d
          });
        }, reject);
      }
    }

    function __makeTemplateObject(cooked, raw) {
      if (Object.defineProperty) {
        Object.defineProperty(cooked, "raw", {
          value: raw
        });
      } else {
        cooked.raw = raw;
      }

      return cooked;
    }

    ;

    function __importStar(mod) {
      if (mod && mod.__esModule) return mod;
      var result = {};
      if (mod != null) for (var k in mod) {
        if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
      }
      result["default"] = mod;
      return result;
    }

    function __importDefault(mod) {
      return mod && mod.__esModule ? mod : {
        "default": mod
      };
    }

    function __classPrivateFieldGet(receiver, privateMap) {
      if (!privateMap.has(receiver)) {
        throw new TypeError("attempted to get private field on non-instance");
      }

      return privateMap.get(receiver);
    }

    function __classPrivateFieldSet(receiver, privateMap, value) {
      if (!privateMap.has(receiver)) {
        throw new TypeError("attempted to set private field on non-instance");
      }

      privateMap.set(receiver, value);
      return value;
    }
    /***/

  },

  /***/
  "./src/app/app-routing.module.ts":
  /*!***************************************!*\
    !*** ./src/app/app-routing.module.ts ***!
    \***************************************/

  /*! exports provided: AppRoutingModule */

  /***/
  function srcAppAppRoutingModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function () {
      return AppRoutingModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _login_login_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./login/login.component */
    "./src/app/login/login.component.ts");
    /* harmony import */


    var _signup_signup_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ./signup/signup.component */
    "./src/app/signup/signup.component.ts");
    /* harmony import */


    var _home_home_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! ./home/home.component */
    "./src/app/home/home.component.ts");
    /* harmony import */


    var _createchallenge_createchallenge_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./createchallenge/createchallenge.component */
    "./src/app/createchallenge/createchallenge.component.ts");

    var routes = [{
      path: "login",
      component: _login_login_component__WEBPACK_IMPORTED_MODULE_3__["LoginComponent"]
    }, {
      path: "signup",
      component: _signup_signup_component__WEBPACK_IMPORTED_MODULE_4__["SignupComponent"]
    }, {
      path: "home",
      component: _home_home_component__WEBPACK_IMPORTED_MODULE_5__["HomeComponent"]
    }, {
      path: "create",
      component: _createchallenge_createchallenge_component__WEBPACK_IMPORTED_MODULE_6__["CreatechallengeComponent"]
    }];

    var AppRoutingModule = function AppRoutingModule() {
      _classCallCheck(this, AppRoutingModule);
    };

    AppRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes)],
      exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
    })], AppRoutingModule);
    /***/
  },

  /***/
  "./src/app/app.component.css":
  /*!***********************************!*\
    !*** ./src/app/app.component.css ***!
    \***********************************/

  /*! exports provided: default */

  /***/
  function srcAppAppComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = ".material-icons.md-36 {\r\n\tfont-size: 35px;\r\n\tline-height: 1.5;\r\n\tvertical-align: middle;\r\n}\r\n\r\n.material-icons.other_icon {\r\n\tline-height: 1.75;\r\n\tvertical-align: middle;\r\n}\r\n\r\n.navbar_top {\r\n\t/* background-image:linear-gradient(to right, #6054a5,#362e63,#0b0531 ); */\r\n\tbackground-color: orangered;\r\n\theight: 55px;\r\n\t\t\t\r\n\t\r\n}\r\n\r\n.navbar_bottom { \r\n\tbackground-color: orangered;\r\n\tposition: absolute;\r\n\tfont-size:20px;\r\n\theight: 55px;\r\n\twidth: 100%;\r\n\tbottom: 0;\r\n}\r\n\r\na:hover { \r\n    text-decoration: none; \r\n} \r\n\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbImFwcC5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0NBQ0MsZUFBZTtDQUNmLGdCQUFnQjtDQUNoQixzQkFBc0I7QUFDdkI7O0FBRUE7Q0FDQyxpQkFBaUI7Q0FDakIsc0JBQXNCO0FBQ3ZCOztBQUVBO0NBQ0MsMEVBQTBFO0NBQzFFLDJCQUEyQjtDQUMzQixZQUFZOzs7QUFHYjs7QUFFQTtDQUNDLDJCQUEyQjtDQUMzQixrQkFBa0I7Q0FDbEIsY0FBYztDQUNkLFlBQVk7Q0FDWixXQUFXO0NBQ1gsU0FBUztBQUNWOztBQUdBO0lBQ0kscUJBQXFCO0FBQ3pCIiwiZmlsZSI6ImFwcC5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLm1hdGVyaWFsLWljb25zLm1kLTM2IHtcclxuXHRmb250LXNpemU6IDM1cHg7XHJcblx0bGluZS1oZWlnaHQ6IDEuNTtcclxuXHR2ZXJ0aWNhbC1hbGlnbjogbWlkZGxlO1xyXG59XHJcblxyXG4ubWF0ZXJpYWwtaWNvbnMub3RoZXJfaWNvbiB7XHJcblx0bGluZS1oZWlnaHQ6IDEuNzU7XHJcblx0dmVydGljYWwtYWxpZ246IG1pZGRsZTtcclxufVxyXG5cclxuLm5hdmJhcl90b3Age1xyXG5cdC8qIGJhY2tncm91bmQtaW1hZ2U6bGluZWFyLWdyYWRpZW50KHRvIHJpZ2h0LCAjNjA1NGE1LCMzNjJlNjMsIzBiMDUzMSApOyAqL1xyXG5cdGJhY2tncm91bmQtY29sb3I6IG9yYW5nZXJlZDtcclxuXHRoZWlnaHQ6IDU1cHg7XHJcblx0XHRcdFxyXG5cdFxyXG59XHJcblxyXG4ubmF2YmFyX2JvdHRvbSB7IFxyXG5cdGJhY2tncm91bmQtY29sb3I6IG9yYW5nZXJlZDtcclxuXHRwb3NpdGlvbjogYWJzb2x1dGU7XHJcblx0Zm9udC1zaXplOjIwcHg7XHJcblx0aGVpZ2h0OiA1NXB4O1xyXG5cdHdpZHRoOiAxMDAlO1xyXG5cdGJvdHRvbTogMDtcclxufVxyXG5cclxuIFxyXG5hOmhvdmVyIHsgXHJcbiAgICB0ZXh0LWRlY29yYXRpb246IG5vbmU7IFxyXG59IFxyXG4iXX0= */";
    /***/
  },

  /***/
  "./src/app/app.component.ts":
  /*!**********************************!*\
    !*** ./src/app/app.component.ts ***!
    \**********************************/

  /*! exports provided: AppComponent */

  /***/
  function srcAppAppComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AppComponent", function () {
      return AppComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _services_anthentication_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./services/anthentication.service */
    "./src/app/services/anthentication.service.ts");

    var AppComponent = /*#__PURE__*/function () {
      function AppComponent(authService, router) {
        _classCallCheck(this, AppComponent);

        this.authService = authService;
        this.router = router;
        this.title = 'hacknews';
      }

      _createClass(AppComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {
          this.router.navigate(['home']);
        }
      }, {
        key: "loggedIn",
        value: function loggedIn() {
          if (this.authService.isLoggedIn == true) return true;else return false;
        }
      }, {
        key: "logout",
        value: function logout() {
          this.authService.accessToken = null;
          this.authService.loggedIn = false;
        }
      }, {
        key: "home",
        value: function home() {
          this.router.navigate(['home']);
        }
      }]);

      return AppComponent;
    }();

    AppComponent.ctorParameters = function () {
      return [{
        type: _services_anthentication_service__WEBPACK_IMPORTED_MODULE_3__["AnthenticationService"]
      }, {
        type: _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]
      }];
    };

    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: 'app-root',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./app.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/app.component.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./app.component.css */
      "./src/app/app.component.css"))["default"]]
    })], AppComponent);
    /***/
  },

  /***/
  "./src/app/app.module.ts":
  /*!*******************************!*\
    !*** ./src/app/app.module.ts ***!
    \*******************************/

  /*! exports provided: AppModule */

  /***/
  function srcAppAppModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AppModule", function () {
      return AppModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/platform-browser */
    "./node_modules/@angular/platform-browser/fesm2015/platform-browser.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");
    /* harmony import */


    var _app_routing_module__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ./app-routing.module */
    "./src/app/app-routing.module.ts");
    /* harmony import */


    var _app_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! ./app.component */
    "./src/app/app.component.ts");
    /* harmony import */


    var _login_login_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./login/login.component */
    "./src/app/login/login.component.ts");
    /* harmony import */


    var _signup_signup_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(
    /*! ./signup/signup.component */
    "./src/app/signup/signup.component.ts");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/fesm2015/forms.js");
    /* harmony import */


    var _home_home_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(
    /*! ./home/home.component */
    "./src/app/home/home.component.ts");
    /* harmony import */


    var _createchallenge_createchallenge_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(
    /*! ./createchallenge/createchallenge.component */
    "./src/app/createchallenge/createchallenge.component.ts");

    var AppModule = function AppModule() {
      _classCallCheck(this, AppModule);
    };

    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["NgModule"])({
      declarations: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"], _login_login_component__WEBPACK_IMPORTED_MODULE_6__["LoginComponent"], _signup_signup_component__WEBPACK_IMPORTED_MODULE_7__["SignupComponent"], _home_home_component__WEBPACK_IMPORTED_MODULE_9__["HomeComponent"], _createchallenge_createchallenge_component__WEBPACK_IMPORTED_MODULE_10__["CreatechallengeComponent"]],
      imports: [_angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__["BrowserModule"], _app_routing_module__WEBPACK_IMPORTED_MODULE_4__["AppRoutingModule"], _angular_common_http__WEBPACK_IMPORTED_MODULE_3__["HttpClientModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_8__["FormsModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_8__["ReactiveFormsModule"]],
      providers: [],
      bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"]]
    })], AppModule);
    /***/
  },

  /***/
  "./src/app/createchallenge/createchallenge.component.css":
  /*!***************************************************************!*\
    !*** ./src/app/createchallenge/createchallenge.component.css ***!
    \***************************************************************/

  /*! exports provided: default */

  /***/
  function srcAppCreatechallengeCreatechallengeComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = ".buttonColor{\r\n    background-color: blue;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbImNyZWF0ZWNoYWxsZW5nZS9jcmVhdGVjaGFsbGVuZ2UuY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtJQUNJLHNCQUFzQjtBQUMxQiIsImZpbGUiOiJjcmVhdGVjaGFsbGVuZ2UvY3JlYXRlY2hhbGxlbmdlLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuYnV0dG9uQ29sb3J7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiBibHVlO1xyXG59Il19 */";
    /***/
  },

  /***/
  "./src/app/createchallenge/createchallenge.component.ts":
  /*!**************************************************************!*\
    !*** ./src/app/createchallenge/createchallenge.component.ts ***!
    \**************************************************************/

  /*! exports provided: CreatechallengeComponent */

  /***/
  function srcAppCreatechallengeCreatechallengeComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "CreatechallengeComponent", function () {
      return CreatechallengeComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/fesm2015/forms.js");
    /* harmony import */


    var _services_challenge_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ../services/challenge.service */
    "./src/app/services/challenge.service.ts");
    /* harmony import */


    var _services_anthentication_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ../services/anthentication.service */
    "./src/app/services/anthentication.service.ts");

    var CreatechallengeComponent = /*#__PURE__*/function () {
      function CreatechallengeComponent(formBuild, challengeservice, authservice) {
        _classCallCheck(this, CreatechallengeComponent);

        this.formBuild = formBuild;
        this.challengeservice = challengeservice;
        this.authservice = authservice;
        this.newChallengeAdded = false;
      }

      _createClass(CreatechallengeComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {
          var _this = this;

          this.createChallengeForm = this.formBuild.group({
            challengename: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required]],
            descrption: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required]],
            tags: []
          });
          this.challengeservice.getalltags().subscribe(function (response) {
            _this.tagslist = response;
          });
          this.challengeservice.getuser(this.authservice.name).subscribe(function (response) {
            _this.user = response;
          });
        }
      }, {
        key: "createChallenge",
        value: function createChallenge(createChallengeForm) {
          var _this2 = this;

          var challenge = {
            "id": 0,
            "title": createChallengeForm.challengename,
            "description": createChallengeForm.descrption,
            "tags": {
              'id': createChallengeForm.tags.id,
              'name': createChallengeForm.tags.name
            },
            "user": this.user
          };
          this.challengeservice.createChallenge(challenge).subscribe(function (response) {
            //alert(response)
            _this2.newChallengeAdded = true;
            _this2.createErrorMessage = null;
          }, function (error) {
            _this2.createErrorMessage = error.message;

            if (error instanceof Error) {} else {}
          });
        }
      }, {
        key: "challengename",
        get: function get() {
          return this.createChallengeForm.get('challengename');
        }
      }, {
        key: "descrption",
        get: function get() {
          return this.createChallengeForm.get('descrption');
        }
      }, {
        key: "tags",
        get: function get() {
          return this.createChallengeForm.get('tags');
        }
      }]);

      return CreatechallengeComponent;
    }();

    CreatechallengeComponent.ctorParameters = function () {
      return [{
        type: _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormBuilder"]
      }, {
        type: _services_challenge_service__WEBPACK_IMPORTED_MODULE_3__["ChallengeService"]
      }, {
        type: _services_anthentication_service__WEBPACK_IMPORTED_MODULE_4__["AnthenticationService"]
      }];
    };

    CreatechallengeComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: 'app-createchallenge',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./createchallenge.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/createchallenge/createchallenge.component.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./createchallenge.component.css */
      "./src/app/createchallenge/createchallenge.component.css"))["default"]]
    })], CreatechallengeComponent);
    /***/
  },

  /***/
  "./src/app/home/home.component.css":
  /*!*****************************************!*\
    !*** ./src/app/home/home.component.css ***!
    \*****************************************/

  /*! exports provided: default */

  /***/
  function srcAppHomeHomeComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = ".material-icons.other_icon {\r\n\tline-height: 0.5;\r\n\tvertical-align: middle;\r\n}\r\n\r\n#white\r\n{\r\n\tcolor: white;\r\n}\r\n\r\n#grey-text\r\n{\r\n\tcolor: #a6a6a6;\t\r\n}\r\n\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbImhvbWUvaG9tZS5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0NBQ0MsZ0JBQWdCO0NBQ2hCLHNCQUFzQjtBQUN2Qjs7QUFFQTs7Q0FFQyxZQUFZO0FBQ2I7O0FBQ0E7O0NBRUMsY0FBYztBQUNmIiwiZmlsZSI6ImhvbWUvaG9tZS5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLm1hdGVyaWFsLWljb25zLm90aGVyX2ljb24ge1xyXG5cdGxpbmUtaGVpZ2h0OiAwLjU7XHJcblx0dmVydGljYWwtYWxpZ246IG1pZGRsZTtcclxufVxyXG5cclxuI3doaXRlXHJcbntcclxuXHRjb2xvcjogd2hpdGU7XHJcbn1cclxuI2dyZXktdGV4dFxyXG57XHJcblx0Y29sb3I6ICNhNmE2YTY7XHRcclxufVxyXG4iXX0= */";
    /***/
  },

  /***/
  "./src/app/home/home.component.ts":
  /*!****************************************!*\
    !*** ./src/app/home/home.component.ts ***!
    \****************************************/

  /*! exports provided: HomeComponent */

  /***/
  function srcAppHomeHomeComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "HomeComponent", function () {
      return HomeComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _services_anthentication_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! ../services/anthentication.service */
    "./src/app/services/anthentication.service.ts");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _services_challenge_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ../services/challenge.service */
    "./src/app/services/challenge.service.ts");

    var HomeComponent = /*#__PURE__*/function () {
      function HomeComponent(challenge, auth, router) {
        _classCallCheck(this, HomeComponent);

        this.challenge = challenge;
        this.auth = auth;
        this.router = router;
        this.loggedIn = true;
        this.mychallenge = false;
        this.loggedforvoting = true;
        this.loggedforcontribute = true;
        this.upvoted = false;
        this.contributed = false;
      }

      _createClass(HomeComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {
          var _this3 = this;

          this.challenge.getalltags().subscribe(function (response) {
            _this3.tagslist = response; //alert(JSON.stringify(this.tagslist))
          });
          this.challenge.getallchallenges().subscribe(function (response) {
            _this3.challengelist = response; // alert(JSON.stringify(this.challengelist))
          }, function (error) {
            if (error instanceof Error) {} else {}
          });
        }
      }, {
        key: "creatChallenge",
        value: function creatChallenge() {
          if (this.auth.isLoggedIn) {
            this.router.navigate(['create']);
          } else {
            this.loggedIn = false;
            this.router.navigate(['home']);
          }
        }
      }, {
        key: "upvote",
        value: function upvote(id) {
          if (this.auth.isLoggedIn) {
            this.challenge.upvote(id).subscribe(function (response) {}, function (error) {});
          } else {
            this.loggedforvoting = false;
            this.router.navigate(['home']);
          }
        }
      }, {
        key: "contribute",
        value: function contribute(id) {
          var _this4 = this;

          if (this.auth.isLoggedIn) {
            this.challenge.contribute(this.auth.name, id).subscribe(function (response) {
              _this4.contributed = true;
              _this4.ErrorMessage = null;
            }, function (error) {
              _this4.ErrorMessage = error.message;
            });
          } else {
            this.loggedforcontribute = false;
            this.router.navigate(['home']);
          }
        }
      }, {
        key: "myChallenge",
        value: function myChallenge() {
          var _this5 = this;

          this.mychallenge = true;
          this.challenge.myChallenge(this.auth.name).subscribe(function (response) {
            _this5.contributelist = response; // alert(JSON.stringify(this.contributelist))
          }, function (error) {});
        }
      }, {
        key: "filterSelected",
        value: function filterSelected(selectedValue) {
          var _this6 = this;

          this.challenge.getfilteredchallenges(selectedValue).subscribe(function (response) {
            _this6.challengelist = response; //  alert(JSON.stringify(this.challengelist))
          }, function (error) {
            if (error instanceof Error) {} else {}
          });
        }
      }, {
        key: "sortbydate",
        value: function sortbydate() {
          var _this7 = this;

          this.challenge.sortbydate().subscribe(function (response) {
            _this7.challengelist = response; // alert(JSON.stringify(this.challengelist))
          }, function (error) {
            if (error instanceof Error) {} else {}
          });
        }
      }, {
        key: "challenges",
        value: function challenges() {
          this.ngOnInit();
        }
      }]);

      return HomeComponent;
    }();

    HomeComponent.ctorParameters = function () {
      return [{
        type: _services_challenge_service__WEBPACK_IMPORTED_MODULE_4__["ChallengeService"]
      }, {
        type: _services_anthentication_service__WEBPACK_IMPORTED_MODULE_2__["AnthenticationService"]
      }, {
        type: _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"]
      }];
    };

    HomeComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: 'app-home',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./home.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/home/home.component.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./home.component.css */
      "./src/app/home/home.component.css"))["default"]]
    })], HomeComponent);
    /***/
  },

  /***/
  "./src/app/login/login.component.css":
  /*!*******************************************!*\
    !*** ./src/app/login/login.component.css ***!
    \*******************************************/

  /*! exports provided: default */

  /***/
  function srcAppLoginLoginComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "\r\n.buttonColor{\r\n    background-color: blue;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbImxvZ2luL2xvZ2luLmNvbXBvbmVudC5jc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IjtBQUNBO0lBQ0ksc0JBQXNCO0FBQzFCIiwiZmlsZSI6ImxvZ2luL2xvZ2luLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyJcclxuLmJ1dHRvbkNvbG9ye1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogYmx1ZTtcclxufSJdfQ== */";
    /***/
  },

  /***/
  "./src/app/login/login.component.ts":
  /*!******************************************!*\
    !*** ./src/app/login/login.component.ts ***!
    \******************************************/

  /*! exports provided: LoginComponent */

  /***/
  function srcAppLoginLoginComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "LoginComponent", function () {
      return LoginComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/fesm2015/forms.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _services_anthentication_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ../services/anthentication.service */
    "./src/app/services/anthentication.service.ts");

    var LoginComponent = /*#__PURE__*/function () {
      function LoginComponent(formBuild, authService, router) {
        _classCallCheck(this, LoginComponent);

        this.formBuild = formBuild;
        this.authService = authService;
        this.router = router;
        this.isType = true;
      }

      _createClass(LoginComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {
          this.loginForm = this.formBuild.group({
            empid: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].pattern("^[0-9]*$")]],
            password: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required]]
          });
        }
      }, {
        key: "toSignup",
        value: function toSignup() {
          this.router.navigate(['signup']);
        }
      }, {
        key: "empid",
        get: function get() {
          return this.loginForm.get('empid');
        }
      }, {
        key: "password",
        get: function get() {
          return this.loginForm.get('password');
        }
      }]);

      return LoginComponent;
    }();

    LoginComponent.ctorParameters = function () {
      return [{
        type: _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormBuilder"]
      }, {
        type: _services_anthentication_service__WEBPACK_IMPORTED_MODULE_4__["AnthenticationService"]
      }, {
        type: _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"]
      }];
    };

    LoginComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: 'app-login',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./login.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/login/login.component.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./login.component.css */
      "./src/app/login/login.component.css"))["default"]]
    })], LoginComponent);
    /***/
  },

  /***/
  "./src/app/services/anthentication.service.ts":
  /*!****************************************************!*\
    !*** ./src/app/services/anthentication.service.ts ***!
    \****************************************************/

  /*! exports provided: AnthenticationService */

  /***/
  function srcAppServicesAnthenticationServiceTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AnthenticationService", function () {
      return AnthenticationService;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var src_environments_environment__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! src/environments/environment */
    "./src/environments/environment.ts");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");

    var AnthenticationService = /*#__PURE__*/function () {
      function AnthenticationService(router, httpClient) {
        _classCallCheck(this, AnthenticationService);

        this.router = router;
        this.httpClient = httpClient;
        this.loggedInUser = {
          loggedOut: true
        };
        this.validCredentials = false;
        this.redirectUrl = '/';
        this.loggedIn = false;
        this.authUrl = src_environments_environment__WEBPACK_IMPORTED_MODULE_2__["environment"].authUrl;
        this.isLoggedInValid = false;
      }

      _createClass(AnthenticationService, [{
        key: "authenticateUser",
        value: function authenticateUser(user) {
          var _this8 = this;

          this.isLoggedIn = true;
          this.suffix = "u";
          this.authenticateSpring(user.empid, user.password).subscribe(function (data) {
            _this8.username = user.empid;
            _this8.loggedInUser = user;
            _this8.validCredentials = true;
            _this8.loggedIn = true; //this.setToken(data.token);

            localStorage.setItem("token", data.token);
            _this8.name = user.empid;

            if (data.role == "ROLE_u") {
              _this8.router.navigate(['home']);
            } else {
              _this8.router.navigate(['login']);
            }
          }, function (error) {
            _this8.validCredentials = false;
            _this8.isLoggedInValid = true;
            _this8.error = error.error.message;

            if (error.error.errors != null) {
              _this8.error = error.error.errors[0];
            }
          });
        }
      }, {
        key: "setToken",
        value: function setToken(token) {
          this.token = token;
        }
      }, {
        key: "getToken",
        value: function getToken() {
          return this.token;
        }
      }, {
        key: "authenticateSpring",
        value: function authenticateSpring(user, password) {
          var newUser = user + this.suffix;
          var credentials = btoa(newUser + ':' + password);
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Basic ' + credentials);
          return this.httpClient.get(this.authUrl, {
            headers: headers
          });
        }
      }]);

      return AnthenticationService;
    }();

    AnthenticationService.ctorParameters = function () {
      return [{
        type: _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"]
      }, {
        type: _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClient"]
      }];
    };

    AnthenticationService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
      providedIn: 'root'
    })], AnthenticationService);
    /***/
  },

  /***/
  "./src/app/services/challenge.service.ts":
  /*!***********************************************!*\
    !*** ./src/app/services/challenge.service.ts ***!
    \***********************************************/

  /*! exports provided: ChallengeService */

  /***/
  function srcAppServicesChallengeServiceTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "ChallengeService", function () {
      return ChallengeService;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");
    /* harmony import */


    var _anthentication_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./anthentication.service */
    "./src/app/services/anthentication.service.ts");
    /* harmony import */


    var src_environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! src/environments/environment */
    "./src/environments/environment.ts");

    var ChallengeService = /*#__PURE__*/function () {
      function ChallengeService(_httpClient, _authService) {
        _classCallCheck(this, ChallengeService);

        this._httpClient = _httpClient;
        this._authService = _authService;
        this.challenge = src_environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].challenge;
      }

      _createClass(ChallengeService, [{
        key: "getallchallenges",
        value: function getallchallenges() {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.get(this.challenge + "/all", {
            headers: headers
          });
        }
      }, {
        key: "createChallenge",
        value: function createChallenge(challenge) {
          // alert(JSON.stringify(challenge))
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); // alert(JSON.stringify(headers));

          return this._httpClient.post(this.challenge + "/create", challenge, {
            headers: headers
          });
        }
      }, {
        key: "getuser",
        value: function getuser(user) {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.get(this.challenge + "/user/" + user, {
            headers: headers
          });
        }
      }, {
        key: "upvote",
        value: function upvote(id) {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.put(this.challenge + "/upvote/" + id, {
            headers: headers
          });
        }
      }, {
        key: "contribute",
        value: function contribute(name, id) {
          alert(name + id);
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.post(this.challenge + "/contribute/" + id + "/" + name, {
            headers: headers
          });
        }
      }, {
        key: "getalltags",
        value: function getalltags() {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.get(this.challenge + "/tags", {
            headers: headers
          });
        }
      }, {
        key: "getfilteredchallenges",
        value: function getfilteredchallenges(id) {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.get(this.challenge + "/tags/" + id, {
            headers: headers
          });
        }
      }, {
        key: "myChallenge",
        value: function myChallenge(id) {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.get(this.challenge + "/mychallenges/" + id, {
            headers: headers
          });
        }
      }, {
        key: "sortbydate",
        value: function sortbydate() {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken()); //alert(JSON.stringify(headers));

          return this._httpClient.get(this.challenge + "/recent", {
            headers: headers
          });
        }
      }]);

      return ChallengeService;
    }();

    ChallengeService.ctorParameters = function () {
      return [{
        type: _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]
      }, {
        type: _anthentication_service__WEBPACK_IMPORTED_MODULE_3__["AnthenticationService"]
      }];
    };

    ChallengeService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
      providedIn: 'root'
    })], ChallengeService);
    /***/
  },

  /***/
  "./src/app/services/employee.service.ts":
  /*!**********************************************!*\
    !*** ./src/app/services/employee.service.ts ***!
    \**********************************************/

  /*! exports provided: EmployeeService */

  /***/
  function srcAppServicesEmployeeServiceTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "EmployeeService", function () {
      return EmployeeService;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");
    /* harmony import */


    var _anthentication_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./anthentication.service */
    "./src/app/services/anthentication.service.ts");
    /* harmony import */


    var rxjs__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! rxjs */
    "./node_modules/rxjs/_esm2015/index.js");
    /* harmony import */


    var src_environments_environment__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! src/environments/environment */
    "./src/environments/environment.ts");

    var EmployeeService = /*#__PURE__*/function () {
      function EmployeeService(_httpClient, _authService) {
        _classCallCheck(this, EmployeeService);

        this._httpClient = _httpClient;
        this._authService = _authService;
        this.subject = new rxjs__WEBPACK_IMPORTED_MODULE_4__["Subject"]();
        this.adduserUrl = src_environments_environment__WEBPACK_IMPORTED_MODULE_5__["environment"].add;
      }

      _createClass(EmployeeService, [{
        key: "EmployeeSignUp",
        value: function EmployeeSignUp(userSignUpData) {
          var headers = new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]();
          headers = headers.set('Authorization', 'Bearer ' + this._authService.getToken());
          return this._httpClient.post(this.adduserUrl, userSignUpData, {
            headers: headers
          });
        }
      }]);

      return EmployeeService;
    }();

    EmployeeService.ctorParameters = function () {
      return [{
        type: _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]
      }, {
        type: _anthentication_service__WEBPACK_IMPORTED_MODULE_3__["AnthenticationService"]
      }];
    };

    EmployeeService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
      providedIn: 'root'
    })], EmployeeService);
    /***/
  },

  /***/
  "./src/app/signup/signup.component.css":
  /*!*********************************************!*\
    !*** ./src/app/signup/signup.component.css ***!
    \*********************************************/

  /*! exports provided: default */

  /***/
  function srcAppSignupSignupComponentCss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = ".buttonColor{\r\n    background-color: blue;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNpZ251cC9zaWdudXAuY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtJQUNJLHNCQUFzQjtBQUMxQiIsImZpbGUiOiJzaWdudXAvc2lnbnVwLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuYnV0dG9uQ29sb3J7XHJcbiAgICBiYWNrZ3JvdW5kLWNvbG9yOiBibHVlO1xyXG59Il19 */";
    /***/
  },

  /***/
  "./src/app/signup/signup.component.ts":
  /*!********************************************!*\
    !*** ./src/app/signup/signup.component.ts ***!
    \********************************************/

  /*! exports provided: SignupComponent */

  /***/
  function srcAppSignupSignupComponentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "SignupComponent", function () {
      return SignupComponent;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/fesm2015/forms.js");
    /* harmony import */


    var _services_anthentication_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ../services/anthentication.service */
    "./src/app/services/anthentication.service.ts");
    /* harmony import */


    var _services_employee_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ../services/employee.service */
    "./src/app/services/employee.service.ts");

    var SignupComponent = /*#__PURE__*/function () {
      function SignupComponent(formBuilder, _authService, _userService) {
        _classCallCheck(this, SignupComponent);

        this.formBuilder = formBuilder;
        this._authService = _authService;
        this._userService = _userService;
        this.userAdded = false;
        this.newUserAdded = true;
      }

      _createClass(SignupComponent, [{
        key: "ngOnInit",
        value: function ngOnInit() {
          this.signUpForm = this.formBuilder.group({
            empid: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].pattern("^[0-9]*$")]],
            useremail: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].pattern("[^ @]*@[^ @]*")]],
            firstname: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required]],
            lastname: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required]],
            password: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].maxLength(50)]],
            confirmPassword: ['', [_angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required, this.matchConfirmPassword.bind(this)]]
          });
        }
      }, {
        key: "matchConfirmPassword",
        value: function matchConfirmPassword(formControl) {
          if (this.signUpForm) {
            if (formControl.value && formControl.value.length > 0 && formControl.value !== this.signUpForm.get('password').value) {
              return {
                'nomatch': true
              };
            }
          }

          return null;
        }
      }, {
        key: "addUser",
        value: function addUser(signUpForm) {
          var _this9 = this;

          var user = {
            "id": signUpForm.empid,
            "userName": signUpForm.useremail,
            "firstName": signUpForm.firstname,
            "lastName": signUpForm.lastname,
            "password": signUpForm.password
          };

          this._userService.EmployeeSignUp(user).subscribe(function (response) {
            _this9.newUserAdded = false;
            _this9.userAdded = true;
            _this9.signupErrorMessage = null;
          }, function (error) {
            _this9.newUserAdded = true;
            _this9.signupErrorMessage = error.message;

            if (error instanceof Error) {} else {}
          });
        }
      }, {
        key: "empid",
        get: function get() {
          return this.signUpForm.get('empid');
        }
      }, {
        key: "useremail",
        get: function get() {
          return this.signUpForm.get('useremail');
        }
      }, {
        key: "firstname",
        get: function get() {
          return this.signUpForm.get('firstname');
        }
      }, {
        key: "lastname",
        get: function get() {
          return this.signUpForm.get('lastname');
        }
      }, {
        key: "password",
        get: function get() {
          return this.signUpForm.get('password');
        }
      }, {
        key: "confirmPassword",
        get: function get() {
          return this.signUpForm.get('confirmPassword');
        }
      }, {
        key: "schoolname",
        get: function get() {
          return this.signUpForm.get('schoolname');
        }
      }]);

      return SignupComponent;
    }();

    SignupComponent.ctorParameters = function () {
      return [{
        type: _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormBuilder"]
      }, {
        type: _services_anthentication_service__WEBPACK_IMPORTED_MODULE_3__["AnthenticationService"]
      }, {
        type: _services_employee_service__WEBPACK_IMPORTED_MODULE_4__["EmployeeService"]
      }];
    };

    SignupComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
      selector: 'app-signup',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./signup.component.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/signup/signup.component.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./signup.component.css */
      "./src/app/signup/signup.component.css"))["default"]]
    })], SignupComponent);
    /***/
  },

  /***/
  "./src/environments/environment.ts":
  /*!*****************************************!*\
    !*** ./src/environments/environment.ts ***!
    \*****************************************/

  /*! exports provided: environment */

  /***/
  function srcEnvironmentsEnvironmentTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "environment", function () {
      return environment;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js"); // This file can be replaced during build by using the `fileReplacements` array.
    // `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
    // The list of file replacements can be found in `angular.json`.


    var environment = {
      production: false,
      authUrl: 'http://localhost:9091/authenticate',
      add: 'http://localhost:9091/signup/addemployee',
      challenge: 'http://localhost:9091/challenge'
    };
    /*
     * For easier debugging in development mode, you can import the following file
     * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
     *
     * This import should be commented out in production mode because it will have a negative impact
     * on performance if an error is thrown.
     */
    // import 'zone.js/dist/zone-error';  // Included with Angular CLI.

    /***/
  },

  /***/
  "./src/main.ts":
  /*!*********************!*\
    !*** ./src/main.ts ***!
    \*********************/

  /*! no exports provided */

  /***/
  function srcMainTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/platform-browser-dynamic */
    "./node_modules/@angular/platform-browser-dynamic/fesm2015/platform-browser-dynamic.js");
    /* harmony import */


    var _app_app_module__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./app/app.module */
    "./src/app/app.module.ts");
    /* harmony import */


    var _environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! ./environments/environment */
    "./src/environments/environment.ts");

    if (_environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].production) {
      Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["enableProdMode"])();
    }

    Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_2__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_3__["AppModule"])["catch"](function (err) {
      return console.error(err);
    });
    /***/
  },

  /***/
  0:
  /*!***************************!*\
    !*** multi ./src/main.ts ***!
    \***************************/

  /*! no static exports found */

  /***/
  function _(module, exports, __webpack_require__) {
    module.exports = __webpack_require__(
    /*! F:\interviews\Hack News\hacknews\src\main.ts */
    "./src/main.ts");
    /***/
  }
}, [[0, "runtime", "vendor"]]]);
//# sourceMappingURL=main-es5.js.map