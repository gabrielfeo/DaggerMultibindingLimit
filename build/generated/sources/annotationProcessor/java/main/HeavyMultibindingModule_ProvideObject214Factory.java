import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject214Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject214Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject214(module);
  }

  public static HeavyMultibindingModule_ProvideObject214Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject214Factory(module);
  }

  public static Object provideObject214(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject214());
  }
}
