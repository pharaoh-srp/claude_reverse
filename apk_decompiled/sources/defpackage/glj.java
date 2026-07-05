package defpackage;

import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class glj {
    public static final zlj a = new zlj("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) {
        zlj zljVar = a;
        if (signatureArr == null || (signatureArr.length) == 0) {
            zljVar.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            String strC = xnk.c(signature.toByteArray());
            arrayList.add(strC);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strC)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strC)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        zljVar.b(ij0.j("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
        return false;
    }
}
