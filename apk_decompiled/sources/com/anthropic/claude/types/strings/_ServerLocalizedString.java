package com.anthropic.claude.types.strings;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wkj;
import defpackage.x44;
import defpackage.xkj;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\r¨\u0006("}, d2 = {"Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "", "", "english", "translation", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "component2", "()Ljava/lang/String;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_types", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEnglish", "getLocalizedText", "localizedText", "Companion", "wkj", "xkj", "Claude:types"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class _ServerLocalizedString {
    public static final xkj Companion = new xkj();
    private final String english;
    private final String translation;

    public /* synthetic */ _ServerLocalizedString(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, wkj.a.getDescriptor());
            throw null;
        }
        this.english = str;
        this.translation = str2;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getTranslation() {
        return this.translation;
    }

    public static /* synthetic */ _ServerLocalizedString copy$default(_ServerLocalizedString _serverlocalizedstring, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = _serverlocalizedstring.english;
        }
        if ((i & 2) != 0) {
            str2 = _serverlocalizedstring.translation;
        }
        return _serverlocalizedstring.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Claude_types(_ServerLocalizedString self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.english);
        output.B(serialDesc, 1, srg.a, self.translation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEnglish() {
        return this.english;
    }

    public final _ServerLocalizedString copy(String english, String translation) {
        english.getClass();
        return new _ServerLocalizedString(english, translation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof _ServerLocalizedString)) {
            return false;
        }
        _ServerLocalizedString _serverlocalizedstring = (_ServerLocalizedString) other;
        return x44.r(this.english, _serverlocalizedstring.english) && x44.r(this.translation, _serverlocalizedstring.translation);
    }

    public final String getEnglish() {
        return this.english;
    }

    public final String getLocalizedText() {
        String str = this.translation;
        return str == null ? this.english : str;
    }

    public int hashCode() {
        int iHashCode = this.english.hashCode() * 31;
        String str = this.translation;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ij0.l("_ServerLocalizedString(english=", this.english, ", translation=", this.translation, ")");
    }

    public _ServerLocalizedString(String str, String str2) {
        str.getClass();
        this.english = str;
        this.translation = str2;
    }
}
