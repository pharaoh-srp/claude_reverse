package kotlinx.serialization.modules;

import defpackage.mdj;
import defpackage.pl9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = mdj.f)
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(pl9 pl9Var, pl9 pl9Var2) {
        super("Serializer for " + pl9Var2 + " already registered in the scope of " + pl9Var);
        pl9Var.getClass();
        pl9Var2.getClass();
    }

    public SerializerAlreadyRegisteredException(String str) {
        super(str);
    }
}
