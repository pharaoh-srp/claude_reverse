package com.anthropic.claude.api.account;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.EmailAddress;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.iab;
import defpackage.j7;
import defpackage.k7;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l7;
import defpackage.l8;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ok6;
import defpackage.onf;
import defpackage.sq6;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z7;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NOB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0019\u0010\u000e\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0019\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018By\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ#\u0010%\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b,\u0010-J\u009c\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u001b\b\u0002\u0010\u000e\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u001b\b\u0002\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b1\u0010\u001fJ\u0010\u00102\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00152\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bB\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bC\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bD\u0010\u001fR*\u0010\u000e\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010&R*\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bG\u0010&R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010+R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\b\u0016\u0010-¨\u0006P"}, d2 = {"Lcom/anthropic/claude/api/account/Account;", "", "Lcom/anthropic/claude/types/strings/AccountId;", "uuid", "Lcom/anthropic/claude/types/strings/EmailAddress;", "email_address", "", "full_name", "display_name", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "", "Lcom/anthropic/claude/api/account/Membership;", "memberships", "Lcom/anthropic/claude/api/account/AccountSettings;", "settings", "", "is_verified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lcom/anthropic/claude/api/account/AccountSettings;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lcom/anthropic/claude/api/account/AccountSettings;ZLvnf;Lmq5;)V", "component1-islZJdo", "()Ljava/lang/String;", "component1", "component2-ZiuLfiY", "component2", "component3", "component4", "component5", "()Ljava/util/Date;", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/anthropic/claude/api/account/AccountSettings;", "component9", "()Z", "copy-l0kCUe4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lcom/anthropic/claude/api/account/AccountSettings;Z)Lcom/anthropic/claude/api/account/Account;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/Account;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-islZJdo", "getEmail_address-ZiuLfiY", "getFull_name", "getDisplay_name", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "Ljava/util/List;", "getMemberships", "Lcom/anthropic/claude/api/account/AccountSettings;", "getSettings", "Z", "Companion", "k7", "l7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Account {
    public static final int $stable = 0;
    private final Date created_at;
    private final String display_name;
    private final String email_address;
    private final String full_name;
    private final boolean is_verified;
    private final List<Membership> memberships;
    private final AccountSettings settings;
    private final Date updated_at;
    private final String uuid;
    public static final l7 Companion = new l7();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new j7(0)), null, null};

    private /* synthetic */ Account(int i, String str, String str2, String str3, String str4, Date date, Date date2, List list, AccountSettings accountSettings, boolean z, vnf vnfVar) {
        if (371 != (i & 371)) {
            gvj.f(i, 371, k7.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.email_address = str2;
        if ((i & 4) == 0) {
            this.full_name = null;
        } else {
            this.full_name = str3;
        }
        if ((i & 8) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str4;
        }
        this.created_at = date;
        this.updated_at = date2;
        this.memberships = list;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.settings = null;
        } else {
            this.settings = accountSettings;
        }
        this.is_verified = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(iab.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-l0kCUe4$default, reason: not valid java name */
    public static /* synthetic */ Account m101copyl0kCUe4$default(Account account, String str, String str2, String str3, String str4, Date date, Date date2, List list, AccountSettings accountSettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = account.uuid;
        }
        if ((i & 2) != 0) {
            str2 = account.email_address;
        }
        if ((i & 4) != 0) {
            str3 = account.full_name;
        }
        if ((i & 8) != 0) {
            str4 = account.display_name;
        }
        if ((i & 16) != 0) {
            date = account.created_at;
        }
        if ((i & 32) != 0) {
            date2 = account.updated_at;
        }
        if ((i & 64) != 0) {
            list = account.memberships;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            accountSettings = account.settings;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            z = account.is_verified;
        }
        AccountSettings accountSettings2 = accountSettings;
        boolean z2 = z;
        Date date3 = date2;
        List list2 = list;
        Date date4 = date;
        String str5 = str3;
        return account.m104copyl0kCUe4(str, str2, str5, str4, date4, date3, list2, accountSettings2, z2);
    }

    public static final /* synthetic */ void write$Self$api(Account self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, z7.a, AccountId.m943boximpl(self.uuid));
        output.r(serialDesc, 1, ok6.a, EmailAddress.m1006boximpl(self.email_address));
        if (output.E(serialDesc) || self.full_name != null) {
            output.B(serialDesc, 2, srg.a, self.full_name);
        }
        if (output.E(serialDesc) || self.display_name != null) {
            output.B(serialDesc, 3, srg.a, self.display_name);
        }
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 4, bc9Var, self.created_at);
        output.r(serialDesc, 5, bc9Var, self.updated_at);
        output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.memberships);
        if (output.E(serialDesc) || self.settings != null) {
            output.B(serialDesc, 7, l8.a, self.settings);
        }
        output.p(serialDesc, 8, self.is_verified);
    }

    /* JADX INFO: renamed from: component1-islZJdo, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2-ZiuLfiY, reason: not valid java name and from getter */
    public final String getEmail_address() {
        return this.email_address;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFull_name() {
        return this.full_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final List<Membership> component7() {
        return this.memberships;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AccountSettings getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIs_verified() {
        return this.is_verified;
    }

    /* JADX INFO: renamed from: copy-l0kCUe4, reason: not valid java name */
    public final Account m104copyl0kCUe4(String uuid, String email_address, String full_name, String display_name, Date created_at, Date updated_at, List<Membership> memberships, AccountSettings settings, boolean is_verified) {
        uuid.getClass();
        email_address.getClass();
        created_at.getClass();
        updated_at.getClass();
        memberships.getClass();
        return new Account(uuid, email_address, full_name, display_name, created_at, updated_at, memberships, settings, is_verified, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Account)) {
            return false;
        }
        Account account = (Account) other;
        return AccountId.m946equalsimpl0(this.uuid, account.uuid) && EmailAddress.m1009equalsimpl0(this.email_address, account.email_address) && x44.r(this.full_name, account.full_name) && x44.r(this.display_name, account.display_name) && x44.r(this.created_at, account.created_at) && x44.r(this.updated_at, account.updated_at) && x44.r(this.memberships, account.memberships) && x44.r(this.settings, account.settings) && this.is_verified == account.is_verified;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: getEmail_address-ZiuLfiY, reason: not valid java name */
    public final String m105getEmail_addressZiuLfiY() {
        return this.email_address;
    }

    public final String getFull_name() {
        return this.full_name;
    }

    public final List<Membership> getMemberships() {
        return this.memberships;
    }

    public final AccountSettings getSettings() {
        return this.settings;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-islZJdo, reason: not valid java name */
    public final String m106getUuidislZJdo() {
        return this.uuid;
    }

    public int hashCode() {
        int iM1010hashCodeimpl = (EmailAddress.m1010hashCodeimpl(this.email_address) + (AccountId.m947hashCodeimpl(this.uuid) * 31)) * 31;
        String str = this.full_name;
        int iHashCode = (iM1010hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.display_name;
        int iM = kgh.m(ebh.j(this.updated_at, ebh.j(this.created_at, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.memberships);
        AccountSettings accountSettings = this.settings;
        return Boolean.hashCode(this.is_verified) + ((iM + (accountSettings != null ? accountSettings.hashCode() : 0)) * 31);
    }

    public final boolean is_verified() {
        return this.is_verified;
    }

    public String toString() {
        String strM948toStringimpl = AccountId.m948toStringimpl(this.uuid);
        String strM1012toStringimpl = EmailAddress.m1012toStringimpl(this.email_address);
        String str = this.full_name;
        String str2 = this.display_name;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        List<Membership> list = this.memberships;
        AccountSettings accountSettings = this.settings;
        boolean z = this.is_verified;
        StringBuilder sbR = kgh.r("Account(uuid=", strM948toStringimpl, ", email_address=", strM1012toStringimpl, ", full_name=");
        kgh.u(sbR, str, ", display_name=", str2, ", created_at=");
        sbR.append(date);
        sbR.append(", updated_at=");
        sbR.append(date2);
        sbR.append(", memberships=");
        sbR.append(list);
        sbR.append(", settings=");
        sbR.append(accountSettings);
        sbR.append(", is_verified=");
        return sq6.v(")", sbR, z);
    }

    public /* synthetic */ Account(String str, String str2, String str3, String str4, Date date, Date date2, List list, AccountSettings accountSettings, boolean z, mq5 mq5Var) {
        this(str, str2, str3, str4, date, date2, list, accountSettings, z);
    }

    public /* synthetic */ Account(int i, String str, String str2, String str3, String str4, Date date, Date date2, List list, AccountSettings accountSettings, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, date, date2, list, accountSettings, z, vnfVar);
    }

    private Account(String str, String str2, String str3, String str4, Date date, Date date2, List<Membership> list, AccountSettings accountSettings, boolean z) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        list.getClass();
        this.uuid = str;
        this.email_address = str2;
        this.full_name = str3;
        this.display_name = str4;
        this.created_at = date;
        this.updated_at = date2;
        this.memberships = list;
        this.settings = accountSettings;
        this.is_verified = z;
    }

    public /* synthetic */ Account(String str, String str2, String str3, String str4, Date date, Date date2, List list, AccountSettings accountSettings, boolean z, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, date, date2, list, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : accountSettings, z, null);
    }
}
