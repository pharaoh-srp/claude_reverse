package androidx.compose.runtime.tooling;

import defpackage.ad4;
import defpackage.b54;
import defpackage.bd4;
import defpackage.d8a;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mva;
import defpackage.w44;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class DiagnosticComposeException extends RuntimeException {
    public final ad4 E;

    public DiagnosticComposeException(ad4 ad4Var) {
        this.E = ad4Var;
        if (ad4Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = ad4Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            bd4 bd4Var = (bd4) list.get(i);
            if (!mp0.n0(bd4Var.a, iArr)) {
                if (bd4Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((bd4) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        b54.A0(arrayList);
                    }
                } else {
                    arrayList.add(bd4Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((bd4) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ad4 ad4Var = this.E;
        if (!ad4Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        d8a d8aVarE = x44.E();
        mva mvaVarD0 = w44.D0(ad4Var.a);
        int size = mvaVarD0.size();
        for (int i = 0; i < size; i++) {
            ((bd4) mvaVarD0.get(i)).getClass();
        }
        mva mvaVarD02 = w44.D0(x44.v(d8aVarE));
        int size2 = mvaVarD02.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) mvaVarD02.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
