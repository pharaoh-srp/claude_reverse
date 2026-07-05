package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.moshi.JsonDataException;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.EnumJsonFormatter;
import defpackage.ci9;
import defpackage.gg9;
import defpackage.jj9;
import defpackage.mdj;
import defpackage.sq6;
import java.lang.Enum;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0012\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/EnumJsonAdapter;", "", "Lcom/squareup/wire/WireEnum;", "E", "Lgg9;", "Lcom/squareup/wire/internal/EnumJsonFormatter;", "enumJsonFormatter", "<init>", "(Lcom/squareup/wire/internal/EnumJsonFormatter;)V", "Ljj9;", "out", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "toJson", "(Ljj9;Ljava/lang/Enum;)V", "Lci9;", "input", "fromJson", "(Lci9;)Ljava/lang/Enum;", "Lcom/squareup/wire/internal/EnumJsonFormatter;", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class EnumJsonAdapter<E extends Enum<E> & WireEnum> extends gg9 {
    private final EnumJsonFormatter<E> enumJsonFormatter;

    public EnumJsonAdapter(EnumJsonFormatter<E> enumJsonFormatter) {
        enumJsonFormatter.getClass();
        this.enumJsonFormatter = enumJsonFormatter;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lci9;)TE; */
    @Override // defpackage.gg9
    public Enum fromJson(ci9 input) {
        input.getClass();
        String strNextString = input.nextString();
        EnumJsonFormatter<E> enumJsonFormatter = this.enumJsonFormatter;
        strNextString.getClass();
        Enum r3 = (Enum) enumJsonFormatter.fromString(strNextString);
        if (r3 != null) {
            return r3;
        }
        StringBuilder sbX = sq6.x("Unexpected ", strNextString, " at path ");
        sbX.append(input.c());
        throw new JsonDataException(sbX.toString());
    }

    /* JADX WARN: Incorrect types in method signature: (Ljj9;TE;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gg9
    public void toJson(jj9 out, Enum value) {
        out.getClass();
        if (value == 0) {
            out.x();
            return;
        }
        Object stringOrNumber = this.enumJsonFormatter.toStringOrNumber((WireEnum) value);
        if (stringOrNumber instanceof Number) {
            out.l0((Number) stringOrNumber);
        } else {
            out.r0(stringOrNumber.toString());
        }
    }
}
