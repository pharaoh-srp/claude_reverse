package com.anthropic.claude.conway;

import defpackage.bga;
import defpackage.cc;
import defpackage.fr4;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/conway/ConwayAppScreen;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Chat", "System", "Extension", "com/anthropic/claude/conway/b", "Lcom/anthropic/claude/conway/ConwayAppScreen$Chat;", "Lcom/anthropic/claude/conway/ConwayAppScreen$Extension;", "Lcom/anthropic/claude/conway/ConwayAppScreen$System;", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ConwayAppScreen extends bga {
    public static final b Companion = b.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/conway/ConwayAppScreen$Chat;", "Lcom/anthropic/claude/conway/ConwayAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "conway", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Chat implements ConwayAppScreen {
        public static final int $stable = 0;
        public static final Chat INSTANCE = new Chat();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new fr4(2));

        private Chat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.conway.ConwayAppScreen.Chat", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Chat);
        }

        @Override // com.anthropic.claude.conway.ConwayAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1590862234;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Chat";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/conway/ConwayAppScreen$System;", "Lcom/anthropic/claude/conway/ConwayAppScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "conway", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class System implements ConwayAppScreen {
        public static final int $stable = 0;
        public static final System INSTANCE = new System();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new fr4(3));

        private System() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.conway.ConwayAppScreen.System", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof System);
        }

        @Override // com.anthropic.claude.conway.ConwayAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 664056253;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "System";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lcom/anthropic/claude/conway/ConwayAppScreen$Extension;", "Lcom/anthropic/claude/conway/ConwayAppScreen;", "", "extensionName", "extensionDisplayName", "name", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/ConwayAppScreen$Extension;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/ConwayAppScreen$Extension;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExtensionName", "getExtensionDisplayName", "getName", "getUrl", "Companion", "com/anthropic/claude/conway/c", "com/anthropic/claude/conway/d", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Extension implements ConwayAppScreen {
        public static final int $stable = 0;
        public static final d Companion = new d();
        private final String extensionDisplayName;
        private final String extensionName;
        private final String name;
        private final String url;

        public /* synthetic */ Extension(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
            if (15 != (i & 15)) {
                gvj.f(i, 15, c.a.getDescriptor());
                throw null;
            }
            this.extensionName = str;
            this.extensionDisplayName = str2;
            this.name = str3;
            this.url = str4;
        }

        public static /* synthetic */ Extension copy$default(Extension extension, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = extension.extensionName;
            }
            if ((i & 2) != 0) {
                str2 = extension.extensionDisplayName;
            }
            if ((i & 4) != 0) {
                str3 = extension.name;
            }
            if ((i & 8) != 0) {
                str4 = extension.url;
            }
            return extension.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$conway(Extension self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.extensionName);
            output.q(serialDesc, 1, self.extensionDisplayName);
            output.q(serialDesc, 2, self.name);
            output.q(serialDesc, 3, self.url);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getExtensionName() {
            return this.extensionName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtensionDisplayName() {
            return this.extensionDisplayName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Extension copy(String extensionName, String extensionDisplayName, String name, String url) {
            extensionName.getClass();
            extensionDisplayName.getClass();
            name.getClass();
            url.getClass();
            return new Extension(extensionName, extensionDisplayName, name, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Extension)) {
                return false;
            }
            Extension extension = (Extension) other;
            return x44.r(this.extensionName, extension.extensionName) && x44.r(this.extensionDisplayName, extension.extensionDisplayName) && x44.r(this.name, extension.name) && x44.r(this.url, extension.url);
        }

        @Override // com.anthropic.claude.conway.ConwayAppScreen, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getExtensionDisplayName() {
            return this.extensionDisplayName;
        }

        public final String getExtensionName() {
            return this.extensionName;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + kgh.l(kgh.l(this.extensionName.hashCode() * 31, 31, this.extensionDisplayName), 31, this.name);
        }

        public String toString() {
            String str = this.extensionName;
            String str2 = this.extensionDisplayName;
            return vb7.t(kgh.r("Extension(extensionName=", str, ", extensionDisplayName=", str2, ", name="), this.name, ", url=", this.url, ")");
        }

        public Extension(String str, String str2, String str3, String str4) {
            ij0.z(str, str2, str3, str4);
            this.extensionName = str;
            this.extensionDisplayName = str2;
            this.name = str3;
            this.url = str4;
        }
    }
}
