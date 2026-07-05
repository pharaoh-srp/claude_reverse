package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.anthropic.claude.api.experience.ExperienceToggle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class avj extends a4 implements Iterable {
    public static final Parcelable.Creator<avj> CREATOR = new gsc(9);
    public final Bundle E;

    public avj(Bundle bundle) {
        this.E = bundle;
    }

    public final String B0() {
        return this.E.getString("currency");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        mvj mvjVar = new mvj();
        mvjVar.E = this.E.keySet().iterator();
        return mvjVar;
    }

    public final Double l0() {
        return Double.valueOf(this.E.getDouble(ExperienceToggle.DEFAULT_PARAM_KEY));
    }

    public final String toString() {
        return this.E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.y0(parcel, 2, x0());
        xn5.L0(parcel, iK0);
    }

    public final Bundle x0() {
        return new Bundle(this.E);
    }
}
