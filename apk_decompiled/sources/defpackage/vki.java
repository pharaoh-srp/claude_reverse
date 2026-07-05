package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class vki extends ts9 implements zy7 {
    public final /* synthetic */ wki F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int H;
    public final /* synthetic */ String I;
    public final /* synthetic */ int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vki(wki wkiVar, String str, int i, String str2, int i2) {
        super(0);
        this.F = wkiVar;
        this.G = str;
        this.H = i;
        this.I = str2;
        this.J = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        wki wkiVar = this.F;
        Throwable th = wkiVar.c;
        int i = wkiVar.b;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbP = ij0.p("Batch ", this.G, this.H, " [", " bytes] (");
        sbP.append(this.I);
        sbP.append(")");
        sb.append(sbP.toString());
        if (wkiVar instanceof kki) {
            sb.append(" failed because of a DNS error");
        } else if (wkiVar instanceof lki) {
            sb.append(" failed because of a processing error or invalid data");
        } else if (wkiVar instanceof mki) {
            sb.append(" failed because of an intake rate limitation");
        } else if (wkiVar instanceof nki) {
            sb.append(" failed because of a server processing error");
        } else if (wkiVar instanceof oki) {
            sb.append(" failed because your token is invalid");
        } else if (wkiVar instanceof pki) {
            sb.append(" failed because of a network error");
        } else if (wkiVar instanceof qki) {
            sb.append(" failed because of an error when creating the request");
        } else if (wkiVar instanceof ski) {
            sb.append(" failed because of an unknown error");
        } else if (wkiVar instanceof tki) {
            sb.append(" failed because of an unexpected HTTP error (status code = " + i + ")");
        } else if (wkiVar instanceof uki) {
            sb.append(" status is unknown");
        } else if (wkiVar instanceof rki) {
            sb.append(" sent successfully.");
        }
        if (th != null) {
            sb.append(" (");
            sb.append(th.getClass().getName());
            sb.append(": ");
            sb.append(th.getMessage());
            sb.append(")");
        }
        if (wkiVar.a) {
            sb.append("; we will retry later.");
        } else if (!(wkiVar instanceof rki)) {
            sb.append("; the batch was dropped.");
        }
        if (wkiVar instanceof oki) {
            sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
        }
        sb.append(String.format(Locale.US, " This request was attempted %d time(s).", Arrays.copyOf(new Object[]{Integer.valueOf(this.J), Integer.valueOf(i)}, 2)));
        return sb.toString();
    }
}
