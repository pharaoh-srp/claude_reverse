package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.DisabledReason;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.nnf;
import defpackage.odf;
import defpackage.pl9;
import defpackage.w3c;
import defpackage.xg5;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a a = new a();
    public static final nnf b;

    static {
        kotlinx.serialization.modules.a aVar = new kotlinx.serialization.modules.a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(DisabledReason.class));
        w3cVar.e(kceVar.b(DisabledReason.SeatRestricted.class), DisabledReason.SeatRestricted.INSTANCE.serializer());
        w3cVar.e(kceVar.b(DisabledReason.UpgradeRequired.class), DisabledReason.UpgradeRequired.Companion.serializer());
        w3cVar.e(kceVar.b(DisabledReason.ModelDisabled.class), DisabledReason.ModelDisabled.Companion.serializer());
        w3cVar.e(kceVar.b(DisabledReason.Unknown.class), DisabledReason.Unknown.INSTANCE.serializer());
        w3cVar.b(new xg5(7));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.model.DisabledReason", kceVar.b(DisabledReason.class), new pl9[]{kceVar.b(DisabledReason.ModelDisabled.class), kceVar.b(DisabledReason.SeatRestricted.class), kceVar.b(DisabledReason.Unknown.class), kceVar.b(DisabledReason.UpgradeRequired.class)}, new KSerializer[]{b.a, new lq6("seat_restricted", DisabledReason.SeatRestricted.INSTANCE, new Annotation[]{new j()}), new lq6("unknown", DisabledReason.Unknown.INSTANCE, new Annotation[]{new j()}), d.a}, new Annotation[]{new j()});
    }
}
