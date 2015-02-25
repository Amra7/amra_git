package controllers;

import models.*;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	static Form<Task> submitForm = new Form<Task>(Task.class);

	public static Result index() {
		// ok je status 200 od index.scala.html
		return ok(index.render("Welcome to ToDo.", submitForm, Task.all()));
	}

	public static Result createTask() {
		Form<Task> bindForm = submitForm.bindFromRequest();
		// submitForm.discardErrors();
		if (bindForm.hasErrors() == false) {
			Task.create(bindForm.get());
			submitForm = new Form<Task>(Task.class);
			return redirect("/");
		}
		return ok(index.render("Welcome to ToDo.", bindForm, Task.all()));
		// Task.create(submitForm.bindFromRequest().get());
		// Task.create(submitForm.bindFromRequest().field(arg0));
		// return index();
	}

	public static Result deleteTask(int id) {
		
//		return ok(del.render(id));
		Task.remove(id);
		return redirect("/");
	}
	
	public static Result deleteTask(){
		return TODO;
	}
}
