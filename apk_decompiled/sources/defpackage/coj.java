package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class coj extends e88 {
    public static final nyj l = new nyj("Auth.Api.Identity.SignIn.API", new z89(6), new lz1(13));
    public final String k;

    public coj(Context context, roj rojVar) {
        super(context, l, rojVar, d88.c);
        this.k = eoj.a();
    }

    public static j6g d(Intent intent) throws ApiException {
        Status status = Status.K;
        if (intent == null) {
            throw new ApiException(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : ntk.c(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ApiException(Status.M);
        }
        if (!status2.l0()) {
            throw new ApiException(status2);
        }
        Parcelable.Creator<j6g> creator2 = j6g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        j6g j6gVar = (j6g) (byteArrayExtra2 != null ? ntk.c(byteArrayExtra2, creator2) : null);
        if (j6gVar != null) {
            return j6gVar;
        }
        throw new ApiException(status);
    }
}
