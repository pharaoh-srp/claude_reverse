package kotlinx.serialization;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.vb7;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
public final class MissingFieldException extends SerializationException {
    public final List E;
    public final String F;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(String str, ArrayList arrayList) {
        String strT;
        str.getClass();
        if (arrayList.size() == 1) {
            strT = vb7.t(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strT = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(strT, null, arrayList, str);
    }

    public MissingFieldException(String str, MissingFieldException missingFieldException, List list, String str2) {
        super(str, missingFieldException);
        this.E = list;
        this.F = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String str2) {
        this(ij0.l("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, x44.W(str), str2);
        str2.getClass();
    }
}
