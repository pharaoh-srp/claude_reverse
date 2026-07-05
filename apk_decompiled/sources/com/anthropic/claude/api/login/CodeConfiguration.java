package com.anthropic.claude.api.login;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ar3;
import defpackage.e79;
import defpackage.fq6;
import defpackage.gi3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oq5;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003,-.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/login/CodeConfiguration;", "", "Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;", "charset", "", "length", "show_input_after_delay", "<init>", "(Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/login/CodeConfiguration$CharSet;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/CodeConfiguration;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/api/login/CodeConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;", "getCharset", "Ljava/lang/Integer;", "getLength", "getShow_input_after_delay", "Companion", "CharSet", "com/anthropic/claude/api/login/b", "ar3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeConfiguration {
    public static final int $stable = 0;
    public static final ar3 Companion = new ar3();
    private final CharSet charset;
    private final Integer length;
    private final Integer show_input_after_delay;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "com/anthropic/claude/api/login/c", "NUMERIC", "ALPHANUMERIC", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf(with = a.class)
    public static final class CharSet {
        private static final /* synthetic */ fq6 $ENTRIES;
        private static final /* synthetic */ CharSet[] $VALUES;
        private static final kw9 $cachedKeepSerializer$delegate;
        public static final c Companion;
        private final String value;
        public static final CharSet NUMERIC = new CharSet("NUMERIC", 0, "numeric");
        public static final CharSet ALPHANUMERIC = new CharSet("ALPHANUMERIC", 1, "alphanumeric");

        private static final /* synthetic */ CharSet[] $values() {
            return new CharSet[]{NUMERIC, ALPHANUMERIC};
        }

        static {
            CharSet[] charSetArr$values = $values();
            $VALUES = charSetArr$values;
            $ENTRIES = wd6.n0(charSetArr$values);
            Companion = new c();
            $cachedKeepSerializer$delegate = yb5.w(w1a.F, new gi3(14));
        }

        private CharSet(String str, int i, String str2) {
            this.value = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return oq5.w("com.anthropic.claude.api.login.CodeConfiguration.CharSet", values(), new String[]{"numeric", "alphanumeric"}, new Annotation[][]{null, null});
        }

        public static fq6 getEntries() {
            return $ENTRIES;
        }

        public static CharSet valueOf(String str) {
            return (CharSet) Enum.valueOf(CharSet.class, str);
        }

        public static CharSet[] values() {
            return (CharSet[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public /* synthetic */ CodeConfiguration(int i, CharSet charSet, Integer num, Integer num2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.charset = null;
        } else {
            this.charset = charSet;
        }
        if ((i & 2) == 0) {
            this.length = null;
        } else {
            this.length = num;
        }
        if ((i & 4) == 0) {
            this.show_input_after_delay = null;
        } else {
            this.show_input_after_delay = num2;
        }
    }

    public static /* synthetic */ CodeConfiguration copy$default(CodeConfiguration codeConfiguration, CharSet charSet, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            charSet = codeConfiguration.charset;
        }
        if ((i & 2) != 0) {
            num = codeConfiguration.length;
        }
        if ((i & 4) != 0) {
            num2 = codeConfiguration.show_input_after_delay;
        }
        return codeConfiguration.copy(charSet, num, num2);
    }

    public static final /* synthetic */ void write$Self$api(CodeConfiguration self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.charset != null) {
            output.B(serialDesc, 0, a.d, self.charset);
        }
        if (output.E(serialDesc) || self.length != null) {
            output.B(serialDesc, 1, e79.a, self.length);
        }
        if (!output.E(serialDesc) && self.show_input_after_delay == null) {
            return;
        }
        output.B(serialDesc, 2, e79.a, self.show_input_after_delay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSet getCharset() {
        return this.charset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getShow_input_after_delay() {
        return this.show_input_after_delay;
    }

    public final CodeConfiguration copy(CharSet charset, Integer length, Integer show_input_after_delay) {
        return new CodeConfiguration(charset, length, show_input_after_delay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeConfiguration)) {
            return false;
        }
        CodeConfiguration codeConfiguration = (CodeConfiguration) other;
        return this.charset == codeConfiguration.charset && x44.r(this.length, codeConfiguration.length) && x44.r(this.show_input_after_delay, codeConfiguration.show_input_after_delay);
    }

    public final CharSet getCharset() {
        return this.charset;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getShow_input_after_delay() {
        return this.show_input_after_delay;
    }

    public int hashCode() {
        CharSet charSet = this.charset;
        int iHashCode = (charSet == null ? 0 : charSet.hashCode()) * 31;
        Integer num = this.length;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.show_input_after_delay;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "CodeConfiguration(charset=" + this.charset + ", length=" + this.length + ", show_input_after_delay=" + this.show_input_after_delay + ")";
    }

    public CodeConfiguration() {
        this((CharSet) null, (Integer) null, (Integer) null, 7, (mq5) null);
    }

    public CodeConfiguration(CharSet charSet, Integer num, Integer num2) {
        this.charset = charSet;
        this.length = num;
        this.show_input_after_delay = num2;
    }

    public /* synthetic */ CodeConfiguration(CharSet charSet, Integer num, Integer num2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : charSet, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
