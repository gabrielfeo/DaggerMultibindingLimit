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
public final class HeavyMultibindingModule_ProvideObject395Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject395Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject395(module);
  }

  public static HeavyMultibindingModule_ProvideObject395Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject395Factory(module);
  }

  public static Object provideObject395(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject395());
  }
}
