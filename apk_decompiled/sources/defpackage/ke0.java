package defpackage;

import android.app.Notification;
import android.app.Person;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.text.PrecomputedText;
import android.text.style.TypefaceSpan;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ke0 {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static TypefaceSpan b(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    public static uzc c(Person person) {
        IconCompat iconCompatJ;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompatJ = ltk.j(icon);
        } else {
            iconCompatJ = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        uzc uzcVar = new uzc();
        uzcVar.a = name;
        uzcVar.b = iconCompatJ;
        uzcVar.c = uri;
        uzcVar.d = key;
        uzcVar.e = zIsBot;
        uzcVar.f = zIsImportant;
        return uzcVar;
    }

    public static String[] d(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long e(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor f(Context context) {
        return context.getMainExecutor();
    }

    public static void g(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static int h(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String i(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int j(Notification.Action action) {
        return action.getSemanticAction();
    }

    public static PrecomputedText.Params k(ji0 ji0Var) {
        return ji0Var.getTextMetricsParams();
    }

    public static int l(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri m(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void n(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void o(Notification.Action.Builder builder, int i) {
        builder.setSemanticAction(i);
    }

    public static boolean p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Person q(uzc uzcVar) {
        Person.Builder name = new Person.Builder().setName(uzcVar.a);
        IconCompat iconCompat = uzcVar.b;
        return name.setIcon(iconCompat != null ? iconCompat.f(null) : null).setUri(uzcVar.c).setKey(uzcVar.d).setBot(uzcVar.e).setImportant(uzcVar.f).build();
    }
}
