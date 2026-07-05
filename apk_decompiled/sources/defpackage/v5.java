package defpackage;

import android.app.Person;
import android.os.Parcelable;
import android.view.DisplayCutout;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class v5 {
    public static /* bridge */ /* synthetic */ Person d(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout h(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ TextClassification.Request.Builder i(int i, int i2, CharSequence charSequence) {
        return new TextClassification.Request.Builder(charSequence, i, i2);
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
