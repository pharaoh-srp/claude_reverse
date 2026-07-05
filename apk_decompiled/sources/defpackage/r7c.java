package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r7c extends f8c {
    public int e;
    public uzc f;
    public PendingIntent g;
    public PendingIntent h;
    public PendingIntent i;
    public boolean j;
    public Integer k;
    public Integer l;
    public IconCompat m;
    public CharSequence n;

    @Override // defpackage.f8c
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.e);
        bundle.putBoolean("android.callIsVideo", this.j);
        uzc uzcVar = this.f;
        if (uzcVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", p7c.b(ke0.q(uzcVar)));
            } else {
                bundle.putParcelable("android.callPersonCompat", uzcVar.b());
            }
        }
        IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", iconCompat.f(this.a.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.g);
        bundle.putParcelable("android.declineIntent", this.h);
        bundle.putParcelable("android.hangUpIntent", this.i);
        Integer num = this.k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // defpackage.f8c
    public final void b(c61 c61Var) {
        Notification.Builder builder = (Notification.Builder) c61Var.G;
        int i = Build.VERSION.SDK_INT;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i < 31) {
            uzc uzcVar = this.f;
            builder.setContentTitle(uzcVar != null ? uzcVar.a : null);
            Bundle bundle = this.a.r;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.a.r.getCharSequence("android.text");
            if (charSequence == null) {
                int i2 = this.e;
                if (i2 == 1) {
                    string = this.a.a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i2 == 2) {
                    string = this.a.a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i2 == 3) {
                    string = this.a.a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            uzc uzcVar2 = this.f;
            if (uzcVar2 != null) {
                IconCompat iconCompat = uzcVar2.b;
                if (iconCompat != null) {
                    builder.setLargeIcon(iconCompat.f(this.a.a));
                }
                uzc uzcVar3 = this.f;
                if (i >= 28) {
                    uzcVar3.getClass();
                    p7c.a(builder, ke0.q(uzcVar3));
                } else {
                    builder.addPerson(uzcVar3.c);
                }
            }
            builder.setCategory("call");
            return;
        }
        int i3 = this.e;
        if (i3 == 1) {
            uzc uzcVar4 = this.f;
            uzcVar4.getClass();
            callStyleA = q7c.a(ke0.q(uzcVar4), this.h, this.g);
        } else if (i3 == 2) {
            uzc uzcVar5 = this.f;
            uzcVar5.getClass();
            callStyleA = q7c.b(ke0.q(uzcVar5), this.i);
        } else if (i3 == 3) {
            uzc uzcVar6 = this.f;
            uzcVar6.getClass();
            callStyleA = q7c.c(ke0.q(uzcVar6), this.i, this.g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            String.valueOf(this.e);
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            Integer num = this.k;
            if (num != null) {
                q7c.d(callStyleA, num.intValue());
            }
            Integer num2 = this.l;
            if (num2 != null) {
                q7c.e(callStyleA, num2.intValue());
            }
            q7c.h(callStyleA, this.n);
            IconCompat iconCompat2 = this.m;
            if (iconCompat2 != null) {
                q7c.g(callStyleA, iconCompat2.f(this.a.a));
            }
            q7c.f(callStyleA, this.j);
        }
    }

    @Override // defpackage.f8c
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // defpackage.f8c
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.e = bundle.getInt("android.callType");
        this.j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f = ke0.c(v5.d(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f = uzc.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            Icon icon = (Icon) bundle.getParcelable("android.verificationIcon");
            PorterDuff.Mode mode = IconCompat.k;
            this.m = ltk.j(icon);
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final k7c e(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.a.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        k7c k7cVarA = new rw1(IconCompat.b(this.a.a, i), spannableStringBuilder, pendingIntent).a();
        k7cVarA.a.putBoolean("key_action_priority", true);
        return k7cVarA;
    }
}
