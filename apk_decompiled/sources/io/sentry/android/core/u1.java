package io.sentry.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.anthropic.claude.R;
import defpackage.u95;
import io.sentry.o5;
import io.sentry.r5;
import io.sentry.t4;
import io.sentry.t5;
import io.sentry.w6;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends AlertDialog {
    public boolean E;
    public io.sentry.protocol.w F;
    public DialogInterface.OnDismissListener G;
    public final o5 H;
    public p1 I;
    public t1 J;

    public u1(Context context) {
        Activity activity;
        super(context, 0);
        this.E = false;
        o5 feedbackOptions = t4.g().r().getFeedbackOptions();
        o5 o5Var = new o5();
        o5Var.a = false;
        o5Var.b = true;
        o5Var.c = false;
        o5Var.d = true;
        o5Var.e = true;
        o5Var.f = true;
        o5Var.g = false;
        o5Var.a = feedbackOptions.a;
        o5Var.b = feedbackOptions.b;
        o5Var.c = feedbackOptions.c;
        o5Var.d = feedbackOptions.d;
        o5Var.e = feedbackOptions.e;
        o5Var.f = feedbackOptions.f;
        o5Var.g = feedbackOptions.g;
        o5Var.h = feedbackOptions.h;
        this.H = o5Var;
        r5.d().a("UserFeedbackWidget");
        o5 feedbackOptions2 = t4.g().r().getFeedbackOptions();
        if (!o5Var.g || feedbackOptions2.g) {
            return;
        }
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return;
        }
        this.I = new p1(t4.g().r().getLogger());
        WeakReference weakReference = new WeakReference(activity);
        this.I.b(activity, new u95(this, 26, weakReference));
        Application application = activity.getApplication();
        t1 t1Var = new t1(this, weakReference);
        this.J = t1Var;
        application.registerActivityLifecycleCallbacks(t1Var);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        io.sentry.protocol.i0 i0VarS;
        super.onCreate(bundle);
        setContentView(R.layout.sentry_dialog_user_feedback);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        setCancelable(this.E);
        TextView textView = (TextView) findViewById(R.id.sentry_dialog_user_feedback_title);
        ImageView imageView = (ImageView) findViewById(R.id.sentry_dialog_user_feedback_logo);
        final TextView textView2 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_name);
        final EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_name);
        final TextView textView3 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_email);
        final EditText editText2 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_email);
        final TextView textView4 = (TextView) findViewById(R.id.sentry_dialog_user_feedback_txt_description);
        final EditText editText3 = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        Button button = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_send);
        Button button2 = (Button) findViewById(R.id.sentry_dialog_user_feedback_btn_cancel);
        final o5 o5Var = this.H;
        if (o5Var.f) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (o5Var.b || o5Var.a) {
            textView2.setVisibility(0);
            editText.setVisibility(0);
            textView2.setText("Name");
            editText.setHint("Your Name");
            if (o5Var.a) {
                textView2.append(" (Required)");
            }
        } else {
            textView2.setVisibility(8);
            editText.setVisibility(8);
        }
        if (o5Var.d || o5Var.c) {
            textView3.setVisibility(0);
            editText2.setVisibility(0);
            textView3.setText("Email");
            editText2.setHint("your.email@example.org");
            if (o5Var.c) {
                textView3.append(" (Required)");
            }
        } else {
            textView3.setVisibility(8);
            editText2.setVisibility(8);
        }
        if (o5Var.e && (i0VarS = t4.g().z().S()) != null) {
            editText.setText(i0VarS.G);
            editText2.setText(i0VarS.E);
        }
        textView4.setText("Description");
        textView4.append(" (Required)");
        editText3.setHint("What's the bug? What did you expect?");
        textView.setText("Report a Bug");
        button.setText("Send Bug Report");
        button.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText4 = editText;
                String strTrim = editText4.getText().toString().trim();
                EditText editText5 = editText2;
                String strTrim2 = editText5.getText().toString().trim();
                EditText editText6 = editText3;
                String strTrim3 = editText6.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                o5 o5Var2 = o5Var;
                if (zIsEmpty && o5Var2.a) {
                    editText4.setError(textView2.getText());
                    return;
                }
                if (strTrim2.isEmpty() && o5Var2.c) {
                    editText5.setError(textView3.getText());
                    return;
                }
                if (strTrim3.isEmpty()) {
                    editText6.setError(textView4.getText());
                    return;
                }
                io.sentry.protocol.k kVar = new io.sentry.protocol.k(strTrim3);
                kVar.G = strTrim;
                kVar.F = strTrim2;
                u1 u1Var = this.E;
                io.sentry.protocol.w wVar = u1Var.F;
                if (wVar != null) {
                    kVar.I = wVar;
                }
                if (t4.g().A().a(kVar).equals(io.sentry.protocol.w.F)) {
                    o5Var2.getClass();
                } else {
                    Context context = u1Var.getContext();
                    o5Var2.getClass();
                    Toast.makeText(context, "Thank you for your report!", 0).show();
                }
                u1Var.cancel();
            }
        });
        button2.setText("Cancel");
        button2.setOnClickListener(new View.OnClickListener() { // from class: io.sentry.android.core.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.E.cancel();
            }
        });
        setOnDismissListener(this.G);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        EditText editText = (EditText) findViewById(R.id.sentry_dialog_user_feedback_edt_description);
        editText.getText().clear();
        editText.setError(null);
        w6 w6VarR = t4.g().r();
        w6VarR.getFeedbackOptions().getClass();
        w6VarR.getReplayController().c(Boolean.FALSE);
        this.F = w6VarR.getReplayController().n();
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        this.E = z;
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.G = onDismissListener;
        final Runnable runnable = t4.g().r().getFeedbackOptions().h;
        if (runnable != null) {
            super.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io.sentry.android.core.s1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                    u1 u1Var = this.E;
                    u1Var.F = null;
                    DialogInterface.OnDismissListener onDismissListener2 = u1Var.G;
                    if (onDismissListener2 != null) {
                        onDismissListener2.onDismiss(dialogInterface);
                    }
                }
            });
        } else {
            super.setOnDismissListener(this.G);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        io.sentry.h1 h1VarG = t4.g();
        w6 w6VarR = h1VarG.r();
        if (h1VarG.isEnabled() && w6VarR.isEnabled()) {
            super.show();
        } else {
            w6VarR.getLogger().h(t5.WARNING, "Sentry is disabled. Feedback dialog won't be shown.", new Object[0]);
        }
    }
}
