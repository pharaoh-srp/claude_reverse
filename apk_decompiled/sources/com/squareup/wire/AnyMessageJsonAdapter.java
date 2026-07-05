package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.moshi.JsonDataException;
import com.squareup.wire.AnyMessage;
import defpackage.bi9;
import defpackage.ci9;
import defpackage.ez1;
import defpackage.gg9;
import defpackage.jj9;
import defpackage.mdj;
import defpackage.pl9;
import defpackage.prb;
import defpackage.rl7;
import defpackage.sq6;
import defpackage.sz6;
import defpackage.x44;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u0006*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/squareup/wire/AnyMessageJsonAdapter;", "Lgg9;", "Lcom/squareup/wire/AnyMessage;", "Lprb;", "moshi", "", "", "Lcom/squareup/wire/ProtoAdapter;", "typeUrlToAdapter", "<init>", "(Lprb;Ljava/util/Map;)V", "Lci9;", "name", "readStringNamed", "(Lci9;Ljava/lang/String;)Ljava/lang/String;", "Ljj9;", "writer", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "toJson", "(Ljj9;Lcom/squareup/wire/AnyMessage;)V", "reader", "fromJson", "(Lci9;)Lcom/squareup/wire/AnyMessage;", "Lprb;", "Ljava/util/Map;", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class AnyMessageJsonAdapter extends gg9 {
    private final prb moshi;
    private final Map<String, ProtoAdapter<?>> typeUrlToAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public AnyMessageJsonAdapter(prb prbVar, Map<String, ? extends ProtoAdapter<?>> map) {
        prbVar.getClass();
        map.getClass();
        this.moshi = prbVar;
        this.typeUrlToAdapter = map;
    }

    private final String readStringNamed(ci9 ci9Var, String str) {
        ci9Var.beginObject();
        while (ci9Var.hasNext()) {
            if (x44.r(ci9Var.nextName(), str)) {
                return ci9Var.nextString();
            }
            ci9Var.skipValue();
        }
        return null;
    }

    @Override // defpackage.gg9
    public AnyMessage fromJson(ci9 reader) throws IOException {
        reader.getClass();
        if (reader.j() == bi9.M) {
            reader.f();
            return null;
        }
        ci9 ci9VarN = reader.n();
        try {
            String stringNamed = readStringNamed(ci9VarN, "@type");
            ci9VarN.close();
            if (stringNamed == null) {
                throw new JsonDataException("expected @type in ".concat(reader.c()));
            }
            ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(stringNamed);
            if (protoAdapter == null) {
                StringBuilder sbX = sq6.x("Cannot resolve type: ", stringNamed, " in ");
                sbX.append(reader.c());
                throw new JsonDataException(sbX.toString());
            }
            prb prbVar = this.moshi;
            pl9 type = protoAdapter.getType();
            type.getClass();
            Message<?, ?> message = (Message) prbVar.a(ez1.I(type)).fromJson(reader);
            AnyMessage.Companion companion = AnyMessage.INSTANCE;
            message.getClass();
            return companion.pack(message);
        } finally {
        }
    }

    @Override // defpackage.gg9
    public void toJson(jj9 writer, AnyMessage value) {
        writer.getClass();
        if (value == null) {
            writer.x();
            return;
        }
        writer.d();
        writer.n("@type");
        writer.r0(value.getTypeUrl());
        ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(value.getTypeUrl());
        if (protoAdapter == null) {
            rl7.l("Cannot find type for url: ", value.getTypeUrl(), " in ", writer.j());
            return;
        }
        prb prbVar = this.moshi;
        pl9 type = protoAdapter.getType();
        type.getClass();
        gg9 gg9VarA = prbVar.a(ez1.I(type));
        int iK = writer.K();
        if (iK != 5 && iK != 3 && iK != 2 && iK != 1) {
            sz6.j("Nesting problem.");
            return;
        }
        int i = writer.M;
        writer.M = writer.E;
        Object objUnpack = value.unpack(protoAdapter);
        objUnpack.getClass();
        gg9VarA.toJson(writer, (Message) objUnpack);
        writer.M = i;
        writer.i();
    }
}
