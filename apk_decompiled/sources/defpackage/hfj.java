package defpackage;

import com.squareup.wire.AnyMessage;
import com.squareup.wire.WireJsonAdapterFactory;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hfj implements fg9 {
    public final WireJsonAdapterFactory a = new WireJsonAdapterFactory(new ifj(), false, 2, null);

    @Override // defpackage.fg9
    public final gg9 create(Type type, Set set, prb prbVar) {
        type.getClass();
        if (!set.isEmpty()) {
            return null;
        }
        boolean zR = x44.r(wwk.m(type), AnyMessage.class);
        WireJsonAdapterFactory wireJsonAdapterFactory = this.a;
        if (!zR) {
            return wireJsonAdapterFactory.create(type, set, prbVar);
        }
        gg9 gg9VarCreate = wireJsonAdapterFactory.create(type, set, prbVar);
        if (gg9VarCreate != null) {
            return new be0(gg9VarCreate);
        }
        return null;
    }
}
