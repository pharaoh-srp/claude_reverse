package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import io.sentry.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class tvd extends a4 {
    public static final Parcelable.Creator<tvd> CREATOR = new gqj(10);
    public final wvd E;
    public final yvd F;
    public final byte[] G;
    public final List H;
    public final Double I;
    public final List J;
    public final e71 K;
    public final Integer L;
    public final ksh M;
    public final k31 N;
    public final x61 O;
    public final String P;
    public final ResultReceiver Q;

    public tvd(wvd wvdVar, yvd yvdVar, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, e71 e71Var, Integer num, ksh kshVar, String str, x61 x61Var, String str2, ResultReceiver resultReceiver) {
        this.Q = resultReceiver;
        if (str2 != null) {
            try {
                tvd tvdVarL0 = l0(new JSONObject(str2));
                this.E = tvdVarL0.E;
                this.F = tvdVarL0.F;
                this.G = tvdVarL0.G;
                this.H = tvdVarL0.H;
                this.I = tvdVarL0.I;
                this.J = tvdVarL0.J;
                this.K = tvdVarL0.K;
                this.L = tvdVarL0.L;
                this.M = tvdVarL0.M;
                this.N = tvdVarL0.N;
                this.O = tvdVarL0.O;
                this.P = str2;
                return;
            } catch (JSONException e) {
                e0.i(e);
                throw null;
            }
        }
        dgj.v(wvdVar);
        this.E = wvdVar;
        dgj.v(yvdVar);
        this.F = yvdVar;
        dgj.v(bArr);
        this.G = bArr;
        dgj.v(arrayList);
        this.H = arrayList;
        this.I = d;
        this.J = arrayList2;
        this.K = e71Var;
        this.L = num;
        this.M = kshVar;
        if (str != null) {
            try {
                this.N = k31.a(str);
            } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e2) {
                e0.i(e2);
                throw null;
            }
        } else {
            this.N = null;
        }
        this.O = x61Var;
        this.P = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tvd l0(org.json.JSONObject r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvd.l0(org.json.JSONObject):tvd");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof tvd)) {
            return false;
        }
        tvd tvdVar = (tvd) obj;
        List list2 = tvdVar.H;
        List list3 = tvdVar.J;
        if (gb9.v(this.E, tvdVar.E) && gb9.v(this.F, tvdVar.F) && Arrays.equals(this.G, tvdVar.G) && gb9.v(this.I, tvdVar.I)) {
            List list4 = this.H;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.J) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && gb9.v(this.K, tvdVar.K) && gb9.v(this.L, tvdVar.L) && gb9.v(this.M, tvdVar.M) && gb9.v(this.N, tvdVar.N) && gb9.v(this.O, tvdVar.O) && gb9.v(this.P, tvdVar.P))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.E, this.F, Integer.valueOf(Arrays.hashCode(this.G)), this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.E);
        String strValueOf2 = String.valueOf(this.F);
        String strR = fd9.R(this.G);
        String strValueOf3 = String.valueOf(this.H);
        String strValueOf4 = String.valueOf(this.J);
        String strValueOf5 = String.valueOf(this.K);
        String strValueOf6 = String.valueOf(this.M);
        String strValueOf7 = String.valueOf(this.N);
        String strValueOf8 = String.valueOf(this.O);
        StringBuilder sbR = kgh.r("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        kgh.u(sbR, strR, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbR.append(this.I);
        sbR.append(", \n excludeList=");
        sbR.append(strValueOf4);
        sbR.append(", \n authenticatorSelection=");
        sbR.append(strValueOf5);
        sbR.append(", \n requestId=");
        sbR.append(this.L);
        sbR.append(", \n tokenBinding=");
        sbR.append(strValueOf6);
        sbR.append(", \n attestationConveyancePreference=");
        return vb7.t(sbR, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 2, this.E, i);
        xn5.E0(parcel, 3, this.F, i);
        xn5.z0(parcel, 4, this.G);
        xn5.I0(parcel, 5, this.H);
        Double d = this.I;
        if (d != null) {
            xn5.J0(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        xn5.I0(parcel, 7, this.J);
        xn5.E0(parcel, 8, this.K, i);
        xn5.C0(parcel, 9, this.L);
        xn5.E0(parcel, 10, this.M, i);
        k31 k31Var = this.N;
        xn5.F0(parcel, 11, k31Var == null ? null : k31Var.E);
        xn5.E0(parcel, 12, this.O, i);
        xn5.F0(parcel, 13, this.P);
        xn5.E0(parcel, 14, this.Q, i);
        xn5.L0(parcel, iK0);
    }
}
