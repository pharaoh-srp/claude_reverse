package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import defpackage.ai9;
import defpackage.ci9;
import defpackage.gg9;
import defpackage.iei;
import defpackage.jj9;
import defpackage.lca;
import defpackage.mdj;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005BE\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0005¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/squareup/wire/MessageJsonAdapter;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Lgg9;", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "messageAdapter", "", "", "jsonAdapters", "", "redactedFieldsAdapter", "<init>", "(Lcom/squareup/wire/internal/RuntimeMessageAdapter;Ljava/util/List;Lgg9;)V", "Ljj9;", "out", "message", "Liei;", "toJson", "(Ljj9;Lcom/squareup/wire/Message;)V", "Lci9;", "input", "fromJson", "(Lci9;)Lcom/squareup/wire/Message;", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "Ljava/util/List;", "Lgg9;", "jsonNames", "jsonAlternateNames", "Lai9;", "options", "Lai9;", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class MessageJsonAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends gg9 {
    private final List<gg9> jsonAdapters;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final RuntimeMessageAdapter<M, B> messageAdapter;
    private final ai9 options;
    private final gg9 redactedFieldsAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageJsonAdapter(RuntimeMessageAdapter<M, B> runtimeMessageAdapter, List<? extends gg9> list, gg9 gg9Var) {
        runtimeMessageAdapter.getClass();
        list.getClass();
        gg9Var.getClass();
        this.messageAdapter = runtimeMessageAdapter;
        this.jsonAdapters = list;
        this.redactedFieldsAdapter = gg9Var;
        List<String> jsonNames = runtimeMessageAdapter.getJsonNames();
        this.jsonNames = jsonNames;
        this.jsonAlternateNames = runtimeMessageAdapter.getJsonAlternateNames();
        ArrayList arrayList = new ArrayList();
        int size = jsonNames.size();
        for (int i = 0; i < size; i++) {
            String str = this.jsonNames.get(i);
            arrayList.add(str);
            String str2 = this.jsonAlternateNames.get(i);
            if (str2 == null) {
                str2 = str + (char) 0;
            }
            arrayList.add(str2);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.options = ai9.a((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei toJson$lambda$1(jj9 jj9Var, String str, Object obj, gg9 gg9Var) {
        str.getClass();
        gg9Var.getClass();
        jj9Var.n(str);
        gg9Var.toJson(jj9Var, obj);
        return iei.a;
    }

    @Override // defpackage.gg9
    public M fromJson(ci9 input) {
        input.getClass();
        B bNewBuilder = this.messageAdapter.newBuilder();
        input.beginObject();
        while (input.hasNext()) {
            int iK = input.K(this.options);
            if (iK == -1) {
                input.R();
                input.skipValue();
            } else {
                int i = iK / 2;
                Object objFromJson = this.jsonAdapters.get(i).fromJson(input);
                if (objFromJson != null) {
                    this.messageAdapter.getFieldBindingsArray()[i].set(bNewBuilder, objFromJson);
                }
            }
        }
        input.endObject();
        return (M) bNewBuilder.build();
    }

    @Override // defpackage.gg9
    public void toJson(jj9 out, M message) {
        out.getClass();
        LinkedHashMap linkedHashMap = out.N;
        RedactedTag redactedTag = (RedactedTag) (linkedHashMap == null ? null : linkedHashMap.get(RedactedTag.class));
        gg9 gg9Var = x44.r(redactedTag != null ? Boolean.valueOf(redactedTag.getEnabled()) : null, Boolean.TRUE) ? this.redactedFieldsAdapter : null;
        out.d();
        this.messageAdapter.writeAllFields(message, this.jsonAdapters, gg9Var, new lca(5, out));
        out.i();
    }
}
